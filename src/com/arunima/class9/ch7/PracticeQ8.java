package com.arunima.class9.ch7;

import java.util.* ;

public class PracticeQ8 
{
	public static void main( String args[] )
	{
		Scanner sc = new Scanner (System.in) ;
		System.out.println( "Enter a number : ") ;
		double num = sc.nextDouble() ;
		double n = Math.abs(num) ;
		
		if(n<1000)
		{
			if(n<10)
			{
				System.out.println( "Square of the given one-digit number = " + (n*n) ) ;
			}
			else if(n<100)
			{
				if(num<0) 
				{
					System.out.println( "Negative number; square root does not exist." ) ;
				}
				else
				{
					System.out.println( "Square root of the given two-digit number = " + Math.sqrt(n) ) ;
				}
			}
			else if(n<1000)
			{
				System.out.println( "Cube root of the given three-digit number = " + Math.cbrt(n) ) ;
			}
		}
		else
		{
			System.out.println( "The number entered is more than three digits." ) ;
		}
		
		sc.close();
	}
}
