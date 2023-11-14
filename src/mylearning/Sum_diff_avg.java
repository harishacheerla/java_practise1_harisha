package mylearning;

import java.util.Scanner;

// Write a Java program that accepts two integers from the user and then prints the sum, the difference, the product, the average, 
//the distance (the difference between integer), the maximum (the larger of the two integers), the minimum (smaller of the two integers).
public class Sum_diff_avg {

	public static void main(String[] args) {
		
		Scanner myobj1 = new Scanner(System.in);
		System.out.println("Enter number a:");
		double  a = myobj1.nextDouble();
		Scanner myobj2 = new Scanner(System.in);
		System.out.println("Enter number b:");
	    double  b = myobj2.nextDouble();
		
		
		
		// Sum of Values
		double sum =a+b;
		System.out.println("Sum : " + sum);		
		
		
		// Difference of Values
		double difference=a-b;
		System.out.println("Difference : " + difference);
		
		//Product
		double product=a*b;
		System.out.println("Product : " + product);
		
		
		// Avg of values
		double avg=sum/2;
		System.out.println("Average:" +avg);
		
		//Avg of distance
		double distance;
		if (a>b) {
		 distance=a-b;
		} else {
			distance = b-a;
		}
		System.out.println("Distance:"+distance);
		//Max and Min Number
		if (a>b) 
		{
			System.out.println("Max:" + a);
		}else { 
				System.out.println("Max:" + b);		
		}
		
		if (a<b) 
		{
			System.out.println("Min:" + a);
		}else { 
				System.out.println("Min:" + b);
				
		}
		
		
	
		
	}
}

	
