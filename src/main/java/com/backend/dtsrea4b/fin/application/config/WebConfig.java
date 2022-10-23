package com.backend.dtsrea4b.fin.application.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class WebConfig  {
	
	
	@Bean
	CorsFilter corsFilter() {
	    CorsFilter filter = new CorsFilter();
	    return filter;
	}

}
