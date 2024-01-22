package com.arunima.class9.ch6;

import java.util.Scanner ;

public class UJP {
	
	public static void main(String args[])
	{
		UJP.UJP_5();
	}
	
	public static void UJP_5()
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.print("Enter area: ") ;
		double a = sc.nextDouble() ;
		double r = Math.sqrt( (7*a)/22 ) ;
		System.out.print( "Radius = " + r ) ;
	}

}
