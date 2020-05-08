package com.sapient.week5;

import java.util.Comparator;

public class CityComparator implements Comparator<StudentPOJO> {

	@Override
	public int compare(StudentPOJO o1, StudentPOJO o2) {
		// TODO Auto-generated method stub
		return o1.getCity().compareTo(o2.getCity());
	}

}
