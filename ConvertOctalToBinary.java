package com.cdac;

import java.util.Scanner;

public class ConvertOctalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int octal=sc.nextInt();
        int binary=0;
        int base=1;
        while(octal>0) {
        	int r=octal%10;
        	binary=binary+base*octalBinary(r);
        	octal=octal/10;
        	base*=1000;
        }
       System.out.println("binary number:"+binary);
	}
	private static int octalBinary(int r) {
		int binary=0;
		int i=0;
		while(r>0) {
			int digit=r%2;
			binary+=digit*Math.pow(10, i);
			r=r/2;
			i++;
			
		}
		return binary;
	}

}
