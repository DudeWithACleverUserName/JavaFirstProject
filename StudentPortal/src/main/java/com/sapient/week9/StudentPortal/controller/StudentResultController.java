package com.sapient.week9.StudentPortal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sapient.week9.StudentPortal.model.StudentProfile;
import com.sapient.week9.StudentPortal.service.DisplayResultService;

@Controller
public class StudentResultController {

	@Autowired
	DisplayResultService resultService;

	@GetMapping("/")
	public String homePage() {
		return "HomePage";
	}

	@PostMapping("/")
	public String resultPage(ModelMap model, @RequestParam int rollNo) {

		StudentProfile foundStudent = resultService.findStudentByRollNo(rollNo);
		if (foundStudent == null) {

			model.put("errorMessage", "Entered ID not found!!");
			return "HomePage";

		}

		model.put("rollNo", foundStudent.getRollNumber());
		model.put("name", foundStudent.getName());
		model.put("marks", foundStudent.getMarks());
		model.put("grade", foundStudent.getGrade());

		return "StudentResult";
	}

}
