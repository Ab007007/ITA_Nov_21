package com.ita.javatraining.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderClassDemo {

	public static void main(String[] args) {
		File f = null;
		FileReader fr = null;
		BufferedReader br = null;
		try {
			f = new File("dummy.txt");
			fr = new FileReader(f);
			
			br = new BufferedReader(fr);
			String line = null;
			while((line = br.readLine()) != null)
			{
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found!!!");
		} catch (IOException e) {
			System.out.println("Error while Writing to file");
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}