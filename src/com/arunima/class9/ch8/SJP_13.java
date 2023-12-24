package com.arunima.class9.ch8;

import java.util.Scanner ;

public class SJP_13 
{
	public static void main( String args[] )
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.print( "Enter upper limit : " ) ;
		int n = sc.nextInt() ;
		
		int sum = 0 ;
		for( int i=1; i<=n; i++ )
		{
			sum = sum + i ;
		}
		
		System.out.println( "1 + 2 + ...... + " + (n-1) + " + " + n + " = " + sum ) ;
		
		sc.close() ;
	}
}
