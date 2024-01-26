package com.arunima.class9.ch8;

import java.util.Scanner ;
public class Fibonacci 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.print( "Enter required number of terms : " ) ;
		int numterms = sc.nextInt() ;
		sc.close() ;
		
		int i, prevprev = 0, prev = 1, toPrint;
		System.out.print( prevprev + ", " + prev ) ;
		
		for ( i=3; i<=numterms; i++ )
		{
			toPrint = prevprev + prev ;
			prevprev = prev ;
			prev = toPrint ;
			System.out.print( ", " + toPrint  ) ;
		}
		

	}

}
