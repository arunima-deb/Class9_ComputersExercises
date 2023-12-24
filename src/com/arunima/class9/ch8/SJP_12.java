package com.arunima.class9.ch8;

public class SJP_12 {

	public static void main(String[] args) 
	{
		
		int i = 0;
		do {
			
			i++ ;
			
			if( i%2!=0 )
			{
				continue ;
			}
			
			System.out.println(i) ;
			
		}
		while (i<10) ;
		
	}

}
