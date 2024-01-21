package com.arunima.class9.ch7;

import java.util.Scanner ;

public class Exercise5_19 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in) ;
		double si, ci ;
		
		// Gathering inputs
		System.out.print( "Enter principal : " ) ;
		double p = sc.nextDouble() ; 
		System.out.print( "Enter rate : " ) ;
		double r = sc.nextDouble() ; 
		System.out.print( "Enter time : " ) ;
		double t = sc.nextDouble() ; 
		System.out.print( "Enter type of interest (S/C) : " ) ;
		char ch = sc.next().charAt(0) ;
		
		switch(ch)
		{
		case 'S' : si = (p*r*t)/100 ;
					System.out.println( "Simple Interest = " + si ) ; break ;
		case 'C' : ci = p*(( Math.pow((1 + r/100), t) ) - 1) ;
					System.out.println( "Compound Interest = " + ci ) ; break ;
		default : System.out.println( "Invalid input. Please try again." ) ;
		}
		
		
	}
}
