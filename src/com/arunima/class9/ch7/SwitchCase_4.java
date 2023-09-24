package com.arunima.class9.ch7;

import java.util.* ;

public class SwitchCase_4 {
	
	private static Scanner sc ;

	public static void main(String[] args) 
	{
		sc = new Scanner(System.in) ;
		double amount = 0 ;
		
		switch( getUserChoice() )
		{
			case 1 :
				amount = calculateTermDepositAmout() ;
				break ;
				
			case 2 :
				amount = calculateRecurringDepositAmount() ;
				break ;
				
			default :
				System.out.println( "Invalid type entered." ) ;
				System.exit( 0 ) ;
		}
		
		System.out.println( "Amount = " + amount ) ;
		sc.close() ;
	}
	
	public static double calculateTermDepositAmout() {
		
		System.out.println( "\nCalculating Term Deposit...\n" );
		double p = getInput( "Enter principle : " ) ;
		double r = getInput( "Enter rate of interest : " ) ;
		double n = getInput( "Enter time period in years : " ) ;
		return p * Math.pow((1+r/100), n) ;
	}
	
	public static double calculateRecurringDepositAmount() {

		System.out.println( "\nCalculating Recurring Deposit...\n" );
		double p = getInput( "Enter monthly installment : " ) ;
		double r = getInput( "Enter rate of interest : " ) ;
		double n = getInput( "Enter time period in months : " ) ;
		return p*n + ( n*( n+1 )/2 ) * (r/100) * (1.0/12) ;
	}
	
	public static int getUserChoice() {
	
		System.out.println( "Enter the integer value for choice." ) ;
		System.out.println( "  1 - Term deposit" ) ;
		System.out.println( "  2 - Recurring deposit\n" ) ;
		System.out.print( "Enter choice :" ) ;
		int n = sc.nextInt() ;
		return n ;
	}
	
	public static double getInput( String prompt ) {
		System.out.print( prompt ) ;
		double input = sc.nextDouble() ;
		if( input < 0 ) {
			System.out.println( "Negative numbers are not allowed." ) ;
			System.exit(0);
		}
		return input ;
	}

}
