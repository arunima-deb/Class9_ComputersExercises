package com.arunima.class9.ch7;

import java.util.* ;

public class PracticeQ3 
{
	public static void main( String args[] )
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println( "Enter 3 sides of a triangle : " ) ;
		double a = sc.nextDouble() ;
		double b = sc.nextDouble() ;
		double c = sc.nextDouble() ;
		String tr = "" ;
		
		if( (a+b)>c && (b+c)>a && (a+c)>b )
		{
			if (a==b && b==c && c==a)
			{
				tr = "Equilateral" ;
			}
			else if (a==b || b==c || c==a)
			{
				tr = "Isosceles" ;
			}
			else 
			{
				tr = "Scalene" ;
			}
			System.out.println( "It is a/an " + tr + " triangle." ) ;
		}
		else
		{
			System.out.println( "Triangle is not possible." ) ;
		}

		sc.close() ;
	}
}
