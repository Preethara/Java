package com.codetodevop.javaoopsconcept;

import java.util.Objects;

/** 
 * Every time you print object to will automatically call toString method which is default
 */
public class ObjectClassToString {
	public static void main(String[] args) {
		ObjectToString object = new ObjectToString();
		System.out.println(object.hashCode());
//		we can able to override the predefined methods by the following below code
//		we have to know which datatype will be the output
		System.out.println(object);
//		We can able to override the toString method by below code
		System.out.println(object.getClass());

		Phone phone1 = new Phone();
		phone1.model = "Samsung A23";
		phone1.price = 17000;
		
		Phone phone2 = new Phone();
		phone2.model = "Samsung A23";
		phone2.price = 17000;
		
		System.out.println(phone1.equals(phone2));
		System.out.println(phone1);
		System.out.println(phone2);
	}
}
class ObjectToString
{
	static String str;
	public void objstr() {
		System.out.println("Nothing");
	}
	@Override
	public String toString() {
		return "new";
	}
	
	public int hashCode() {
		return 9876546;
	}
}
class Phone{
	String model;
	int price;
	
/*			to compare the objects we have predefined methods in our IDE
 * 			to get that methods 
 * 			rightclick --> select source --> select generate hashcode() and equals()
 * 			it will check more than we think
 */
	public boolean equals(Phone getValues) {
		return this.model.equals(getValues.model) && this.price == getValues.price;	
	}
	@Override
	public String toString() {
		return "Phone [model=" + model + ", price=" + price + "]";
	}
}