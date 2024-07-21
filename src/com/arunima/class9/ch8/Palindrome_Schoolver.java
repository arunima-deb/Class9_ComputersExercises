package com.arunima.class9.ch8;

import java.util.Scanner ;

public class Palindrome_Schoolver 
{
	public static void main( String args[] )
	{
		// Initialization
		Scanner sc = new Scanner(System.in) ;
		System.out.println( "Enter a number : " ) ;
		int num, revNum = 0, currentDigit, numClone ;
		num = sc.nextInt();
		numClone = num ;
		
		// Creating reverse number
		while(num!=0)
		{
			currentDigit=num%10 ;
			revNum = (revNum*10) + currentDigit ;
			num = num/10 ;
		}
		
		// Checking if the number is a palindrome
		if(revNum==numClone)
		{
			System.out.println( "\nPalindrome" ) ;
		}
		else
		{
			System.out.println( "\nNot a palindrome" ) ;
		}
		
		sc.close() ;
	}
}
