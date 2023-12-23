package com.arunima.class9.ch9;

import java.util.Scanner ;

public class Triangle 
{

	public static void bottomLeftTriangle( int numRows )
	{	
		for( int row=1; row<=numRows; row++ )
		{
			for( int column=1; column<=row; column++ )
			{
				System.out.print( "* " ) ;
			}
			System.out.println( "" ) ;
		}
		
	}
	
	public static void bottomRightTriangle( int numRows )
	{
		for( int row=1; row<=numRows; row++ )
		{
			for( int col=1; col<=numRows; col++ ) {
				int numSpaces = numRows-row ;
				if( col <= numSpaces ) {
					System.out.print( "  " ) ;
				}
				else {
					System.out.print( "* " ) ;
				}
			}
			System.out.println() ;
		}
	}
	
	public static void topLeftTriangle( int numRows )
	{
		for( int row = 1; row<=numRows; row++ )
		{
			for( int col=numRows; col>=0; col-- )
			{
				String cellVal = ((row+col) <= numRows) ? "* " : "" ;
				System.out.print( cellVal ) ;
			}
			System.out.println( "" ) ;
		}
	}
	
	public static void main( String args[] )
	{
		Scanner sc = new Scanner( System.in ) ;
		System.out.print( "Enter size : " ) ;
		int numRows = sc.nextInt() ;
		
		Triangle.bottomLeftTriangle( numRows ) ;
		System.out.println( "\n\n" );
		Triangle.bottomRightTriangle( numRows ) ;
		System.out.println( "\n\n" );
		Triangle.topLeftTriangle( numRows ) ;
		
		sc.close() ;
	}
	
	

}
