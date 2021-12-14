package com.ita.javatraining.threads;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class SyncMainClass {

	
	public static void main(String[] args) {
		SyncronizedDemo sd = new SyncronizedDemo();
		
		Thread t1 = new Thread(sd);
		Thread t2 = new Thread(sd);
		Thread t3 = new Thread(sd);
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
	}
}
