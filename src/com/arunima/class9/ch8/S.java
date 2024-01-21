package com.arunima.class9.ch8;

import java.util.Scanner ;

public class S {
	
	private static Scanner sc = new Scanner(System.in) ;

	public static void main(String[] args) 
	{
		S.S_18();
		sc.close();
	}
	
	public static void S_15()
	{

		System.out.print( "Enter upper limit : " ) ;
		int n = sc.nextInt() ;
		
		double currentTerm = 0.0, sum = 0.0 ;
		for( int i=1; i<=n; i++ )
		{
			currentTerm = 1/(Math.pow(2, i)) ;
			sum += currentTerm ;
		}
		
		System.out.println( "Sum of the first " + n + " terms is : " + sum ) ;
		
	}
	
	public static void S_18()
	{
		System.out.print( "Enter upper limit : " ) ;
		int n = sc.nextInt() ;
		int currentTerm = 1, sum = 0 ;
		
		for( int i=1; i<=n; i++ )
		{
			currentTerm = 1 ;
			for( int j=1; j<=i; j++ )
			{
				currentTerm *= j ;
			}
			sum += currentTerm ;
		}
		
		System.out.println( "Sum of first " + n + " terms is " + sum ) ;
		
	}
	
}
