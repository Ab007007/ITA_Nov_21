package com.ita.javatraining.access.pack2;

import com.ita.javatraining.access.pack1.A;
import com.ita.javatraining.access.pack1.TestInterface;

public class C extends A implements TestInterface
{

	public static void main(String[] args) {
		C a = new C();
	//	A a = new A();
		//System.out.println("Private Member " + privateMember);
		//System.out.println("Default Member " + a.defaultMember);
		System.out.println("Protected Member " + a.protectedMember);
		System.out.println("Public Member " + a.publicMember);
		a.test();
	}

	@Override
	public void test() {
		System.out.println("Author : " + author);
		
	}
}
