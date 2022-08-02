package digitsum;

import java.math.*;
import java.util.Scanner;

public class BigIntegerDigitSum {
    public static void main(String[] args) {
        while(true){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the base of the big integer: ");
        double base = sc.nextDouble();
        System.out.println();
        System.out.print("Please enter the power of the big integer: ");
        int power = sc.nextInt();
        System.out.println();
        if( (base==0 && power==0) || (base < 0 && power > 0 && power % 2 ==1)) {
            System.out.println("\nCannot construct this number !!\n");
            break;
        } else {
            if(power < 0) {
                base = 1 / base;
                power = - power;
                String s = String.valueOf(Math.pow(base,power));
                s = s.substring(2,s.length());
                int digitSum = 0, evenDigitSum = 0, oddDigitSum = 0;
                for(int i = 0; i<s.length(); i++) {
                	int digit = (int) (s.charAt(i) - '0');
                	if(digit%2==0) {
                		evenDigitSum = evenDigitSum + digit;
                	} else {
                		oddDigitSum = oddDigitSum + digit;
                	}
                	digitSum = digitSum + digit;
                }
                
                try {
					Thread.sleep(2500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                System.out.println("-------------------STATISTICS ---------------");
                System.out.println("This decimal contains "+(s.length()+1)+" digits in total");
                System.out.println("This decimal contains "+s.length()+" digits after the dot symbol");
                System.out.println("The sum of the odd digits of this decimal after the dot symbol is: "+oddDigitSum+"");
                System.out.println("The sum of the even digits of this decimal after the dot symbol is: "+evenDigitSum+"");
                System.out.println("The sum of the digits of this decimal after the dot symbol is: "+digitSum+"");
                System.out.println("-------------------STATISTICS --------------- \n");
            } else {
               base = Math.round(base);
               BigInteger bi = BigInteger.valueOf((int)base).pow(power);
               String s = String.valueOf(bi);
               int summation = 0, evenDigSum = 0, oddDigSum = 0;
               for(int j = 0; j < s.length(); j++) {
                    int digit = (int) (s.charAt(j) - '0');
                    if(digit%2==0) {
                    	evenDigSum = evenDigSum + digit;
                	} else {
                		oddDigSum = oddDigSum + digit;
                	}
                    summation = summation + digit;
               }
               try {
					Thread.sleep(2500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
               System.out.println("-------------------STATISTICS ---------------");
               System.out.println("This number contains "+s.length()+" digits !");
               System.out.println("The sum of the odd digits of this positive (or zero) big integer is: " + oddDigSum +"");
               System.out.println("The sum of the even digits of this positive (or zero) big integer is: " + evenDigSum +"");
               System.out.println("The sum of the digits of this positive (or zero) big integer is: " + summation +"");
               System.out.println("-------------------STATISTICS --------------- \n");
               
             }
        }
    }
}
}
