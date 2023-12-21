package objects;

public class Keyword {

	   static String name="Harisha ";
	   static int age=32;

	    public Keyword(String name, int age) {
	    	 System.out.println("local variable:"+name + age); 
	    	 System.out.println("instance variable:"+this.name +this.age); 
	    }

		  public static void main(String[] args) {
			  Keyword person = new Keyword("Ishitha ", 03);
			
		  }

	    }

	