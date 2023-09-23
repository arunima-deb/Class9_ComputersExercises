package com.arunima.class9.ch7;

import java.util.* ;

public class Exercise5_4 
{
	public static void main( String args[] ) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println( "Enter an integer : " ) ;
		int n = sc.nextInt() ;
		
		if( n%3 == 0 && n%5 != 0 )
		{
			System.out.println( n + " is divisible by 3 and not 5." ) ;
		}
		else if( n%3 != 0 && n%5 == 0 )
		{
			System.out.println( n + " is divisible by 5 and not 3." ) ;
		}
		else if( n%15 == 0 )
		{
			System.out.println( n + " is divisible by both 3 and 5." ) ;
		}
		else
		{
			System.out.println( n + " is divisible by neither 3 nor 5." ) ;
		}

		sc.close() ;
	}
}
