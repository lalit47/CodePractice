package com.cdac;

import java.util.Scanner;

public class ReverseWordsofSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       String[] sentence=sc.nextLine().split("");
       String rev=" ";
       for(int i=sentence.length-1;i>=0;i--) {
    	   rev+=sentence[i];
	}
       System.out.println(rev);

	}
}
