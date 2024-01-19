package com.arunima.class9.ch8;

import java.util.* ;

public class UJP_14 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.print( "Enter P : " ) ;
		double p = sc.nextDouble() ;
		System.out.print( "Enter R : " ) ;
		double r = sc.nextDouble() ;
		System.out.print( "Enter T : " ) ;
		double t = sc.nextDouble() ;
		
		for(int i=1; i<=t; i++)
		{
			double si = (p*r)/100 ;
			p += si ;
		}
		
		System.out.print( "Amount = " + p ) ;
 	}
}
