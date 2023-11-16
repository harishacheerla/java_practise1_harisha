package mylearning;

import java.util.Scanner;

public class Noof_days_in_month {

	public static void main(String[] args) {
		 Scanner obj = new Scanner(System.in);
	        System.out.println("Enter Month:");
	        int month = obj.nextInt();
	        int Days=0;
	        if(month==1) {
	        	Days=31;
	        	System.out.println("January:"+Days+"days");
	        }else if(month==2) {
	        	Days=28;
	        	System.out.println("Feb:"+Days+"days");
	        } else if(month==3) {
	        	Days=30;
	        	System.out.println("March:"+Days+"days");
	        }else if(month==4) {
	        	Days=30;
	        	System.out.println("April:"+Days+"days");
	        }else if(month==5) {
	        	Days=31;
	        	System.out.println("May:"+Days+"days");
	        } else if(month==6) {
	        	Days=30;
	        	 System.out.println("June:"+Days+"days");
	        }  else if(month==7) {
	        	Days=31;
	        	System.out.println("July:"+Days+"days");
	        }
	        else if(month==8) {
	        	Days=31;
	        	System.out.println("Aug:"+Days+"days");

	        }else if(month==9) {
	        	Days=30;
	        	System.out.println("Sep:"+Days+"days");
	        }
	        else if(month==10) {
	        	Days=31;
	        	System.out.println("Oct:"+Days+"days");
	        }
	        else if(month==11) {
	        	Days=30;
	        	System.out.println("Nov:"+Days+"days");
	        }
	       	else if(month==12) {
	       		Days=31;
	        	System.out.println("Dec:"+Days+"days");
	        }
	       	else {
	            System.out.println("Invalid month");
	}

}
}
