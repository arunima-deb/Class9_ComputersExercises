package com.arunima.class9.ch8;

import java.util.* ;

public class Ex_q10 
{
	public static void main( String args[] )
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.print( "Enter a number : " ) ;
		int num = sc.nextInt() ;
		int currentDigit, reverseNum=0, numClone = num ;
		
		while(num>0)
		{
			currentDigit = num%10 ;
			reverseNum = (reverseNum*10) + currentDigit ;
			num=num/10 ;
		}
		
		System.out.println( "Reverse of " + numClone + " is " + reverseNum ) ;
		System.out.print( "Absolute Difference = " + Math.abs((numClone-reverseNum))) ;
		
	}
}