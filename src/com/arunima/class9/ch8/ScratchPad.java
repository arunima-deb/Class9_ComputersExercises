package com.arunima.class9.ch8;

public class ScratchPad {

	public static void main(String[] args) {
		
		double ct ;
		int sign = 1, sum = 0 ;
		for( int i=0; i<=10; i++ )
		{
			ct = Math.pow(2, i) * sign ;
			sign *= -1 ;
			sum += ct ;
		}
		System.out.println( sum ) ;
		
	}

}
