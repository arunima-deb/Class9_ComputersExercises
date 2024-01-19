package com.arunima.class9.ch9;

public class Triangles 
{

	public static void main(String[] args) 
	{
		Triangles.patternX();
	}
	
	public static void RightTriangle_Up() 
	{
		int i, j ;
		for( i=5; i>=1; i-- )
		{
			for( j=1; j<=i; j++ )
			{
				System.out.print(  "* " );
			}
			System.out.println() ;
		}
	}
	
	
	public static void Cascading54321()
	{
		int i, j ;
		for( i=5; i>=1; i-- )
		{
			for( j=5; j>=i; j-- )
			{
				System.out.print( j + " " ) ;
			}
			System.out.println() ;
		}
	}
	
	
	public static void Receding54321()
	{
		int i, j ;
		for( i=1; i<=5; i++ )
		{
			for( j=5; j>=i; j-- )
			{
				System.out.print( j + " " ) ;
			}
			System.out.println() ;
		}
	}
	
	public static void Cascading12345()
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
	
	public static void Receding12345()
	{
		int i, j ;
		for( i=5; i>=1; i-- )
		{
			for( j=1; j<=i; j++ )
			{
				System.out.print( j + " " ) ;
			}
			System.out.println() ;
 		}
	}
	
	public static void Cascading1to15()
	{
		int i, j, p=1 ;
		for( i=1; i<=5; i++ )
		{
			for( j=1; j<=i; j++ )
			{
				System.out.print( p + " " ) ;
				p++ ;
			}
			System.out.println() ;
		}
	}
	
	public static void UJP_15h()
	{
		int i, j ;
		for( i=9; i>=1; i-=2 )
		{
			for( j=i; j<=9; j+=2 )
			{
				System.out.print( j + " " ) ;
			}
			System.out.println() ;
		}
	}
	
	public static void Receding13579()
	{
		int i, j ;
		for( i=9; i>=1; i-=2 )
		{
			for( j=1; j<=i; j+=2 )
			{
				System.out.print( j + " " );
			}
			System.out.println();
		}
	}
	
	public static void patternX()
	{
		int i, j ;
		for( i=1; i<=4; i++ )
		{
			for( j=1; j<=i; j++ )
			{
				System.out.print( i + " " ) ;
			}
			System.out.println() ;
		}
	}
	
	
	
	public static void InverseRhombus()
	{
		int i, j;
		for( i=1; i<=10; i++ )
		{
			
		}
	}
	
}
