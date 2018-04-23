package com.drupalpoc.api.configuration;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Initialized Configuration to load the swagger.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

	private static final String REST_BASE_PACKAGE = "com.drupalpoc.api.controller";
	private static final String API_CONTACT = "ALTEN Calsoft Labs";
	private static final String API_NAME = "Drupal POC API";
	private static final String API_DESCRIPTION = "API for accessing liferay resources";
	private static final String API_VERSION = "v1.0";
	private static final String API_TERMS = "Terms of service";

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage(REST_BASE_PACKAGE)).paths(PathSelectors.any()).build()
				.apiInfo(apiInfo());
	}

	@SuppressWarnings("rawtypes")
	private ApiInfo apiInfo() {
		Contact contact = new Contact(API_CONTACT, "", "");
		ApiInfo apiInfo = new ApiInfo(API_NAME, API_DESCRIPTION, API_VERSION, API_TERMS, contact, "", "",
				new ArrayList<VendorExtension>());
		return apiInfo;
	}
}
