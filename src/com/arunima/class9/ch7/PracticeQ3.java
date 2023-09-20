package com.arunima.class9.ch7;

import java.util.* ;

public class PracticeQ3 
{
	public static void main( String args[] )
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println( "Enter three numbers : " ) ;
		int a = sc.nextInt() ;
		int b = sc.nextInt() ;
		int c = sc.nextInt() ;
		System.out.println( "Enter 's' to display sum and 'p' to display product : " ) ;
		char ch = sc.next().charAt(0) ;
		
		if(ch=='s'  || ch=='p')
		{
			if (ch=='s')
			{
				System.out.println( "Sum = " + (a+b+c) ) ;
			}
			else if (ch=='p')
			{
				System.out.println( "Product = " + (a*b*c) ) ;
			}
		}
		else
		{
			System.out.println( "Invalid character." ) ;
		}
		
		sc.close();
	}
}
