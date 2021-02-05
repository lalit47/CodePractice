package com.cdac;
import java.util.Scanner;

public class FactorialOfNumberUsingReccursion {

	public static int fact(int num) {
		if(num==1) {
			return 1;
		}else
			return num*fact(num-1);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
	    int result=fact(num);
	    System.out.println(result);
	}

}
