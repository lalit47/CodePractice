package com.cdac;

import java.util.Scanner;

public class ConvertBinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a binary number:");
        int binary=sc.nextInt();
        int decimal=0;
        int i=0;
        while(binary>0) {
        	int digit=binary%10;
        	binary=binary/10;
        	decimal+=digit*Math.pow(2, i);
        	i++;
        }
        System.out.println("decimal number: "+decimal);
        
	}

}
