package com.arunima.class9.ch8;

import java.util.* ;
public class Factors 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println( "Enter a number : " ) ;
		int num = sc.nextInt() ;
		int sumFact = 0 ;
		for(int i = 1; i<num; i++)
		{
			if( num%i==0 )
			{
				sumFact+=i ;
			}
		}
		System.out.println(sumFact) ;
			
		sc.close() ;
			
	}
}