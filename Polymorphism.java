package com.codetodevop.javaoopsconcept;

public class Polymorphism {
	public static void main(String args[])
	{
//		Child child = new Child();
//		child.Show();
////		we can create an object for parent type by child object
//		Parent child1 = new Child();
////		here the code explains
////		Parent and child have some common characters which is inherited from parent to child
////		so we can able to create an object for parent using child class
////		it refers Parent type of child
//		GrandParent  child2 = new Child();
////		we have able to create grand parent type of child object
		
		
		GrandParent gpobj = new GrandParent();
		gpobj.Show();
		
		gpobj = new Parent();
		gpobj.Show();
		
		gpobj = new Child();
		gpobj.Show();
		
								/*	DYNAMIC METHOD DISPATCH */
//		here we have same obj but assining with different extended classes
//		it is inly worked with inherited classes 
//		not in normal class because it is extends their features so we can able to use single object for multiple extended classes 
	}
}
class GrandParent
{
	public void Show()
	{
		System.out.println("in Grand Parent Show method");
	}
}
class Parent extends GrandParent
{
	public void Show()
	{
		System.out.println("in Parent Show method");
	}
}
class Child extends Parent
{
	public void Show()
	{
		System.out.println("in Child Show method");
	}
}