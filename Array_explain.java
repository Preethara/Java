package com.codetodevop.javaoopsconcept;
import java.util.*;

public class Array_explain {
	public static void main(String[] args) {
		// Array_explain obj = new Array_explain();
		arraypackage arr_obj = new arraypackage();
		arr_obj.array_package_details();
		Scanner sc = new Scanner(System.in);
		// static array
		int num[] = { 3, 7, 2, 4 };
		// to chane the array value
		num[1] = 89;
		System.out.println(num[1]);

		// dynamic array
		int num1[] = new int[4];
		for (int i = 0; i <= 3; i++)
			System.out.println(num1[i]);

		// multidimensional array
		// int arr[3][3] = {9,0,3,4,5,6,6,2,1};
		int arr[][] = new int[3][4];
		// the big array = first[] is no.of arrays we have
		// the small array = second[] is no.of array values we have in that arrays
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				arr[i][j] = sc.nextInt(); // getting i/p from user
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}
		sc.close();
	}

}

class arraypackage {

	public void array_package_details() {
		int array[][] = new int[3][4];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				array[i][j] = (int) (Math.random() * 10);
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		for (int ar[] : array) { // enhanced for loop which having single arr
			for (int br : ar) {
				System.out.print(br + "	");
			}
			System.out.println();
		}
	}
}
