package com.codetodevop.javaoopsconcept;

public class AbstractInnerClassConcept {
	public static void main(String[] args) {
//		Create object for class outer
		Outer outer_object = new Outer();
//		create object for inner class
		Outer.Inner inner_object = outer_object.new Inner();
//		creating object for static sub inner class
		Outer.SubInnerClass sub_inner_object = new Outer.SubInnerClass();
		outer_object.outerClassMethod();
		inner_object.innerMethod();
		sub_inner_object.showSubInnerClassMethod();
		
//		Anonymous Inner Class
		Outer outer_object1 = new Outer()
				{
//			to create anonymous inner class we use method overriding we must have same method in class also
					public void outerClassMethod() {
						System.out.println("In Anonymous Inner Class");					}
				};
		outer_object1.outerClassMethod();
//		 combine abstract and anonymous inner class
		 AbstractClass abs_obj = new AbstractClass()
				 {
			 		public void clarify() {
			 			System.out.println("In abstract class and anonymous inner class clarify method");
			 		}
					public void newShowMethod() {
						System.out.println("In abstract class and anonymous inner class newShowMethod");
					}
				 };
		abs_obj.newShowMethod();
		abs_obj.clarify();
//		abstract class implementation
		InheritedAbstractClass iac1= new InheritedAbstractClass();
		iac1.addition();
		iac1.subtraction();
	}
}



class Outer
{
	class Inner
	{
		public void innerMethod() {
			System.out.println("In inner class method");
		}
	}
	public void outerClassMethod() {
		System.out.println("In Outer class method");
	}
	static class SubInnerClass{
		public void showSubInnerClassMethod() {
		System.out.println("in Static Sub Inner Class");
		}
	}
}
abstract class AbstractClass
{
	public abstract void newShowMethod();
	public abstract void clarify();
}

abstract class NewAbstractClass
{
	public abstract void addition();
	public void subtraction() {
		int number1 = 1000;
		int number2 = 999;
		System.out.println(number1 - number2);
	
	}
}
class InheritedAbstractClass extends NewAbstractClass
{
	public void addition() {
		int num1 = 1000;
		int num2 = 99;
		System.out.println(num1 + num2);
	}
	
}

