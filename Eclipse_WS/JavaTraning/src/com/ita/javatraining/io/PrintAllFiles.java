package com.ita.javatraining.io;

import java.io.File;
import java.util.Scanner;

public class PrintAllFiles {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the folder or file name ");
		String name  = sc.next();
		File f = new File(name);
		File files[] = null;
		if(f.isDirectory()) {
			files = f.listFiles();
			for(File file : files) {
				System.out.println(file.getName() + " is present in " + file.getAbsolutePath() + " and its size is " + files.length);
			}
		}
		else {
			System.out.println("Not a directory!!" + f.getAbsolutePath());
		}
	}
}
 