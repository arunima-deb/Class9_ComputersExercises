package com.arunima.class9.ch9;

public class S {

	public static void main(String[] args) 
	{
		S.S6();
	}

	public static void S1()
	{
		int i, j ;
		for( i=1; i<=5; i++ )
		{
			for( j=1; j<=i; j++ )
			{
				System.out.print( j + " " ) ;
			}
			System.out.println() ;
		}
	}
	
	public static void S6()
	{
		int i, j ;
		for( i=1; i<=5; i++ )
		{
			for( j=1; j<=i; j++ )
			{
				if( j%2!=0 )
					System.out.print( 1 + " " ) ;
				else
					System.out.print( 0 + " " );
			}
			System.out.println() ;
		}
	}
	
	
}
