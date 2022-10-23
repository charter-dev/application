package com.backend.dtsrea4b.fin.application.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.backend.dtsrea4b.fin.application.model.OtherEntity;
import com.backend.dtsrea4b.fin.application.model.UserEntity;
import com.backend.dtsrea4b.fin.application.service.OtherService;
import com.backend.dtsrea4b.fin.application.service.UserService;

@RestController
@RequestMapping("/user")
public class userController {

	private static Logger logger = LogManager
			.getLogger(com.backend.dtsrea4b.fin.application.controller.userController.class);
	@Autowired
	UserService userService;

	@RequestMapping(name = "user", path = "/add", method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Map<String, Object> insertDataother(HttpServletRequest request, @RequestBody UserEntity userEntity) {
//		String username=GetUsernameFromJWt(request);
//		long startTime = System.nanoTime();
		Map<String, Object> respon = new HashMap<>();
		try {
			logger.info(true);

			userEntity.setId(UUID.randomUUID().toString());
			userService.addDataToCSV(userEntity);

			return respon;
		} catch (

		Exception e) {
			e.printStackTrace();
		}
		return respon;
	}

	@RequestMapping(name = "user", path = "/getall", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Map<String, Object> getDataCategory(HttpServletRequest request) {
		logger.info(true);
		long startTime = System.nanoTime();
		Map<String, Object> respon = new HashMap<>();
		try {
			respon.put("Data", userService.readDataFromCSV());
			return respon;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return respon;

	}

}
