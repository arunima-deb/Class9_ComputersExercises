package com.arunima.class9.ch8;

import java.util.Scanner ;

public class S {
	
	private static Scanner sc = new Scanner(System.in) ;

	public static void main(String[] args) 
	{
		S.S_21();
		sc.close();
	}
	
	public static void S_15()
	{

		System.out.print( "Enter upper limit : " ) ;
		int n = sc.nextInt() ;
		
		double currentTerm = 0.0, sum = 0.0 ;
		for( int i=1; i<=n; i++ )
		{
			currentTerm = 1/(Math.pow(2, i)) ;
			sum += currentTerm ;
		}
		
		System.out.println( "Sum of the first " + n + " terms is : " + sum ) ;
		
	}
	
	public static void S_18()
	{
		System.out.print( "Enter upper limit : " ) ;
		int n = sc.nextInt() ;
		int currentTerm = 1, sum = 0 ;
		
		for( int i=1; i<=n; i++ )
		{
			currentTerm = 1 ;
			for( int j=1; j<=i; j++ )
			{
				currentTerm *= j ;
			}
			sum += currentTerm ;
		}
		
		System.out.println( "Sum of first " + n + " terms is " + sum ) ;
		
	}
	
	public static void S_4()
	{
		int sum = 0 ;
		for( int i=1; i<=10; i++ )
		{
			System.out.print( "Enter a number : " ) ;
			int n = sc.nextInt();
			if( n<0 )
				sum += n ;
		}
		System.out.println( "Sum of negative numbers = " + sum ) ;
	}
	
	public static void S_24()
	{
		System.out.print( "Enter a number : " ) ;
		int num = sc.nextInt(), sum = 0 ;
		
		while( num>0 )
		{
			sum += num%10 ;
			num /= 10 ;
		}
		
		System.out.println( "Sum of digits = " + sum ) ;
		
	}
	
	public static void S_16()
	{
		int s = 0, a, sign = 1 ;
		System.out.print( "Enter a number : " ) ;
		a = sc.nextInt() ;
		
		for( int i=0; i<=10; i++ )
		{
			s += (Math.pow(a, i)*sign) ;
			sign *= -1 ;
		}
		
		System.out.println( s ) ;
	}
	
	public static void S_21()
	{
		int min = 0;
		
		System.out.print( "Enter a number : " ) ;
		int n1 = sc.nextInt() ;
		System.out.print( "Enter a number : " ) ;
		int n2 = sc.nextInt() ;
		
		for( int i=1; i<=8; i++ )
		{			
			if( n1<n2 )
				min = n1 ;
			else
				min = n2 ;
			
			n1=n2 ;
			
			System.out.print( "Enter a number : " ) ;
			n2 = sc.nextInt() ;
		}
		
		System.out.print( "Min = " + min );
		
	}
	
}
