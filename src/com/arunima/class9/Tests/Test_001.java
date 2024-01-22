package com.arunima.class9.Tests;

import java.util.Scanner ;

public class Test_001 {
	
	private static Scanner sc = new Scanner(System.in) ;

	public static void main(String[] args) 
	{
		
	}
	
	public static void Q1()
	{
		int x=5, y=50 ;
		while(x<=y)
		{
			y=y/x ;
			System.out.println(y) ;
		}
	}
	
	public static void Q3()
	{
		int m=2, n=15 ;
		for( int i=1; i<=5; i++ )
		{
			m++ ; --n ;
			System.out.println( "m = " + m ) ;
			System.out.println( "n = " + n ) ;
		}
	}

}
