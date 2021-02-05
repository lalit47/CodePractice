package com.cdac;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number");
      int num=sc.nextInt();
      int res=0,temp;
      temp=num;
      while(num>0) {
    	  int digit=num%10;
    	  res+=digit*digit*digit;
    	  num=num/10;
      }

      if(res==temp) {
         System.out.println("Armstrong Number");
    }else {
    	System.out.println("not Armstrong Number");
    }
    	

}
}