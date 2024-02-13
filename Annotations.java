package com.codetodevop.javaoopsconcept;

public class Annotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bnd object = new Bnd();
		object.showsFromThisClass();
		
	}

}
// here we are adding two numbers but overriding the methods 
//when we using the object of B we have to call the methods from B class but we called A method
//to avoid this confliction we use annotation called @Override
// there are many annotations
class And{
	public void showsFromThisClass() {
		System.out.println("In A show");
	}

	
}
class Bnd extends And
{
	@Override
	public void showsFromThisClass() {
		System.out.println("In B show");
	}
}