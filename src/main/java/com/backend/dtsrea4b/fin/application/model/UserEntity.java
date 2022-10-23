package com.backend.dtsrea4b.fin.application.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserEntity {

	
	private String id;
	private String username, password, createdby;
	
}
