package com.codetodevop.javaoopsconcept;

public class StringConcepts {
	public static void main(String[] args) {
		StringConcepts str_con = new StringConcepts();
		// basic
		String s1 = new String("Preetha"); // basic way of creating a string variable
		String s2 = "Data";
		String s3 = "Data";
		s1 = s1 + " Mohanraj";
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());// to know the heap memory address
		System.out.println(s1);

		StringBuffer sb = new StringBuffer("Kaashnika");// capacity may varies by the str length but const allocation is
														// 16
		System.out.println(sb.capacity());
		String str = sb.toString();// to convert string buffer to string
		System.out.println(sb.append(" Mohanraj"));
		System.out.println(sb.charAt(10));
		sb.setLength(90);
		// string buffer is thread safe but string buffer is not like that
	}
}