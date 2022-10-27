package com.backend.dtsrea4b.fin.application.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;

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

import com.backend.dtsrea4b.fin.application.model.Other;
import com.backend.dtsrea4b.fin.application.model.User;
import com.backend.dtsrea4b.fin.application.service.OtherService;

@RestController
@RequestMapping("/other")
public class OtherController {

	private static Logger logger = LogManager
			.getLogger(com.backend.dtsrea4b.fin.application.controller.OtherController.class);
	String username = "API_user";
	@Autowired
	OtherService otherService;
	
	
	@RequestMapping(name = "other", path = "/other", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Map<String, Object> getid(HttpServletRequest request, @RequestParam("id") Integer id) {
		logger.info(true);
		long startTime = System.nanoTime();
		Map<String, Object> respon = new HashMap<>();
		try {
			Optional<Other> listOptional;

			listOptional = otherService.getSelectedid(id);
			respon.put("Data", listOptional);

			return respon;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return respon;

	}
	
	@RequestMapping(name = "other", path = "/hottopics", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Map<String, Object> gethot(HttpServletRequest request) {
		logger.info(true);
		long startTime = System.nanoTime();
		Map<String, Object> respon = new HashMap<>();
		try {
			Other listOptional;

			List<Other> listhottopics=new ArrayList<Other>();
			listhottopics=otherService.getSelectedall();
			 
			Random rand = new Random();
			listOptional = listhottopics.get(rand.nextInt(listhottopics.size()));
			
//			String content=listOptional.getContent().substring(0, 100);
//			listOptional.setContent(content);
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
	public Map<String, Object> other(HttpServletRequest request, @RequestBody Other other) {
		logger.info(true);
		Map<String, Object> respon = new HashMap<>();
		try {
			long startTime = System.nanoTime();
			other.setId(null);
			
			Optional<Other> cekOther=otherService.getTitle(other.getJudul());
			if(cekOther.isPresent()){
				respon.put("Status", HttpStatus.PRECONDITION_FAILED);
				throw new ResponseStatusException(HttpStatus.PRECONDITION_FAILED, "Judul sudah ada ");
			}
			
			Integer x = otherService.insertNew(other, username);
			if (x == 0) {
			} else {
			}

			respon.put("Data", other);

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
			List<Other> listall = new ArrayList<>();

			listall = otherService.getSelectedall();
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
	public Map<String, Object> deleteProduct(HttpServletRequest request, @RequestBody Other other) {
		long startTime = System.nanoTime();
		Map<String, Object> respon = new HashMap<>();
		try {

			Integer x = otherService.update(other, "delete", username);
			if (x == 0) {
			} else {
			}
			respon.put("Data", other);
			return respon;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return respon;
	}

	@RequestMapping(name = "other", path = "/update", method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Map<String, Object> updateProduct(HttpServletRequest request, @RequestBody Other other) {
		logger.info(true);
		long startTime = System.nanoTime();
		Map<String, Object> respon = new HashMap<>();
		try {
			Integer x = otherService.update(other, "edit", username);
			if (x == 0) {
			} else {
			}
			respon.put("Data", other);

			return respon;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
