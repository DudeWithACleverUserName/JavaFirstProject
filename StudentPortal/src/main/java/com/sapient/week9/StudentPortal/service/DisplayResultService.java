package com.sapient.week9.StudentPortal.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.sapient.week9.StudentPortal.model.StudentProfile;

@Service
public class DisplayResultService {

	public static Map<Integer, StudentProfile> resultMap = new HashMap<>();

	static {
		resultMap.put(1, new StudentProfile(1, "Jack", 98, 'O'));
		resultMap.put(2, new StudentProfile(2, "Walt", 76, 'B'));
		resultMap.put(3, new StudentProfile(3, "Bailey", 32, 'D'));
		resultMap.put(4, new StudentProfile(4, "Steve", 53, 'C'));
		resultMap.put(5, new StudentProfile(5, "Xavier", 81, 'A'));
	}

	public StudentProfile findStudentByRollNo(int rollNo) {
		return resultMap.get(rollNo);
	}

}
