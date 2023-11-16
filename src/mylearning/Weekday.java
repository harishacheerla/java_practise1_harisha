package mylearning;

import java.util.Scanner;

public class Weekday {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
        System.out.print("Enter name of the Weekday:");
        int weekday = obj.nextInt();
        String Day_name="";
        switch(weekday) {
        case 1: 
        Day_name="Sunday";
        System.out.println("Sunday");
        break;
        case 2: 
            Day_name="Monday";
            System.out.println("Monday");
            break;
        case 3: 
            Day_name="Tuesday";
            System.out.println("Tuesday");
            break;
        case 4: 
            Day_name="Wednesday";
            System.out.println("Wednesday");
            break;
        case 5: 
            Day_name="Thursday";
            System.out.println("Thursday");
            break;
        case 6: 
            Day_name="Friday";
            System.out.println("Friday");
            break;
        case 7: 
            Day_name="Saturday"; 
            System.out.println("Saturday");
         default:
            	System.out.println("day is not a valid number or not in between 1 to 7");

        }

	}

}
