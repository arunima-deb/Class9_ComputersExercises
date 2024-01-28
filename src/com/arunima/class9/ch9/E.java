package com.arunima.class9.ch9;

public class E {

	static E runner = new E() ;
	
	public static void main(String[] args) 
	{
		runner.runE1() ;
	}

	public void runE1()
	{
		for( int r=1; r<=5; r++ )
		{
			for( int c=1; c<=r; c++ )
				System.out.print( r + " " );
			System.out.println();
		}
	}
	
}
