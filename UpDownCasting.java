package com.codetodevop.javaoopsconcept;

public class UpDownCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent1 p_obj;
		p_obj = (Parent1) new Child1();
		p_obj.show1();
//		upcasting because we are changing the type of child to parent 
//		we go to super class type
		
		Child1 c_obj = (Child1) p_obj;
		c_obj.show2();
//		Downcasting because we are creating an child reference and changing the parent type to child
//		going backward  parent reference to child 
		
		
	}

}
class Parent1 {
	public void show1() {
		System.out.println("In Parent show");
	}
}
class Child1 extends Parent1{
	public void show2() {
		System.out.println("In Child Show");
	}
}