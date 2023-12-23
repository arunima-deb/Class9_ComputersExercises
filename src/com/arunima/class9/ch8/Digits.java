package com.arunima.class9.ch8;

import java.util.* ;
public class Digits 
{
	public static void main( String args[] )
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.print( "Enter a number : " ) ;
		long num = sc.nextLong() ;
		
		int numdigits = 0 ;
		while( num>0 )
		{
			num = num/10 ;
			numdigits++ ;
		}
		System.out.println( "Number of digits = " + numdigits ) ;
	}
}
