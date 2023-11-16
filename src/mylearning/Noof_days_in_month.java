package mylearning;

import java.util.Scanner;

public class Noof_days_in_month {

	public static void main(String[] args) {
		 Scanner obj = new Scanner(System.in);
	        System.out.print("Enter Month:");
	        int month = obj.nextInt();
	        int Days=0;
	        if(month==1) {
	        	Days=31;
	        	System.out.print("January:"+Days+"days");
	        }else if(month==2) {
	        	Days=28;
	        	System.out.print("Feb:"+Days+"days");
	        } else if(month==3) {
	        	Days=30;
	        	System.out.print("March:"+Days+"days");
	        }else if(month==4) {
	        	Days=30;
	        	System.out.print("April:"+Days+"days");
	        }else if(month==5) {
	        	Days=31;
	        	System.out.print("May:"+Days+"days");
	        } else if(month==6) {
	        	Days=30;
	        	 System.out.print("June:"+Days+"days");
	        }  else if(month==7) {
	        	Days=31;
	        	System.out.print("July:"+Days+"days");
	        }
	        else if(month==8) {
	        	Days=31;
	        	System.out.print("Aug:"+Days+"days");

	        }else if(month==9) {
	        	Days=30;
	        	System.out.print("Sep:"+Days+"days");
	        }
	        else if(month==10) {
	        	Days=31;
	        	System.out.print("Oct:"+Days+"days");
	        }
	        else if(month==11) {
	        	Days=30;
	        	System.out.print("Nov:"+Days+"days");
	        }
	       	else if(month==12) {
	       		Days=31;
	        	System.out.print("Dec:"+Days+"days");
	        }
	       	else {
	            System.out.println("Invalid month");
	}

}
}
