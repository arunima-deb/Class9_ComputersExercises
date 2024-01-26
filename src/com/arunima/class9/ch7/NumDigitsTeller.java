package com.arunima.class9.ch7;

import java.util.* ;

public class NumDigitsTeller 
{
	public static void main( String args[] )
	{
		Scanner sc = new Scanner (System.in) ;
		System.out.println( "Enter a number : " ) ;
		int a = Math.abs(sc.nextInt()) ;
		String st = (a<100)?((a<10)? "Single digit" : "Double digit" ):"Multiple digit" ;
		System.out.println( st ) ;
		sc.close() ;
	}
}