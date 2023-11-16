package mylearning;

import java.util.Scanner;

public class Fahrenheit_celsius_kelvin {

	public static void main(String[] args) {
		
		Scanner myobj1 = new Scanner(System.in);
		System.out.println("Enter temperature in Celsius to convert:");
		double  C = myobj1.nextDouble();
   
		Double K=0.0;
		Double Kelvin=C+273.15;
		Double F=1.8*C+32;
		System.out.println(Kelvin + " Kelvin");
	    System.out.println(F + " Fahrenheit");
		
		

	}

}
