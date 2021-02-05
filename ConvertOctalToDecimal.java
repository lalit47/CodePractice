package com.cdac;

import java.util.Scanner;

public class ConvertOctalToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int octal=sc.nextInt(); 
    int decimal=0;
    int i=0;
    
    while(octal>0) {
         int digit=octal%10;
         decimal+=digit*Math.pow(8, i);
         octal=octal/10;
         i++;
    }
    System.out.println("decimal number:"+decimal);
	}

}
 