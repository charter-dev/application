package com.backend.dtsrea4b.fin.application.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.backend.dtsrea4b.fin.application.model.User;
import com.backend.dtsrea4b.fin.application.model.userlogin;
import com.backend.dtsrea4b.fin.application.service.UserService;

@RestController
@RequestMapping("/user")
public class userController {

	private static Logger logger = LogManager
			.getLogger(com.backend.dtsrea4b.fin.application.controller.userController.class);
	@Autowired
	UserService userServicess;

	String username = "API_user";

	
	@RequestMapping(name = "other", path = "/user", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Map<String, Object> getid(HttpServletRequest request, @RequestParam("id") Integer id) {
		logger.info(true);
		long startTime = System.nanoTime();
		Map<String, Object> respon = new HashMap<>();
		try {
			Optional<User> listOptional;

			listOptional = userServicess.getSelectedid(id);
			respon.put("Data", listOptional);

			return respon;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return respon;

	}
	
	@RequestMapping(name = "other", path = "/add", method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Map<String, Object> other(HttpServletRequest request, @RequestBody User user) {
		logger.info(true);
		Map<String, Object> respon = new HashMap<>();
		try {
			long startTime = System.nanoTime();
			
			Optional<User> cekuser=userServicess.getusername(user.getUsername());
			if(cekuser.isPresent()){
				respon.put("Status", HttpStatus.PRECONDITION_FAILED);
				throw new ResponseStatusException(HttpStatus.PRECONDITION_FAILED, "Data sudah ada ");
			}
			
			Integer x = userServicess.insertNew(user, username);
			if (x == 0) {
			} else {
			}

			respon.put("Data", user);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return respon;
	}

	@RequestMapping(name = "other", path = "/getall", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Map<String, Object> showProduct(HttpServletRequest request) {
		logger.info(true);
		long startTime = System.nanoTime();
		Map<String, Object> respon = new HashMap<>();
		try {
			List<User> listall = new ArrayList<>();

			listall = userServicess.getSelectedall();
			respon.put("Data", listall);

			return respon;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return respon;

	}

	@RequestMapping(name = "other", path = "/delete", method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Map<String, Object> deleteProduct(HttpServletRequest request, @RequestBody User user) {
		long startTime = System.nanoTime();
		Map<String, Object> respon = new HashMap<>();
		try {

			Integer x = userServicess.update(user, "delete", username);
			if (x == 0) {
			} else {
			}
			respon.put("Data", user);
			return respon;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return respon;
	}

	@RequestMapping(name = "other", path = "/update", method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Map<String, Object> updateProduct(HttpServletRequest request, @RequestBody User user) {
		logger.info(true);
		long startTime = System.nanoTime();
		Map<String, Object> respon = new HashMap<>();
		try {
			Integer x = userServicess.update(user, "edit", username);
			if (x == 0) {
			} else {
			}
			respon.put("Data", user);

			return respon;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@RequestMapping(name = "other", path = "/login", method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Map<String, Object> login(HttpServletRequest request, @RequestBody userlogin userlogin) {
		logger.info(true);
		Map<String, Object> respon = new HashMap<>();
		try {
			long startTime = System.nanoTime();
			Optional<User>  x= userServicess.getuserandpass(userlogin.getUsername(), userlogin.getPassword());

			respon.put("Data", x);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return respon;
	}

}
