package com.arunima.class9.ch8;

import java.util.* ;

/*
 * An automorphic number is one whose square ends in the same digits as the
 * number itself.
 */
public class IsItAutomorphic {

	public static void main(String[] args) 
	{
		// Gathering inputs
		Scanner sc = new Scanner(System.in) ;
		System.out.print( "Enter a number : " ) ;
		int n = sc.nextInt() ;
		
		// Initializing variables
		int numClone = n ;
		int numDigits = 0 ;
		
		// Counting the number of digits in the number
		while(numClone>0)
		{
			numClone /= 10 ;
			numDigits++ ;
		}
		
		// Automorphic test
		if((n*n)%(Math.pow(10, numDigits))==n)
		{
			System.out.print( n + " is Automorphic." );
		}
		else
		{
			System.out.print( n + " is not Automorphic." );
		}
		
		sc.close() ;
 
	}

}
