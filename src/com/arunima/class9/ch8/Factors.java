package com.arunima.class9.ch8;

import java.util.* ;
public class Factors {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println( "Enter a number : " ) ;
		int num = sc.nextInt() ;
		ArrayList<Integer> factors = new ArrayList<>() ;
		
		for(int i = 1; i<=num/2; i++)
		{
			if( num%i==0 )
			{
				factors.add(i) ;
			}
		}
		factors.add(num) ;
		
		for( int factor : factors ) {
			System.out.println( factor ) ;
			
		sc.close() ;
			
		}

	}

}
