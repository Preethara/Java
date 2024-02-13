package com.codetodevop.javaoopsconcept;

enum Status
{
	Running, OnProcess, Failed, Success;
}

//how to create constructor , methods, variables in enum

enum Computers
{
	Laptop(20000), Desktop(30000), Tablet(12000), SmartPhone;
	
	private int price;
//	parameterized constructor
	private Computers (int p){
		this.price = p;
	}
//	default constructor
	
	private Computers() {
		price = 500;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}

public class EnumClass {
	public static void main(String[] args) {
//		to create a object reference for enum
			Status S = Status.Running;
//		to print the constant values/object from enum class
			System.out.println(S);
//		to get index values of the constants
			System.out.println(S.ordinal());
//		to get the super class which is defaultly inherited by enum class
			System.out.println(S.getClass().getSuperclass());
//		to print all the constant that we mentioned above
			Status[] Arr = Status.values(); //predefined method to get all values
			for(Status A : Arr) {
				System.out.println(A + " :	" + A.ordinal());
			}
//		to compare the values and return a comment using swtich and if statement
//		S gets the value from the line 11
			switch (S)
			{
				case Running :
					System.out.println("All Good, Go ahead for another");
					break;
				case OnProcess :
					System.out.println("Please wait sometime");
					break;
				case Failed :
					System.out.println("Try again");
					break;
				default :
					System.out.println("All Done");
			}
//			if statement 
			if (S == Status.Running)
				System.out.println("All Good, Go ahead for another");
			else if (S == Status.OnProcess)
				System.out.println("Please wait sometime");
			else if (S == Status.Failed)
				System.out.println("Try again");
			else 
				System.out.println("All Done");
//	from enum computer
			Computers Com = Computers.Laptop;
			System.out.println("Computer Name : " + Com + ",	Price : " + Com.getPrice());
//			create array variable
			Computers[] CS = Computers.values();
			for (Computers C : CS ) {
					System.out.println("Computer Name : " + C + ",	Price : " + C.getPrice()); 
			}		
//		instead of creating array variable 
			for (Computers COM : Computers.values())
			{
				System.out.println(COM);
			}
	}

}