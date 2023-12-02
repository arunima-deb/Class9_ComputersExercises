package com.arunima.class9.ch7;
import java.util.Scanner ; 

public class PracticeQ9 
{
	public static void main( String args[] )
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println( "Enter values of a, b and c of the \nstandard form of a quadratic equation : " ) ;
		double a = sc.nextDouble() ;
		double b = sc.nextDouble() ;
		double c = sc.nextDouble() ;
		double d = b*b - 4*a*c ;
		
		double alpha = 0 ;
		double beta = 0 ;
		
		String s = "" ;
		
		if( d < 0 )  {
			s = " imaginary and unequal." ;
		}
		else {
			if ( d>0 )
			{
				s = " real and unequal." ;
			}
			else if (d==0)
			{
				s = " real and equal." ;
			}
			alpha = (-b + Math.sqrt( d ))/(2*a) ;
			beta  = (-b - Math.sqrt( d ))/(2*a) ;
			System.out.println( "Root (alpha) = " + alpha ) ;
			System.out.println( "Root (beta)  = " + beta ) ;
		}
		
		System.out.println( "Roots are " + s ) ;
		
	}
}
