package com.arunima.class9.ch8;

import java.util.Scanner ;

public class UJP_6 
{
	public static void main(  String args[] )
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.print( "Enter lower limit : " ) ;
		int p = sc.nextInt() ;
		System.out.print( "Enter upper limit : " ) ;
		int q = sc.nextInt() ;
		
		for( int i=p; i<=q; i++ )
		{
			if( i%7==0 || i%10==7 )
			{
				System.out.println( i + " is a Buzz Number." ) ;
			}
		}
		
	}
}
