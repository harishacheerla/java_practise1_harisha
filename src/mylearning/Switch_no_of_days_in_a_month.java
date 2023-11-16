package mylearning;

import java.util.Scanner;

public class Switch_no_of_days_in_a_month {

	public static void main(String[] args) {
				Scanner obj = new Scanner(System.in);
		        System.out.print("Enter Month:");
		        int month = obj.nextInt();
		        int Days=0;
		        switch (month) {
		        case 1:
	            case 3:
	            case 5:
	            case 7:
	            case 8:
	            case 10:
	            case 12:
	            	Days=31;
	            	System.out.println("31 days");
	            	break;
	           	case 4:
	            case 6:
	            case 11:
	            	Days=30;
	            	System.out.println("30 days");
	            	break;
	            case 2:
	            	Days=2;
	            	System.out.println("28 days");
	            	break;
	            	default:
	            		System.out.println("Invalid month. Please enter a valid month between 1 and 12");
		        
		        }

	}

}
