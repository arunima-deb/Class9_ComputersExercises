package com.arunima.class9.ch9;

import java.util.* ;


public class UJP 
{
	private static Scanner sc = new Scanner(System.in) ;

	public static void main( String args[] )
	{
		UJP.P6_13() ;
		sc.close() ;
	}
	
	public static void P6_12()
	{
		for( int i=1; i<=100; i++ )
		{
			int numF = 0 ;
			for( int j=1; j<=i; j++ )
			{
				if( i%j==0 )
					numF++ ;
			}
			if( numF>2 )
				System.out.println( i + " is a composite number." ) ;
		}
	}
	
	public static void P6_1()
	{
		System.out.println( "Table of 5: " ) ;
		for( int i=1; i<=10; i++ )
		{
			System.out.println( 5 + " * " + i + " = " + (5*i) ) ;
		}
	}
	
	public static void P6_2()
	{
		for( int i=1; i<=20; i++ )
		{
			int numF = 0 ;
			System.out.print( "\n\nEnter a number: " );
			int num = sc.nextInt() ;
			for( int j=1; j<=num; j++ )
			{
				if( num%j==0 )
					numF++ ;
					
			}
			if( numF==2 )
				System.out.println( num + " is a prime number." );
			else
				System.out.println( num + " is not prime." ) ;
		}
	}
	
	public static void P6_3() 
	{
		int n;
		double sum = 0.0, num = 0.0, den = 1.0 ;
		System.out.print( "Enter limit : " ) ;
		n = sc.nextInt() ;
		
		for( int i=2; i<=n; i++ )
		{
			for( int j=1; j<=n; j++ )
			{
				num += j ;
				den *= j ;
			}
			sum += num/den ;
		}
		System.out.println( sum );
	}
	
	public static void P6_13()
	{
		for( int i=1; i<=4; i++ )
		{
			int numToppers = 0 ;
			for( int j=1; j<=5; j++ )
			{
				System.out.print( "Enter student name : " ) ;
				String name = sc.next() ;
				System.out.print( "Enter percentage : " ) ;
				double p = sc.nextDouble() ;
				if( p>=95.0 )
					numToppers++ ;
			}
			
			System.out.print( "\n\tSection " + i + " toppers : " + numToppers + "\n\n" ) ;
		}
	}
	
	public static void ScratchPad()
	{
		
	}
	
}
