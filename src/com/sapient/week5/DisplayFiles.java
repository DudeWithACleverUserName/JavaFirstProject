package com.sapient.week5;

import java.io.File;

public class DisplayFiles {

	public static void main(String[] args) {
		File folder = new File("E:/eclipseWorkspace");

		String[] files = folder.list();

		for (String file : files) {
			System.out.println(file);
		}
	}

}
