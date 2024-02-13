package com.codetodevop.javaoopsconcept;
/* 				final keyword
 * 			--> to mention classes, variables, methods
 * 			--> to declare constant values for a variable
 */
public class FinalKeyword {
	public static void main(String []args)
	{
		final String MyQualification = "BE"; 
		Final fin = new Final();
		fin.show();
		Finale fale = new Finale();
		fale.show();
	}
}
//Final method
//Can't able to create same method in another class
//Stops overriding
class Final
{
	public final void show()
	{
		System.out.println("In final void method");
	}
}
final class Finale
{
	public void show()
	{
		String str = "My name is robot";
		System.out.println(str + "\nIn finale Class");
	}
}


