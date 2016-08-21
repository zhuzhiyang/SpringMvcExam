package com.hand.Controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;



import com.hand.Model.Actor;
import com.hand.dao.ActorMapper;
import com.hand.util.Page;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;



@Controller
@RequestMapping("/actorController")
public class ActorController {
	@Autowired
	private ActorMapper actorMapper;
	@RequestMapping("/TogetActors")
	public ModelAndView TogetActors(HttpServletRequest request) throws Exception {
		ModelAndView  mav=new ModelAndView("ActorListJson");
		return mav;
	}
	@RequestMapping("/getActorsJson")
	public void getActorsJson(HttpServletRequest request,HttpServletResponse response) throws Exception {
		PrintWriter out = response.getWriter();
		ModelAndView  mav=new ModelAndView("ActorList");
		Page page=new Page();
	    List<Actor> actors=actorMapper.selectActors(page);
	    JSONArray JsonArray = new JSONArray();
		JSONObject Json = new JSONObject();
		Json.put("list1", actors);// JSONObject对象中添加键值对
		JsonArray.add(0, Json);// 将JSONObject对象添加到Json数组中
		out.write(JsonArray.toString());
		System.out.println(JsonArray.toString());
		out.flush();
		out.close();
	} 
	@RequestMapping("/getActors")
	public ModelAndView getActors(HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		ModelAndView  mav=new ModelAndView("ActorList");
		Page page=new Page();
		int pagenow=Integer.parseInt(request.getParameter("pageNow"));
		if(pagenow!=0&&pagenow!=1)
		{
			page.setPageNow(pagenow);
		}
	    List<Actor> actors=actorMapper.selectActors(page);
	    mav.addObject("pageNow",page.getPageNow());
	   mav.addObject("actors", actors);
	   return  mav;
	} 
	    
	@RequestMapping("/AddActor")
	public ModelAndView AddActor(@RequestParam("file") CommonsMultipartFile file,String firstName,String lastName,String lastUpdate,HttpServletRequest request) throws Exception {
		Timestamp ts = new Timestamp(System.currentTimeMillis());  
		ts = Timestamp.valueOf(lastUpdate);
		String path=request.getRealPath("/image");
		InputStream is=file.getInputStream();
		String[] picturename=file.getOriginalFilename().split("\\.");
		System.out.println(picturename.toString());
		System.out.println(picturename[1]);
		String pic=System.currentTimeMillis()+"."+picturename[1];
		String pictureSavePath = request.getContextPath()+"/image"+pic;
		OutputStream os=new FileOutputStream(new File(path,pic));
		int len=0;
		byte[] buffer=new byte[400];
		while((len=is.read(buffer))!=-1)
		os.write(buffer,0,len);
		os.close();
		is.close();
		Actor a=new Actor();
		a.setFirstName(firstName);
		a.setLastName(lastName);
		a.setLastUpdate(ts);
		actorMapper.insert(a);
		ModelAndView  mav=new ModelAndView("ActorList");
		return mav;
	}
	
}
