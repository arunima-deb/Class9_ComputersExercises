package com.arunima.class9.ch8;

import java.util.Scanner ;

public class NatureOfDigits 
{
	public static void main( String args[] )
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.print( "Enter a number : " ) ;
		int num = sc.nextInt() ;
		
		int numclone = num ;
		do {
			
			int currentnum = numclone%10 ;
			numclone = numclone/10 ;
			
			if( currentnum%2==0 )
			{
				System.out.println( currentnum + " : an even digit\n");
			}
			else
			{
				System.out.println( currentnum + " : an odd digit\n" );
			}
			
		}
		while( numclone>0 ) ;
		
		sc.close() ;
	}
}
