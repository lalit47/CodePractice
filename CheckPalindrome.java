package com.cdac;
import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         int num=sc.nextInt();
         int temp=num;
         int reverse=0;
         while(num>0) {
         int unitdigit=num%10;
         reverse=(reverse*10)+unitdigit;
         num=num/10;
         }
         if(reverse==temp) {
            System.out.println("palindrome");
	
         }else {
        	 
        	System.out.println("Not a palindrome");
         }

}
}
