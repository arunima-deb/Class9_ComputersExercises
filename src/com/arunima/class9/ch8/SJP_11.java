package com.arunima.class9.ch8;

public class SJP_11 
{
	public static void main( String args[] )
	{
		// Using for loop
		for( int i=1; i<=10; i++ )
		{
			if(i%2!=0 )
			{	
				System.out.println( i ) ;
			}	
		}
		
		System.out.print( "\n" ) ;
		
		//Using while loop
		int i = 1 ;
		while( i<=10 )
		{
			if(i%2!=0 )
			{	
				System.out.println( i ) ;
			}
			i++ ;
		}
		
	}
}
