package com.hand.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.hand.Model.Customer;

public class LoginInterceptor extends HandlerInterceptorAdapter {
    @Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		String URI = request.getRequestURI();
	
		 Customer c=(Customer)request.getSession().getAttribute("c");
         System.out.println(URI);
        if (c!= null)
           {
           return true ;
           }
           else if(URI.indexOf("login")>0)
          {
           return true ;
          }
           else
           {
                 response.sendRedirect("../login.jsp") ;
           }
           return false ;
	}
}
