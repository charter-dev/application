package com.backend.dtsrea4b.fin.application;

import java.util.Arrays;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@MapperScan(basePackages = {"com.backend.dtsrea4b.fin.application.mapper"})
public class Application {

	
	@Bean
	public WebMvcConfigurer configure() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("*");
			}
			
		};
		
	}
	
	 @Bean
	    public CorsConfigurationSource corsConfigurationSource() {
	        final CorsConfiguration configuration = new CorsConfiguration();
	        configuration.setAllowedOrigins(Arrays.asList("http://localhost:3000", "https://mercury-news.netlify.app" , "https://6358b52b4c7fdb49de4df3fe--gilded-baklava-466c79.netlify.app"));
	        configuration.setAllowedMethods(Arrays.asList("GET", "POST", "OPTIONS"));
	        configuration.setAllowCredentials(true);
	        configuration.setAllowedHeaders(Arrays.asList("*"));
	        configuration.setExposedHeaders(Arrays.asList("x-auth-token", "xsrf-token"));
	        final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
	        source.registerCorsConfiguration("/**", configuration);
	        return source;
	    }
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
