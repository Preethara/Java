package com.codetodevop.javaoopsconcept;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = 0;
		
//		tries critical statements to run
		try
		{
//			tries an arithmetic exception
			j = 8 / i;
		}
//		if the critical statements gives you an error catch block executes otherwise not
//		Exception is a default class name we can create more objects like we want e,obj., etc
//		exception is a parent class which can handle all type of exception
		catch(Exception e)
		{
			System.out.println("Something goes wrong");
		}
		
		System.out.println(j);
		System.out.println("Executed");
		System.out.println(" ");
		
		MultipleCatchBlock mcb = new MultipleCatchBlock();
		mcb.multicaltch();
//		handling exception from user input
		Exceptions exception = new Exceptions();
		Scanner scanInput = new Scanner(System.in);
		int enumber1 = scanInput.nextInt();
		int enumber2 = scanInput.nextInt();
		exception.UserInputExceptionHandling(enumber1, enumber2);
		
		
		scanInput.close();
	
//throws keyword class 
		ThrowsKeywordExceptionA tkea = new ThrowsKeywordExceptionA();
		ThrowsKeywordExceptionB tkeb = new ThrowsKeywordExceptionB();
		try
		{
			tkea.show1();
		}
		catch(ClassNotFoundException cnfea)
		{
			System.out.println("Make a class\n" + cnfea);
		}
		try
		{
			tkeb.show2();
		}
		catch(ClassNotFoundException cnfeb)
		{
			System.out.println("Make a class\n" + cnfeb);
		}
		
	}

}
class MultipleCatchBlock
{
	public void multicaltch()
	{
		int number0[] = new int[5];
		int number1 = 0;
		int number2 = 0;
		String str = null;
		try
		{
//			Arithmetic exception 
			number2 = 18/number1;
//			java.lang.ArrayIndexOutOfBoundsException
			System.out.println(number0[8]);
//			Null pointer exception
			System.out.println(str.length());
			
		}
	
		/*
		 * Exception is a main class
		 * other exceptions are there inherited classes 
		 * in somewhere we can't give first the exception catch block
		 * when we know the type of exception which creates in try block create that type of catch block
		 */
		catch(ArithmeticException e)
		{
			System.out.println("Can't Divide by zero");
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("Check the limit of an array");
		}
		catch(NullPointerException e)
		{
			System.out.println("String is already null");
		}
		catch(Exception e)
		{
			System.out.println("Something went wrong");
		}

	}
}
class Exceptions
{
	public void UserInputExceptionHandling(int n1,int n2)
	{
		int number1 = n1;
		int number2 = n2;
		int result;
		try 
		{
			result = number1/number2;
			 if (number2 == 0)
				 throw new Exception();
//			throw keyword
			 else if(result == 0)
					throw new ArithmeticException();
			else if (result == 1)
					throw new CustomException();
		}
		catch(ArithmeticException aes)
		{
			result = number1/1;
			System.out.println("It is the default value" + " result = " + result);
			System.out.println(aes);
		}
		catch(CustomException cex)
		{
			System.out.println("MY NEW EXCEPTION ");
		}
		catch(Exception aex)
		{
			System.out.println("Can't divide by zero");
		}
		
	}
}
//creating new exceptions
class CustomException extends Exception
{
	public CustomException(String message)
	{
		super(message);
	}
	public CustomException()
	{
		super();
	}
}

//throws keyword
class ThrowsKeywordExceptionA
{
	public void show1() throws ClassNotFoundException
	{
		Class.forName("Demo");
	}
}
class ThrowsKeywordExceptionB
{
	public void show2() throws ClassNotFoundException
	{
		Class.forName("void");
	}
}