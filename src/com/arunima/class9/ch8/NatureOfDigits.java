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
			
			int currentD = numclone%10 ;
			numclone = numclone/10 ;
			
			if( currentD%2==0 )
			{
				System.out.println( currentD + " : an even digit\n");
			}
			else
			{
				System.out.println( currentD + " : an odd digit\n" );
			}
			
		}
		while( numclone>0 ) ;
		
		sc.close() ;
	}
}
