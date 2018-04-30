package com.drupalpoc.api.controller;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.drupalpoc.api.service.CourseService;
import com.drupalpoc.api.service.FinanceService;


@RestController
public class DrupalController {
	
	@Autowired
	private CourseService courseService;

	@Autowired
	private FinanceService financeService;

    @RequestMapping(value = "/faculty/currentcourses", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
    public @ResponseBody Object getFacutlyNewCourses() {
		return courseService.getFacultyNewCourses();
	}

    @RequestMapping(value = "/faculty/previouscourses", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
    public @ResponseBody Object getFacultyGraduateCourses() {
		return courseService.getFacultyGraduateCourses();
	}

    @RequestMapping(value = "/student/graduatecourses", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON)
    public @ResponseBody Object  getStudentGraduateCourses() {
		return courseService.getStudentGraduateCourses();
	}

    @RequestMapping(value = "/student/newcourses", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON)
    public @ResponseBody Object  getStudentNewCourses() {
		return courseService.getStudentNewCourses();
	}
    
    @RequestMapping(value = "/student/dissertationcourse", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON)
    public @ResponseBody Object  getStudentDissertationCourses() {
		return courseService.getDissertationCourse();
	}
    
    
    @RequestMapping(value = "/finance/financialaid", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON)
    public @ResponseBody Object  getFinancialAid() {
		return financeService.getFinancialAid();
	}

    @RequestMapping(value = "/finance/accountsummary", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON)
    public @ResponseBody Object  getAccountSummary() {
		return financeService.getAccountSummary();
	}
    
    
    
}