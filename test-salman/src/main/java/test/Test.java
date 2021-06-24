package test;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	int[] arr;
	static int[] arr1;

	public static void main(String[] arys) {

		int A[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(A.length);	
		
		int length=0;
		for(int i=0;i<Integer.MAX_VALUE;i++) {
			try {
			System.out.println(A[i]);
			length++;
			}catch(Exception e) {
				break;
				
			}
		}
		
	}
}
		
