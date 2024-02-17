package com.arunima.class9.ch9;

public class R {

	public static void main(String[] args) 
	{
		R.R6_2() ;
	}
	
	public static void R6_1()
	{
		for( int i=1; i<=5; i++ )
		{
			for( int j=i; j>=1; j-- )
				System.out.print( j + " " ) ;
			System.out.println() ;
		}
	}
	
	public static void R6_3()
	{
		int p ;
		for( int i=1; i<=5; i++ )
		{
			p=5 ;
			for( int j=5; j>=i; j-- )
			{
				System.out.print( p + " " ) ;
				p-- ;
			}
			System.out.println() ;
		}
	}
	
	public static void R6_8()
	{
		for( int i=9; i>=1; i-=2 )
		{
			for( int j=i; j<=9; j+=2 )
				System.out.print( j + " " ) ;
			System.out.println();
		}
	}
	
	public static void R6_9()
	{
		for( int i=9; i>=1; i-=2 )
		{
			for( int j=9; j>=i; j-=2 )
				System.out.print( j + " " ) ;
			System.out.println() ;
		}
	}
	
	public static void R6_2()
	{
		int p ;
		for( int i=5; i>=1; i-- )
		{
			p=1 ;
			for( int j=1; j<=i; j++ )
			{
				System.out.print( p + " " ) ;
				p++ ;
			}
			System.out.println() ;
		}
	}

}
