package com.arunima.class9.ch9;

public class S {

	public static void main(String[] args) 
	{
		S.S5();
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
		for( i=0; i<5; i++ )
		{
			for( j=0; j<=i; j++ )
				System.out.print( ( (j+1)%2 ) + " " ) ;
			System.out.println() ;
		}
	}
	
	public static void S5()
	{
		int i, j ;
		for( i=7; i>=1; i-=2 )
		{
			for( j=1; j<=i; j++ ) {
				System.out.print( j + " " ); 
			}	
			System.out.println() ;
		}
	}
	
	
}
