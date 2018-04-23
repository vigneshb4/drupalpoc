package com.drupalpoc.api.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

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
		courselist.add("Review your readiness at Capella");
		courselist.add("Join discussion and groups");
		courselist.add("Edit your Campus profile");
		courselist.add("Download Capella mobile app");
		coursenames.setCourses(courselist);
		return coursenames;
	}

	
	public Courses getStudentGraduateCourses() {
		Courses coursenames = new Courses();
		List<String> courselist = new ArrayList<>();
		courselist.add("Graduate & Commencement information");
		courselist.add("Alumni Association benefits");
		courselist.add("Career center");
		coursenames.setCourses(courselist);
		return coursenames;
	}

}
