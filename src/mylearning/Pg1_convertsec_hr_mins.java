package mylearning;

public class Pg1_convertsec_hr_mins {

	public static void main(String[] args) {
		int totalsec=86399;
	
		int hours = totalsec / 3600;
        int minutes = (totalsec % 3600) / 60;
        int seconds = totalsec % 60;
		
		System.out.println(hours +" hours " + minutes + " minutes " +seconds+ " seconds ");
		

	}

}
