package com.arunima.class9.ch7;

import java.util.* ;

/**
 * Write a program to input two unequal positive numbers and check
 * whether they are perfect squares or not. If the user enters any 
 * negative number them the program displays the message "Square
 * root of a positive number cannot be determined."
 */
public class Exercise5_6 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println( "Enter two unequal positive numbers : " ) ;
		double a = sc.nextDouble() ;
		double b = sc.nextDouble() ;
		
		if( a==b )
		{
			System.out.println( "Both numbers are equal." );
		}
		else if( a<0 || b<0 )
		{
			System.out.println( "Square root of a negative number does not exist." ) ;
		}
		else 
		{
			boolean aIsPerfectSq = Math.sqrt(a)==Math.floor(Math.sqrt(a)) ;
			boolean bIsPerfectSq = Math.sqrt(b)==Math.floor(Math.sqrt(b)) ;
			
			System.out.println( a + " is" + ((aIsPerfectSq) ? " " : " not ") + "a perfect square" ) ;
			System.out.println( b + " is" + ((bIsPerfectSq) ? " " : " not ") + "a perfect square" ) ;
		}
		
		sc.close() ;
	}

}
