package com.arunima.class9.ch8;

public class UJP_23b {

	public static void main(String[] args) 
	{
 
		for( int n=1; n<=1000000; n++ )
		{
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
			
		}

	}

}
