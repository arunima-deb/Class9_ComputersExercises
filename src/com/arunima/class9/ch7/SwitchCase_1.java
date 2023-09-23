package com.arunima.class9.ch7;

import java.util.* ;

public class SwitchCase_1 
{
	public static void main( String args[] )
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println( "Enter length and breadth of a rectangle : " ) ;
		int l = sc.nextInt() ;
		int b = sc.nextInt() ;
		
		if( l<=0 || b<=0 )
		{
			System.out.println( "Negative or zero dimensions of a 2D geometric figure cannot exist." ) ;
			System.out.println( "Program will therefore be terminated." ) ;
			System.exit(0) ;
		}

		System.out.println( "Enter 'a' to display area, 'p' to display perimeter or 'd' to display diagonal : ") ;
		char ch = sc.next().charAt(0) ;
		
		switch( ch )
		{
			case 'a' :
			{
				System.out.println( "Area = " + l*b ) ; 
				break ;
			}
			case 'p' :
			{
				System.out.println( "Perimeter = " + 2*(l+b) ) ; 
				break ;
			}
			case 'd' :
			{
				System.out.println( "Diagonal = " + Math.sqrt( l*l + b*b ) ) ; 
				break ;
			}
			default :
			{
				System.out.println( "Invalid character." ) ;
			}
		}
		
		sc.close() ;
	}
}
