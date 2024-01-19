package com.arunima.class9.ch8;

public class TestQuestion1 
{
	public static void main(String[] args) 
	{
		int p = 9, a = 11 ;
		while(a<=15)
		{
			p++ ;
			if( p==10 )
				continue ;
			System.out.println(p) ;
			a++ ;
		}
	}
}
