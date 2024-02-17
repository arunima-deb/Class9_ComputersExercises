package com.arunima.class9.ch8;

import java.util.Scanner ;

// correct :)
public class MonkeyPole {

	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter pole height: ");
        double ph = sc.nextDouble();
        double jh = 5.0;
        int numJ = 1;
        while (jh < ph) {
            jh += 5.0;
            jh -= 2 * jh / 100.0;
            numJ++;
        }
        System.out.println("Number of Attempts = " + numJ);
        
        sc.close() ;
	}

}
