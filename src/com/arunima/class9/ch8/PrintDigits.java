package com.arunima.class9.ch8;

import java.util.* ;
public class PrintDigits 
{
	public static void main( String args[] )
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.print( "Enter a number : " ) ;
		int num = sc.nextInt() ;
		System.out.print( "Digits of " + num + " are : " );
		while(num>0)
		{
			int currentDigit = num%10 ;
			num = num/10 ;
			System.out.print( currentDigit + ", " );
		}
		
	}
}