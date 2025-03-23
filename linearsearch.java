package com.codetodevop.javaoopsconcept;
import java.util.*;
public class Main {
 public static int search(int[] arr, int key){
    for(int i=1;i<arr.length;i++)
    {
        if(arr[i] == key)
        return arr[i];
    }
        return -1;   
 }
	public static void main(String[] args) {
		int[] arr = {10,5,67,89,505};
		int key = 9;
		int result = search(arr, key);
		System.out.print(result == -1 ? "Not found":"Found at"+result);
		int[] arr1 = new int[10];
		int j;
		Scanner sc = new Scanner(System.in);
		for(j =0;j<arr1.length;j++){
		    arr1[j]=sc.nextInt();
		}
		System.out.println("Enter the key value to search");
		int key1 = sc.nextInt();
		int result1= search(arr1,key1);
		System.out.print(result1 == -1 ? "Not found":"Found at"+result1);
		sc.close();
	}
}