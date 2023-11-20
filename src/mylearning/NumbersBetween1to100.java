package mylearning;

import java.util.Scanner;
//program to print numbers between 1 to 100 which are divisible by 3, 5 and by both
public class NumbersBetween1to100 {

	public static void main(String[] args) {
		//Scanner obj1 = new Scanner(System.in);
        //System.out.println("Enter numbers between 1 to 100:");
        //int num1=obj1.nextInt();
        for(int num1=0;num1<=100;num1++) {          
         if((num1 % 3==0)&&(num1 % 5==0)) {
        	 System.out.println("Number is divisible by 3 & 5: " + num1);
         } else if (num1 % 3 == 0) {
        	 System.out.println("Number is divisible by 3:" + num1);
         } else if (num1 % 5 == 0) {
        	 System.out.println("Number is divisible by 5:" + num1);
        }
        }
	}

	}



