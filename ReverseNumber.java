package com.cdac;
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter a number:");
      int num=sc.nextInt();
      int reverse=0;
      while(num>0) {
    	  int unitdigit=num%10;
    	  reverse=(reverse*10)+unitdigit;
    	  num=num/10;
      }
      System.out.println(reverse);
	}

}
