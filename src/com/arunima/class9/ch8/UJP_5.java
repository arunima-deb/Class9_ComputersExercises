package com.arunima.class9.ch8;

import java.util.Scanner ;

public class UJP_5 
{
	public static void main( String args[] )
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.print( "Enter lower limit : " ) ;
		double m = sc.nextDouble();
		System.out.print( "Enter upper limit : ") ;
		double n = sc.nextDouble();
		
		if( m<0 || n<0 )
		{
			System.out.println( "Invalid limits.") ;
			System.exit(0);
		}
		
		while(m<n)
		{
			double currentnum = n-m ;
			double dsqrt = Math.sqrt(currentnum) ;
			double isqrt = Math.floor(dsqrt) ;
			
			if( dsqrt == isqrt )
			{
				System.out.println( (int)currentnum + " is a perfect square" ) ;
			}
			
			m++ ;
			
		}
		
		sc.close() ;
	}
}
