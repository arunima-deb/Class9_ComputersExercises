package com.arunima.class9.ch7;

import java.util.* ;

public class Exercise5_8 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter 3 unequal numbers : ") ;
		int a = sc.nextInt() ;
		int b = sc.nextInt() ;
		int c = sc.nextInt() ;
		int max = 0, min = 0 ;
		
		if( a!=b && b!=c && c!=a )
		{
			max = Math.max( (Math.max(a, b)), c) ;
			min = Math.min( (Math.min(a, b)), c) ;
		}
		else
			System.out.println( "Two or more of the entered numbers are unequal.\nTry again." ) ;
		
		System.out.println( "Greatest number : " + max 
						  + "\nSmallest number : " + min ) ;
		
	}
}
