package com.arunima.class9.ch9;

public class S {

	public static void main(String[] args) 
	{
		S.S7();
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
	
	public static void S8()
	{
		int i, j ;
		for( i=1; i<=5; i++ )
		{
			for( j=1; j<=5; j++ )
			{
				System.out.print( i + " " );
			}
			System.out.println() ;
		}
	}
	
	public static void S4()
	{
		int i, j ;
		for( i=1; i<=9; i+=2 )
		{
			for( j=9; j>=i; j-=2 )
				System.out.print( j + " " );
			System.out.println() ;
		}
	}
	
	public static void S3()
	{
		int i, j ;
		for( i=5; i>=1; i-- )
		{
			for( j=i; j>=1; j-- )
				System.out.print( j + " " );
			System.out.println() ;
		}
	}
	
	public static void S7()
	{
		for( int r=1; r<=5; r++ )
		{
			for( int c=1; c<=r; c++ )
				System.out.print( "* " );
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
