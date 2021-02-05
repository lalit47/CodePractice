package com.cdac;
import java.util.Scanner;

public class CheckPrime {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);	
		int num=scanner.nextInt();
		boolean status=CheckPrime(num); 
		if(status==true) {
			System.out.println("Prime Number");
		}else {
			System.out.println("Not a Prime Number");
		}
	}

	 private static boolean CheckPrime(int num) {
		 if(num<=1) {
			 return false;
		 }
		 for(int i=2;i<num;i++) 
			 if(num%i==0)
				 return false;
		return true;
		 
		
	}

	
	

}
