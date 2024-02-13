package com.codetodevop.javaoopsconcept;
class Mobile {
	String Brand;
	int Price;
	static String name;

	public void show_details() {
		System.out.println(Brand + "	:	" + Price + "	:	" + name);
	}

	public static void show(Mobile obj) { // Static method can't allow local variable values directly
		System.out.println("Static Method");
		System.out.println(obj.Brand + "	:	" + obj.Price + "	:	" + name);
	}
}

class staticblock {
	static {
		System.out.println("In static Block");
	}

	public staticblock() {
		System.out.println("In Constructor block");
	}
}

class Encapsulation {
	private String MyName; // can't use this var directly by obj
	private int MyAge;

	public String getName() {
		return MyName;
	}

	public int getAge() {
		return MyAge;
	}

	public void setName(String name) {
		MyName = name;
	}

	public void setAge(int age) {
		MyAge = age;
	}
}

public class StaticVariable {
	public static void main(String[] args) throws ClassNotFoundException 
	{
		Mobile Mob1 = new Mobile();
		Mob1.Brand = "Apple";
		// Mob1.name = "Smart Phone";
		Mob1.Price = 15000;

		Mobile Mob2 = new Mobile();
		Mob2.Brand = "Samsung";
		// Mob2.name = "Smart Phone";
		Mob2.Price = 18000;

		Mobile.name = "Smartphone";
		Mob1.show_details();
		Mob2.show_details();

		Mobile.show(Mob1);// by passing the values of an object we can access local variables

		// class loading without obj
		// it only loads the static block
		Class.forName("staticblock");
		staticblock st_obj = new staticblock();
		// st_obj.staticblock();

		Encapsulation en_obj = new Encapsulation();
		en_obj.setName("Kaashnika");
		en_obj.setAge(3);
		System.out.println(en_obj.getName() + ":" + en_obj.getAge());
		System.out.println(en_obj.getName() + ":" + en_obj.getAge());
	}

}
