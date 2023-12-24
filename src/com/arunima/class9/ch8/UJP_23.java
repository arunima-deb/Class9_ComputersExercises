package com.arunima.class9.ch8;

import java.util.Scanner ;

public class UJP_23 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.print( "Enter a number : " ) ;
		int n = sc.nextInt();
		
		int numclone = n ; 
		int sumOfDigits = 0 ;
		int productOfDigits = 1 ;
		while( numclone>0 )
		{
			int nthDigit = numclone%10 ;
			sumOfDigits = sumOfDigits + nthDigit ;
			productOfDigits = productOfDigits * nthDigit ;
			numclone = numclone/10 ;	
		}
		
		if( sumOfDigits==productOfDigits )
		{
			System.out.println(  n + " is a Spy Number." ) ;
		}
		else
		{
			System.out.println( "Not a Spy Number." );
		}
		
		

	}

}
