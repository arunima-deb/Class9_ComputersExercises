package com.arunima.class9.ch8;

import java.util.Scanner ;

public class PalindromeStr {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.print( "Enter a number : " ) ;
		int input = sc.nextInt() ;
		
		if( isPalindrome( input ) )
		{
			System.out.println( "Palindrome!" ) ;
		}
		else
		{
			System.out.println( "Not a palindrome." ) ;
		}
		
		
		sc.close() ; 
	}
	
	public static boolean isPalindrome( String s ) {
		
		int n = s.length();
		boolean isPalindrome = true ;
		
		for( int i=0 ; i<(n/2) ; i++ )
		{
			if( s.charAt(i)!=s.charAt(n-i-1) )
			{
				isPalindrome = false ;
			}
		}
		return isPalindrome ;
	}

	public static boolean isPalindrome( int input ) {
		return isPalindrome( Integer.toString(input) ) ;
	}
}
