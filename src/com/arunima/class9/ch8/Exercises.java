package com.arunima.class9.ch8;

import java.util.Scanner ;

public class Exercises 
{
	public static void ReviewQe()
	{
		int p = 200;
		while(true)
		{
			if(p<100)
			{
				break;
			}
			p=p-20 ;
			System.out.println(p);
		}
	}
	
	public static void ReviewQmn()
	{
		int m=2;
		int n=15;
		for(int i=1;canLoop(i);i++)
		{
			m++;
			System.out.println(m + " " + i + " " + (i<5)) ;
		}	
			--n;
		System.out.println("m="+m);
		System.out.println("n="+n);
	}
	
	public static boolean canLoop( int i ) {
		System.out.println( "i<5 - [i=" + i + "] - " + (i<5)) ;
		return i<5 ;
	}
	
	
	public static void main( String args[] )
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.print( "Enter question no : " ) ;
		String ch = sc.next() ;
		
		switch(ch)
		{
		case "e" : Exercises.ReviewQe() ;
		case "mn" : Exercises.ReviewQmn();
		
		}
		
		sc.close() ;
	}
	
}
