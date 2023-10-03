package com.greatlearning.denomination.q2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size of currency denominations");
		int size = sc.nextInt();
		int[] denominations= new int[size];
		
		System.out.println("enter the currency denominations value");
		for(int i=0;i<size;i++) {
			denominations[i]=sc.nextInt();
		}
		System.out.println("enter the amount you want to pay");
		int payValue= sc.nextInt();
		
		MergeSort sort = new MergeSort();
		sort.sort(denominations, 0, denominations.length-1);
		
		CurrencyCheck curr =new CurrencyCheck();
		curr.CurrencyCount(denominations, payValue);
		
		sc.close();
		
	}

}
