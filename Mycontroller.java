package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseService;

//import org.springframework.web.bind.annotation.*;
@RestController
public class Mycontroller {

	@Autowired
	private CourseService courseSerivice;

	@GetMapping("/home")
	public String home() {

		return "Welcome to courses application";
	}

	// get the courses
	@GetMapping("/courses")
	public List<Course> getCourses() {

		return this.courseSerivice.getCourses();

	}
	
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) 
	{
		
		 return this.courseSerivice.getCourse(Long.parseLong(courseId));
	}
	
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course)
	{
		return this.courseSerivice.addCourse(course);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}