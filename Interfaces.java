package com.codetodevop.javaoopsconcept;

public class Interfaces {

	public static void main(String[] args) {
		Developer preetha = new Developer();
//		interfaces is not a class we can't create a object for it we can able create references like below
		Computer laptop = new Laptop();
		Computer desk = new Desktop();
		preetha.devApp(laptop);		
//		directly call by interface name because it is static 
		System.out.println(B.str);
//		from the implemented class object we can call all methods
		X obj = new X();
		obj.config();
		obj.show();
		obj.run();
	}

}

class Developer
{
	public void devApp(Computer computer)
	{
		System.out.println("Coding");
		computer.code();
	}
}
//	interface must have collection of declared methods
interface Computer 
{
	void code();
}
class Laptop implements Computer
{
	public void code() {
		System.out.println("Code, Compile, run");
	}
}
class Desktop implements Computer
{
	public void code() 
	{
		System.out.println("Code, compile, run, faster");
	}
}
interface A
{
	void show();
}
interface B extends A
{
	void run();
//	every variable in interface must be instantiated because it is final and static
//	it doesn't have any seperate memory in heap memory
//	those variable can't be updated in main class
	String str = "Run";
}
interface C
{
	void config();
}
class X implements B,C
{
	public void show() {
		System.out.println("in class X show");
	}
	public void config() {
		System.out.println("in class X config");
	}
	public void run() {
		System.out.println("In class X run");
	}
	
}
