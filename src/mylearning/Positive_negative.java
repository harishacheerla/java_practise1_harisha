package mylearning;

import java.util.Scanner;

public class Positive_negative {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = obj.nextInt();
		if(number>0) {
			System.out.println("Number is Possitive:"+number);
		}else if (number<0){
			System.out.println("Number is Negative:"+number);
		}else 
			System.out.println("Number is Zero:"+number);
		
	}

}
