package com.arunima.class9.ch8;

import java.util.Scanner ;

public class UJP_17 
{
	public static void main( String args[] )
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.print("Enter a number : ") ;
		int num = sc.nextInt() ;
		
		int numClone = num, numDigits=0, currentDigit, result=0 ;
		while(numClone>0)
		{
			numClone/=10 ;
			numDigits++ ;
		}
		System.out.println( "Number of digits = " + numDigits ) ;
		
		for( int i=1; i<=numDigits; i++ )
		{
			currentDigit = num%10 ;
			num = num/10 ;
			result = result + (int)Math.pow(currentDigit, numDigits) ;
		}
		System.out.println( "Result = " + result ) ;
		
		sc.close() ;
	}
}
