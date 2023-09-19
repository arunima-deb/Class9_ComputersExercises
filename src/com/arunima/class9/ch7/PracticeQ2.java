package com.arunima.class9.ch7;

import java.util.* ;

public class PracticeQ2 
{
	public static void main( String args[] )
	{
		Scanner sc = new Scanner (System.in) ;
		System.out.println( "Enter a number : " ) ;
		int n = sc.nextInt() ;
		
		if (n>0 && n%2==0)
		{
			System.out.println( "The number is positive and even." ) ;
			System.out.println( "Three succeeding even numbers are "
					+ "as follows : " + (n+2) + ", " + (n+4) + ", " + (n+6) ) ;
		}
		else if (n<0 && n%2==-1)
		{
			System.out.println( "The number is negative and odd." ) ;
			System.out.println( "Three preceding odd numbers are "
					+ "as follows : " + (n-2) + ", " + (n-4) + ", " + (n-6) ) ;
		}
		else
		{
			System.out.println( "The number is neither a positive even "
					+ "nor a negative odd." ) ;
		}
		
		sc.close() ;
	}
}
