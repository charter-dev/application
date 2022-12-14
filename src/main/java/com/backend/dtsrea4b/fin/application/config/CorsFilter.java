package com.backend.dtsrea4b.fin.application.config;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CorsFilter implements Filter {

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
			throws IOException, ServletException {
			HttpServletResponse response = (HttpServletResponse) servletResponse;
	        HttpServletRequest request= (HttpServletRequest) servletRequest;

	        response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
	        response.setHeader("Access-Control-Allow-Methods", "GET,POST,DELETE,PUT,OPTIONS");
//	        response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
	        response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept, Key, Authorization");
	        response.setHeader("Access-Control-Allow-Credentials", "true");
	        response.setHeader("Access-Control-Max-Age", "3600");
	        response.setHeader("access-control-expose-headers", "Authorization");
	        response.setHeader("Authorization", "Bearer ");
//	        filterChain.doFilter(servletRequest, servletResponse);
	        
	        System.out.println("Testing.........................");
	        if ("OPTIONS".equalsIgnoreCase(request.getMethod())) {
	            response.setStatus(HttpServletResponse.SC_OK);
	        } else {
	            filterChain.doFilter(request, response);
	        }
		
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
	}

	@Override
	public void destroy() {
		
	}

}
