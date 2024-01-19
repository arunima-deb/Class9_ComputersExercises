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
			System.out.println( "\nnum=" + num ) ;
			System.out.println( "reverseNum=" + reverseNum ) ;
			System.out.println( "currentDigit=" + currentDigit ) ;
			System.out.println( "numClone=" + numClone  ) ;
		}
		if(reverseNum==numClone)
		{
			System.out.println( "Palindrome" ) ;
		}
		else
		{
			System.out.println( "Not a palindrome" ) ;
		}
		sc.close() ;
		

	}
}
