package com.arunima.class9.ch9;

public class NeonNum 
{
	public static void main(String args[])
	{		
		for( long i=0; i<=1000000000; i++ )
		{	
			long num=i ;
			neonTest(num) ;
		}	
	}
	
	public static void neonTest( long num )
	{
		// Initializing variables
		int sum = 0 ;
		long numsq = num*num ;
		
		// Obtaining sum of digits of the squared number
		while( numsq>0 )
		{
			sum += numsq%10 ;
			numsq/=10 ;
		}
		
		// Checking whether sum of digits of sq = the number
		if( sum==num )
			System.out.println( num + " is a Neon number." ) ;
	}
}
