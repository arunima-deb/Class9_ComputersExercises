package com.arunima.class9.ch8;

import java.util.* ;

public class UJP_10 
{
	public static void main( String args[] )
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.print( "Enter a number : " ) ;
		int n = sc.nextInt() ;
		
		int f = 1, sum=0 ;
		for(int i=1; i<=n; i++)
		{
			f = f*i ;
			sum=sum+f ;
		}
		
		System.out.print( sum );
	
		sc.close() ;
	}
}