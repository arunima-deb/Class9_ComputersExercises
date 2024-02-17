package com.arunima.class9.ch9;

import java.util.* ;

public class AbundantNum 
{
	public static void main( String args[] )
	{
		// Accepting data
		Scanner sc = new Scanner(System.in) ;
		System.out.println( "Enter two numbers : " ) ;
		int a = sc.nextInt() ;
		int b = sc.nextInt();
		
		// Initializing variables
		int a_f = 0, b_f = 0 ;
		
		// Checking if numbers are prime
		for( int i=1; i<=a; i++ )
		{
			if( a%i==0 )
				a_f++ ;
		}
		
		for( int j=1; j<=b; j++ )
		{
			if( b%j==0 )
				b_f++ ;
		}
		
		// Checking if numbers are twin primes
		if( (a_f==2&&b_f==2) && Math.abs(a-b)==2 )
			System.out.println( a + " and " + b + " are twin primes." ) ;
		else
			System.out.println( a + " and " + b + " are not twin primes." ) ;
		
		sc.close() ;
	}
}

