package mylearning;

import java.util.Scanner;
public class Square_cube_forthpower
{
public static void main(String[] args)
{
    Scanner in = new Scanner(System.in);
    System.out.println("Input the value:");
    double val = in.nextDouble();

    System.out.printf("square:",Math.pow(val, 2));
    //System.out.printf("Cube: ", Math.pow(val, 3));
    //System.out.printf("Fourth power:", Math.pow(val, 4));
}
}


