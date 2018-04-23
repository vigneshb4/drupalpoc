package com.drupalpoc.api.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.drupalpoc.api.filter.RestServicesFilter;


/*
 * Initializing the configuration for filter and swagger resources.
 */
@Configuration
@EnableWebMvc
@EnableAutoConfiguration
public class ApplicationConfig extends WebMvcConfigurerAdapter {

    public ApplicationConfig() {
        super();
    }

    @Override
    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
    }

    @Bean
    public FilterRegistrationBean restFilterRegistrationBean() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        RestServicesFilter restFilter = new RestServicesFilter();
        registrationBean.setFilter(restFilter);
        registrationBean.setOrder(1);
        return registrationBean;
    }

}
