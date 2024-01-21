package com.arunima.class9.ch8;

import java.util.Scanner ;

public class Palindrome_Schoolver 
{
	public static void main( String args[] )
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println( "Enter a number : " ) ;
		int num, reverseNum = 0, currentDigit, numClone ;
		num = sc.nextInt();
		numClone = num ;
		while(num!=0)
		{
			currentDigit=num%10 ;
			reverseNum = (reverseNum*10) + currentDigit ;
			num = num/10 ;
		}
		if(reverseNum==numClone)
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
