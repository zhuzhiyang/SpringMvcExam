package com.hand.Controller;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hand.Model.Actor;
import com.hand.Model.Address;
import com.hand.Model.Customer;
import com.hand.Service.AddressService;
import com.hand.Service.CustomerService;
import com.hand.Service.PaymentService;

import com.hand.Service.RentalService;
import com.hand.dao.ActorMapper;
import com.hand.dao.CustomerMapper;
import com.hand.util.Page;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Controller
@RequestMapping("/customerController")
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	@Autowired
	private AddressService addressService;
	@Autowired	
    private PaymentService paymentService;
    @Autowired
    private RentalService rentalService;

	@RequestMapping("/login")
	public ModelAndView Login(String username,String password,HttpServletRequest request) throws Exception {
		ModelAndView  mav=new ModelAndView("error");
		List<Customer> customers=customerService.selectCustomers();
		for(int i=0;i<customers.size();i++)
		{
		  Customer c=customers.get(i);
		  if(c.getFirstName().equals(username))
		  {    
			
			  request.setAttribute("username", c.getFirstName());
			  request.getSession().setAttribute("c", c);
			  mav.addObject("username", c.getFirstName());
			  mav=new ModelAndView("menu");
		  }
		}
		return mav;
	}
	@RequestMapping("/loginout")
	public ModelAndView Loginout(HttpServletRequest request) throws Exception {
		ModelAndView  mav=new ModelAndView("loginout");
		HttpSession s=request.getSession();
		s.invalidate();
		return mav;
	}
	@RequestMapping("/TogetCustomerList")
	public ModelAndView TogetCustomerList(HttpServletRequest request) throws Exception {
		ModelAndView  mav=new ModelAndView("CustomerList");
		int Now=Integer.parseInt(request.getParameter("pageNow"));
		if(Now==0)
		{
			Now=1;
		}
		else if(Now>60)
		{
			Now=60;
		}
		System.out.println(Now);
		Integer Count=customerService.selectCustomersCount();
		 
		    Integer  pageCount=Count/10;
		    mav.addObject("pageCount", pageCount);
		    mav.addObject("Count", Count);
		    mav.addObject("pageNow", Now);
		return mav;
	}
	@RequestMapping("/getCustomerList")
	public void getActorsJson(HttpServletRequest request,HttpServletResponse response) throws Exception {
		PrintWriter out = response.getWriter();
		ModelAndView  mav=new ModelAndView("ActorList");
		Page page=new Page();
		int pagenow=Integer.parseInt(request.getParameter("pageNow"));
		if(pagenow!=0&&pagenow!=1)
		{
			page.setPageNow(pagenow);
		}
		List<Customer> customers=customerService.selectCustomersByPage(page);
		JSONArray JsonArray = new JSONArray();
		JSONObject Json = new JSONObject();
		Json.put("list1", customers);
		JsonArray.add(0, Json);
		out.write(JsonArray.toString());
		System.out.println(JsonArray.toString());
		out.flush();
		out.close();
	} 
	@RequestMapping("/ToaddCustomer")
	public ModelAndView ToaddCustomer(HttpServletRequest request) throws Exception {
		ModelAndView  mav=new ModelAndView("addCustomer");
		List<Address> addresss=addressService.selectAddress();
		mav.addObject("addresss", addresss);
		return mav;
	}
	@RequestMapping("/addCustomer")
	public ModelAndView addCustomer(String firstname,String lastname,String email,String addressid,HttpServletRequest request) throws Exception {
		ModelAndView  mav=new ModelAndView("/ToaddCustomer");
		int addressIds=Integer.parseInt(addressid);
		Short addressId=(short) addressIds;
		Customer c=new Customer();
		c.setAddressId(addressId);
		c.setFirstName(firstname);
		c.setLastName(lastname);
		c.setEmail(email);
		customerService.insertSelective(c);
		//mav.addObject("addresss", addresss);
		return mav;
	}
	@RequestMapping("/updateCustomer")
	public void updateCustomer(String firstname,String lastname,String email,String addressid,String customerid,HttpServletRequest request,HttpServletResponse response) throws Exception {
		PrintWriter out = response.getWriter();
		int addressIds=Integer.parseInt(addressid);
		Short addressId=(short) addressIds;
		int customerids=Integer.parseInt(customerid);
		Short customerId=(short) customerids;
		Customer c=new Customer();
		c.setAddressId(addressId);
		c.setFirstName(firstname);
		c.setLastName(lastname);
		c.setEmail(email);
		c.setCustomerId(customerId);
		customerService.updateByPrimaryKeySelective(c);
		JSONArray JsonArray = new JSONArray();
		JSONObject Json = new JSONObject();
		Json.put("c", c);
		JsonArray.add(0, Json);
		out.write(JsonArray.toString());
		out.flush();
		out.close();
		
	}
	@RequestMapping("/deleteCustomer")
	public void deleteCustomer(String customerid,HttpServletRequest request,HttpServletResponse response) throws Exception {
		PrintWriter out = response.getWriter();
		int customerids=Integer.parseInt(customerid);
		Short customerId=(short) customerids;
		rentalService.deleteRental(customerids);
		paymentService.deletePayment(customerids);
		customerService.deleteByPrimaryKey(customerId);
		JSONArray JsonArray = new JSONArray();
		JSONObject Json = new JSONObject();

		JsonArray.add(0, Json);
		out.write(JsonArray.toString());
		out.flush();
		out.close();
		
	}
	@RequestMapping("/getCustomer")
	public void getCustomer(HttpServletRequest request,HttpServletResponse response) throws Exception {
		PrintWriter out = response.getWriter();
		int customerid=Integer.parseInt(request.getParameter("customerid"));
		Short customerId=(short) customerid;
		Customer c=customerService.selectByPrimaryKey(customerId);
		List<Address> addresss=addressService.selectAddress();
		JSONArray JsonArray = new JSONArray();
		JSONObject Json = new JSONObject();
		JSONObject Json1 = new JSONObject();
		Json.put("list1", addresss);
		Json1.put("customer", c);
		JsonArray.add(0, Json);
		JsonArray.add(1, Json1);
		out.write(JsonArray.toString());
		System.out.println(JsonArray.toString());
		out.flush();
		out.close();
		
	}
	public CustomerService getCustomerService() {
		return customerService;
	}

	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}
	public AddressService getAddressService() {
		return addressService;
	}
	public void setAddressService(AddressService addressService) {
		this.addressService = addressService;
	}
	public PaymentService getPaymentService() {
		return paymentService;
	}
	public void setPaymentService(PaymentService paymentService) {
		this.paymentService = paymentService;
	}
	public RentalService getRentalService() {
		return rentalService;
	}
	public void setRentalService(RentalService rentalService) {
		this.rentalService = rentalService;
	}
	
}
