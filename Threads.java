package com.codetodevop.javaoopsconcept;
public class Threads {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			A object1 = new A();
			B object2 = new B();
			object1.start();
			object2.start();
	}
}
class A extends thread {
	public void run()
	{
		System.out.println("In Class A show method");
	}
}
class B extends thread{
	public void run()
	{
		System.out.println("In Class B show method");
	}
}
