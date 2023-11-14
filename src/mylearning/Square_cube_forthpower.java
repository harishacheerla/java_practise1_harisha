package mylearning;

import java.util.Scanner;
public class Square_cube_forthpower
{
	 public static void main(String[] args)
	    {
	        Scanner in = new Scanner(System.in);
	        System.out.print("Enter the value: ");
	        double val = in.nextDouble();
	        double square=Math.pow(val, 2);
	        double cube=Math.pow(val, 3);
	        double fourth_power=Math.pow(val, 4);
	        System.out.println("Square: "+square);
	        System.out.println("Cube: "+cube);
	        System.out.println("fourth power: "+fourth_power);
	       
	    }
}
