package com.drupalpoc.api.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.drupalpoc.api.model.Course;
import com.drupalpoc.api.model.Courses;


@Service("courseService")
public class CourseService {
	

	public Courses getFacultyNewCourses() {
		Courses coursenames = new Courses();
		List<String> courselist = new ArrayList<>();
		courselist.add("Check Facutly readiness at Capella");
		courselist.add("Lecturers and Professors group");
		courselist.add("List your Department profile");
		courselist.add("Download Capella mobile app");
		coursenames.setCourses(courselist);
		return coursenames;
	}

	
	public Courses getFacultyGraduateCourses() {
		Courses coursenames = new Courses();
		List<String> courselist = new ArrayList<>();
		courselist.add("Graduate & Commencement information");
		courselist.add("Faculty remuneration and benefits");
		courselist.add("Promotion to Professor");
		coursenames.setCourses(courselist);
		return coursenames;
	}

	public Courses getStudentNewCourses() {
		Courses coursenames = new Courses();
		List<String> courselist = new ArrayList<>();
		courselist.add("MBA6164 International Finance Management");
		courselist.add("MBA7893 UK Finance");
		coursenames.setCourses(courselist);
		return coursenames;
	}

	
	public Courses getStudentGraduateCourses() {
		Courses coursenames = new Courses();
		List<String> courselist = new ArrayList<>();
		courselist.add("MBA-FP6987 Global Economic Environment");
		courselist.add("MBA-FP6008 Leadership Values");
		courselist.add("MBA-FP6008 Leadership Values");
		courselist.add("MBA-FP7007 Confluence");
		coursenames.setCourses(courselist);
		return coursenames;
	}
	
	public Course getDissertationCourse() {
		Course coursedetails = new Course();
		coursedetails.setCourseCode("MBA6555");
		coursedetails.setCourseName("Wealth Management");
		coursedetails.setCourseProperties("Section 7 | Jun 19 2018 - Sep 2018");
		coursedetails.setCourseUser("Mark Venkat");
		coursedetails.setCourseLocation("Tampa, Fl");
		return coursedetails;
	}

	


	

}
