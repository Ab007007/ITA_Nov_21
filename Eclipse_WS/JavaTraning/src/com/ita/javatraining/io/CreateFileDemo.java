package com.ita.javatraining.io;

import java.io.File;
import java.io.IOException;

public class CreateFileDemo {

		public static void main(String[] args) throws IOException {
			File f = new File("data\\myNewfile.txt");
			if(!f.exists())
			{
				f.createNewFile();
				System.out.println("New file is created");
			}
			else
			{
				System.out.println("File Already exist");
			}
			System.out.println("Absolute file path  " + f.getAbsolutePath());
			System.out.println("Can Read : " + f.canRead() );
			System.out.println("Can Write : " + f.canWrite() );
			System.out.println("Can Execue : " + f.canExecute() );
			System.out.println("Size " + f.length());
			System.out.println("Directory : " + f.isDirectory());
			System.out.println("File : "  +f.isFile());
		}
}
