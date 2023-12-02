package com.arunima.class9.ch7;
import java.util.Scanner ;

public class PracticeQ4 
{
	public static void main( String[] args )
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println( "Enter 3 unequal numbers : " ) ; 
		int a = sc.nextInt() ; 
		int b = sc.nextInt() ; 
		int c = sc.nextInt() ; 
		
		if (a==b || b==c || c==a )
		{
			System.out.println( "Two or more of the entered numbers are equal. Try again." ) ;
		}
		else
		{
			int max = ((a>b)?a:b)>c?((a>b)?a:b):c ;
			int min = ((a<b)?a:b)<c?((a<b)?a:b):c ;
			int sum = a+b+c ;
			int second = sum - max - min ;
			System.out.println( "The second smallest number is " + second ) ; 
		}
		
		sc.close() ;
	}
}
