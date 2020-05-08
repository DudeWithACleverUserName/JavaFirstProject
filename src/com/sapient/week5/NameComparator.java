package com.sapient.week5;

import java.util.Comparator;

public class NameComparator implements Comparator<StudentPOJO> {

	@Override
	public int compare(StudentPOJO o1, StudentPOJO o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
