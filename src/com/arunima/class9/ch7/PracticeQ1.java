package com.arunima.class9.ch7;

import java.util.Scanner;

/* 
 * Write a program to enter two unequal numbers. If the first number is 
 * greater than the second number, print the cube of the bigger number 
 * and square of the smaller number, otherwise vice-versa. If the numbers
 * are equal, display the message "Both the numbers are equal." 
 */
public class PracticeQ1 
{
	public static void main( String args[] )
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println( "Enter two numbers : ") ;
		double a = sc.nextDouble() ;
		double b = sc.nextDouble() ;
		
		if (a==b)
		{
			System.out.println( "Both the numbers are equal." ) ;
		}
		else if (a>b)
		{
			System.out.println( "Cube of bigger number = " + a*a*a ) ;
			System.out.println( "Square of smaller number = " + b*b ) ;
		}
		else if (b>a)
		{
			System.out.println( "Cube of bigger number = " + b*b*b ) ;
			System.out.println( "Square of smaller number = " + a*a ) ;
		}
		
		sc.close();	
	}
}