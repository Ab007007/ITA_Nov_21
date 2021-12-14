package com.ita.javatraining.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {
		
		File f = new File("dummy.txt");
		FileOutputStream fos = null;
		
		try
		{
			fos = new FileOutputStream(f, true);
			fos.write("\nMy New Line".getBytes());
		}catch(FileNotFoundException ex)
		{
			System.out.println("File not found!!!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Check dummy.txt for the new line");
	}
}
