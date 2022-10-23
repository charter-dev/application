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
import com.backend.dtsrea4b.fin.application.service.OtherService;



@RestController
public class OtherController {

	private static Logger logger = LogManager.getLogger(com.backend.dtsrea4b.fin.application.controller.OtherController.class);
	@Autowired
	OtherService otherService;
	
	@RequestMapping(name = "other", path = "/add", method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Map<String, Object> insertDataother(HttpServletRequest request,@RequestBody OtherEntity otherEntity) {
//		String username=GetUsernameFromJWt(request);
//		long startTime = System.nanoTime();
		Map<String, Object> respon = new HashMap<>();
		try {
			logger.info(true);
			
			otherEntity.setId(UUID.randomUUID().toString());
			otherService.addDataToCSV(otherEntity);

			return respon;
		} catch (

		Exception e) {
			e.printStackTrace();
		}
		return respon;
	}
	
}
