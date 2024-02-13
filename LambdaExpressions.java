package com.codetodevop.javaoopsconcept;

interface AI
{
	void show();
}
interface BI
{
	int addition(int n1, int n2);
}

public class LambdaExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Normal method of anonymous inner class implementing interface
		
		AI Aobject = new AI()
				{
					public void show() {
						System.out.println("In anonymous inner class show method using normal method");				}
				};
		Aobject.show();
//		using lambda expression to simplify the code
		
		AI Aobject1 = () -> System.out.println("In anonymous inner class show method using lambda expression");
		Aobject1.show();
//		Normal method of anonymous inner class implementing interface with return type method
		
		BI Bobject = new BI()
				{
					public int addition(int n1, int n2)
					{
						return n1 + n2;
					}
				};
			int result = Bobject.addition(7, 9);
			System.out.println(result);
//		using lambda expression to simplify the code with return type method
		
		BI Bobject1 =  (n1,n2) -> n1+n2;
		int result1 = Bobject.addition(6, 2);
		System.out.println(result1);
//		using lambda expression to simplify the code with return type method and multiple line of code
		
		BI Bobject2 = (n1,n2) -> {
									System.out.println("multiple loc with return type labda expression");
									return n1+n2;
								};
			int result2 = Bobject2.addition(7, 3);
			System.out.println(result2);
		}
		
	}


