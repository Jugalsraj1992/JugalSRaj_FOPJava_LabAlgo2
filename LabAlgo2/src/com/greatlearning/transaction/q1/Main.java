package com.greatlearning.transaction.q1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Transaction tnsctn = new Transaction();
		Scanner sc =new Scanner(System.in);
		//System.out.println(Integer.MAX_VALUE);
		System.out.println("enter the size of transaction array");	
		int size = sc.nextInt();
		int[] transactions = new int[size];
		System.out.println("enter the values of array");
		for (int i=0;i<size;i++) {
			transactions[i]=sc.nextInt();
		}
		System.out.println("enter the total no of targets that needs to be achieved");
		int targetSize = sc.nextInt();
		
		for(int i=0;i<targetSize;i++) {
			System.out.println("enter the value of target");
		int target = sc.nextInt();
		int res = tnsctn.targetCheck(transactions,target);
		
		if(res>=0) {
			System.out.println("Target acheived after "+ (int) (res + 1) + " transactions");
			System.out.println();
			}else {
			System.out.println("Given target is not achieved");
			}
		}	
		sc.close();
	}
}
