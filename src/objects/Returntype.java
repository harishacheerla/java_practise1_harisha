package objects;

public class Returntype {

	public static void main(String[] args) {
	   method1.checkAge(10);
	  }	
	public class method1 {	
	static int checkAge(int age) {
	    if (age < 18) {
	      System.out.println("Not eligible"); 
	    } else {
	      System.out.println("Eligible");
	      
	    }
		return age;

	  }

	}
}
