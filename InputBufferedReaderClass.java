package com.codetodevop.javaoopsconcept;
import java.io.*;
public class InputBufferedReaderClass {

	public static void main(String[] args)  throws IOException{
		
//		to get input from user
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(input);
//		it prints the ASCII value of the input
		int num1 = bf.read();
		System.out.println(num1);
//		int num = Integer.parseInt(bf.readLine());
		String num = bf.readLine();
		System.out.println(num);
		bf.close();
		TryWithResources twr = new TryWithResources();
		twr.trywithresource();
	}

}

class TryWithResources
{
	public void trywithresource()throws IOException,NumberFormatException
	{
		int number = 0;
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) 
		{
			number = Integer.parseInt(br.readLine());
			System.out.println(number);
		}
	}
}