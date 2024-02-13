package com.codetodevop.javaoopsconcept;
import java.util.Scanner;

class cons_exer {
	private String Myname;
	private String MyQualification;

	public cons_exer() {
		Myname = "preetha";
		MyQualification = "BA";
		System.out.println("IN default Constructor");
	}

	public cons_exer(String name, String qualify) {
		Myname = name;
		MyQualification = qualify;
		System.out.println("In parameterized consructor");
	}

	public String getMyname() {
		return Myname;
	}

	public void setMyname(String myname) {
		Myname = myname;
	}

	public String getMyQualification() {
		return MyQualification;
	}

	public void setMyQualification(String myQualification) {
		MyQualification = myQualification;
	}
}

class this_key { // super class
	public this_key() {
		System.out.println("In default construtor this_key");
	}

	public this_key(int n) {
		System.out.println(n + "\t In parameterized this_key");
	}
}

class super_key extends this_key { // sub class
	public super_key() {
//		super(10);
		System.out.println("In default construtor super_key");
	}

	public super_key(int k) {
//		super(8);
		System.out.println(k + "\t In parameterized construtor this_key");
	}

}

//	ananymous object in java
class ananymous {
	public ananymous() {
		System.out.println("ananymous object called this constructor");
	}
}

public class Constructor {
	public static void main(String[] args) {
		Scanner sc_var = new Scanner(System.in);

		// constructor part
		String S_name = sc_var.nextLine();
		String S_Qual = sc_var.nextLine();
		cons_exer cs = new cons_exer(); // user input for a constructor
		cs.setMyname(S_name);
		cs.setMyQualification(S_Qual);
		cons_exer cs1 = new cons_exer("siva", "MCA");// parameterized constructor
		cons_exer cs2 = new cons_exer(); // default constructor
		System.out.println(cs.getMyname() + "	" + cs.getMyQualification());
		System.out.println(cs1.getMyname() + "	" + cs1.getMyQualification());
		System.out.println(cs2.getMyname() + "	" + cs2.getMyQualification());

		// this and super method
//		undo the comment and run each and understand
//		super_key sk = new super_key();
		super_key sk1 = new super_key(10);
		// to include params this key constructor part make super method value as
		// parameterized

//		ananymous object in java
		new ananymous();
		sc_var.close();
	}
}
