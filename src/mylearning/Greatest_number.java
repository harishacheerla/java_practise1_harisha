package mylearning;

import java.util.Scanner;

public class Greatest_number {
  //Take three numbers from the user and print the greatest number
	public  static void main(String[] args) {
		Scanner obj1 = new Scanner(System.in);
        System.out.print("Enter a number1:");
        int num1=obj1.nextInt();
        Scanner obj2 = new Scanner(System.in);
        System.out.print("Enter a number2:");
        int num2=obj2.nextInt();
        Scanner obj3 = new Scanner(System.in);
        System.out.print("Enter a number3:");
        int num3=obj3.nextInt();
        if (num1<num2) {
        System.out.print("number2 is greatest");
        }else if (num2<num3) {
        System.out.print("number3 is greatest");	
        }else
        System.out.print("number1 is greatest");
        }
        
      
	}


