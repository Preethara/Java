package com.codetodevop.javaoopsconcept;

public class WrapperClass {

	public static void main(String[] args) {
		int num1 = 9;
		Integer number1 = 8;
//		Every primitive data type have a Object Class is called Wrapper class 
		Integer number2 = num1;
//		Auto boxing  = Converting primitive to object type variable
		int num2 = number1;
//		Auto Un-boxing  = Converting Object type to primitive type variable
		
		String  str1 = "7";
		int num3 = Integer.parseInt(str1);
//		using wrapper class and its method to convert string to int
//		we have to remember that String is also a class
		System.out.println(num3 * 6);
//		after conversion we can perform operations
		
		String str2  = "A";
		int num4 = Integer.parseInt(str2);
		System.out.println(num4);
//		we can't able to convert string to int when we have character value in it
//		when we have integer at string value we can able to change
	}

}

