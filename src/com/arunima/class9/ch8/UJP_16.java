package com.arunima.class9.ch8;

import java.util.Scanner ;

public class UJP_16 
{
	public static void main( String args[] )
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.print( "Enter a number : " ) ;
		int num = sc.nextInt() ;
		
		int c = 1 ;
		while(c<=10)
		{
			num++ ;
			if( num%2!=0 )
			{
				System.out.println(num) ;
				c++ ;
			}
		}
	
		sc.close() ;
	}
}
