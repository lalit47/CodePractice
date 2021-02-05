package com.cdac;
import java.util.Scanner;

public class ArmstrongNumberBetweenTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
        int end=sc.nextInt();
        for(int i=start;i<=end;i++) {
        	      if(isArmstrong(i))
        	             System.out.println(i+" is an armstrong number");
        }
	}
       private static boolean isArmstrong(int i) {
        
        int temp=i;
        int res=0;
        while(i>0) {
        	int digit=i%10;
        	 res=res+digit*digit*digit;
        	 i=i/10;
        }
        
        if(res==temp) {
	       return true;
        }else {
        	return false;
        }
       }
	}
