package com.arunima.class9.ch7;

import java.util.* ;

public class Exercise5_1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println( "Enter three angles of a triangle : " ) ;
		double a = sc.nextDouble() ;
		double b = sc.nextDouble() ;
		double c = sc.nextDouble() ;
		
		if( ((a+b+c)==180) && (a>0 && b>0 && c>0) )
		{
			if( a<90 && b<90 && c<90 )
			{
				System.out.println( "It is an acute-angled triangle." ) ;
			}
			else if( a==90 || b==90 || c==90 )
			{
				System.out.println( "It is a right-angled triangle." ) ;
			}
			else if( a>90 || b>90 || c>90 )
			{
				System.out.println( "It is an obtuse-angled triangle." ) ;
			}
		}
		else
		{
			System.out.println( "A triangle is not possible." ) ;
		}
		
		sc.close() ;
	}

}
