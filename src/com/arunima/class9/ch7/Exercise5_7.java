package com.arunima.class9.ch7;
import java.util.Scanner ;

public class Exercise5_7 
{
	public static void main( String args[] )
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println( "Enter 3 unequal numbers : " ) ;
		int a = sc.nextInt() ; 
		int b = sc.nextInt() ;
		int c = sc.nextInt() ;
		
		int max_ab = Math.max(a, b) ;
		int max = Math.max(max_ab, c) ;
		int min_ab = Math.min(a, b) ;
		int min = Math.min(min_ab, c) ;
		int sum = a+b+c ;
		int second = sum - max - min ;
		
		System.out.println( "The second smallest number is " + second ) ;
		
		sc.close();
	}
	
}
