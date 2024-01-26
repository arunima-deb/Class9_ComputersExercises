package com.arunima.class9.ch9;

import java.util.* ;


public class UJP 
{
	private static Scanner sc = new Scanner(System.in) ;
	
	public static void main( String args[] )
	{
		UJP.P6_6() ;
		sc.close() ;
	}
	
	public class UJP_14
	{
		public static void a()
		{
			double sum = 0.0 ;
			int f=1, i, j, n ;
			System.out.print( "Enter upper limit : " ) ;
			n = sc.nextInt() ;
			
			for( i=1; i<=n; i++ )
			{
				f=1 ;
				for( j=1; j<=i; j++ )
					f*=j ;
				sum += Math.pow(f, -1) ;
			}
			
			System.out.println( "Sum = " + sum ) ;
			
		}
		
		public static void b()
		{
			int superSum = 0, subSum = 0, i, j, n ;
			System.out.print( "Enter upper limit : " ) ;
			n = sc.nextInt() ;
			for( i=1; i<=n; i++ )
			{
				subSum = 0 ;
				for( j=1; j<=i; j++ )
					subSum += j ;
				
				superSum += subSum ;
			}
			
			System.out.print( "Sum = " + superSum );
			
		}
		
	}
	
	public static void P6_12()
	{
		for( int i=1; i<=100; i++ )
		{
			int numF = 0 ;
			for( int j=1; j<=i; j++ )
			{
				if( i%j==0 )
					numF++ ;
			}
			if( numF>2 )
				System.out.println( i + " is a composite number." ) ;
		}
	}
	
	public static void P6_1()
	{
		System.out.println( "Table of 5: " ) ;
		for( int i=1; i<=10; i++ )
		{
			System.out.println( 5 + " * " + i + " = " + (5*i) ) ;
		}
	}
	
	public static void P6_2()
	{
		for( int i=1; i<=20; i++ )
		{
			int numF = 0 ;
			System.out.print( "\n\nEnter a number: " );
			int num = sc.nextInt() ;
			for( int j=1; j<=num; j++ )
			{
				if( num%j==0 )
					numF++ ;
					
			}
			if( numF==2 )
				System.out.println( num + " is a prime number." );
			else
				System.out.println( num + " is not prime." ) ;
		}
	}
	
	public static void P6_3() 
	{
		int n;
		double sum = 0.0, num = 0.0, den = 1.0 ;
		System.out.print( "Enter limit : " ) ;
		n = sc.nextInt() ;
		
		for( int i=2; i<=n; i++ )
		{
			for( int j=1; j<=n; j++ )
			{
				num += j ;
				den *= j ;
			}
			sum += num/den ;
		}
		System.out.println( sum );
	}
	
	public static void P6_13()
	{
		for( int i=1; i<=4; i++ )
		{
			int numToppers = 0 ;
			for( int j=1; j<=5; j++ )
			{
				System.out.print( "Enter student name : " ) ;
				String name = sc.next() ;
				System.out.print( "Enter percentage : " ) ;
				double p = sc.nextDouble() ;
				if( p>=95.0 )
					numToppers++ ;
			}
			
			System.out.print( "\n\tSection " + i + " toppers : " + numToppers + "\n\n" ) ;
		}
	}
	
	public static void P6_8()
	{
		System.out.print( "Enter a number : " ) ;
		int num = sc.nextInt() ;
		int numFactOfNum=0, numFactOfRnum=0, numClone=num, reverseNum=0, currentDigit ;
		
		// Determines if number is prime
		for( int i=1; i<=num; i++ )
		{
			if( num%i==0 )
				numFactOfNum++ ;
		}
		
		// Creates and stores reverse of number
		while( num>0 )
		{
			currentDigit = num%10 ;
			reverseNum = (reverseNum*10) + currentDigit ;
			num = num/10 ;
		}

		// Determines if reverse of number is prime
		for( int i=1; i<=reverseNum; i++ )
		{
			if( reverseNum%i==0 )
				numFactOfRnum++ ;
		}
		
		// Determines if number is a twisted prime
		if( numFactOfRnum==2 && numFactOfNum==2 )
			System.out.println( numClone + " is a twisted prime." ) ;
		else
			System.out.println( numClone + " is not a twisted prime." ) ;
		
	}
	
	public static void P6_10()
	{
		// Accept a number
		System.out.print( "Enter a number : " ) ;
		int n = sc.nextInt() ;
		
		// Initialize variables
		int cd, fcd ;
		
		while( n>0 )
		{
			cd = n%10 ;
			fcd = 1;
			
			for( int i=1; i<=cd; i++ )
			{
				fcd *= i ;
			}
			
			System.out.println( "Factorial of " + cd + " = " + fcd ) ;
			
			n = n/10 ;
		}
	}
	
	public static void P6_6()
	{
		System.out.print( "Enter choice : " ) ;
		int c = sc.nextInt() ;
		int numF = 0 ;
		
		switch(c)
		{
		case 1: for( int i=1; i<=100; i++ )
				{
					numF=0 ;
					for( int j=1; j<=i; j++ )
					{
						if( i%j==0 )
							numF++ ;
					}
					
					if( numF==2 )
						System.out.println( i ) ;
						
				}
				break ;
		case 2: for( int i=1; i<=100; i++ )
				{
					numF=0 ;
					for( int j=1; j<=i; j++ )
					{
						if( i%j==0 )
							numF++ ;
					}
					
					if( numF>2 )
						System.out.println( i ) ;
						
				} 
		}
		
	}
	
	public static void ScratchPad()
	{
		
	}
	
}
