package com.ita.javatraining.interviewprograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFileDemo {

	public static void main(String[] args) {
	
		File f = null;
		FileInputStream fis = null;
				
		try
		{
			f = new File("dummy.txt");
			fis = new FileInputStream(f);
			int i = fis.read();
			System.out.println((char)i);
			
		}catch (FileNotFoundException e) {
			System.out.println("File not found!!!");
		} catch (IOException e) {
			System.out.println("Error while Writing to file");
		}
		finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
