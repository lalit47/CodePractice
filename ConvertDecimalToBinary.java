package com.cdac;

import java.util.Scanner;

public class ConvertDecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a decimal number:");
		int decimal=sc.nextInt();
		long binary=0;
		int i=0;
		
		while(decimal>0) {
			int digit=decimal%2;
			decimal=decimal/2;
			binary+=(digit*Math.pow(10, i));
			i++;
		}
		
		System.out.print("binary number:"+binary);
	}

}
