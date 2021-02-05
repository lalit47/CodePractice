package com.cdac;

import java.util.Scanner;

public class ConvertDecimalToOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println();
        int decimal=sc.nextInt();
        int octal=0;
        int i=0;
        while(decimal>0) {
        	int digit=decimal%8;
        	octal+=digit*Math.pow(10,i);
        	decimal=decimal/8;
        	i++;
        }
        System.out.println("octal number : "+octal);
        
	}

}
