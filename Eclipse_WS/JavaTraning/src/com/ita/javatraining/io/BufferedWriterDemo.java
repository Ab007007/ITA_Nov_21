package com.ita.javatraining.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

public static void main(String[] args) {
		
		File f = new File("dummy.txt");
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try
		{
			fw = new FileWriter(f, true);
			bw = new BufferedWriter(fw);
			bw.write("Hello all my new Bufferd writer demo ");
		}catch(FileNotFoundException ex)
		{
			System.out.println("File not found!!!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				bw.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Check dummy.txt for the new line");
	}
}
