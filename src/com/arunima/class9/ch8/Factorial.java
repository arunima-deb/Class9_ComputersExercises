package com.arunima.class9.ch8;

import java.util.* ;

public class Factorial 
{
	public static void main( String args[] )
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.print( "Enter a number : " ) ;
		int num = sc.nextInt() ;
		
		int f = 1;
		for( int i=1; i<=num; i++ )
		{
			f = f*i ;
		}
		
		System.out.print(f) ;
	}
}