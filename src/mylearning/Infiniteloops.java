package mylearning;

public class Infiniteloops {

	public static void main(String[] args) {
		while(true) {
			System.out.println("infinite loop");
			infiniteloop();
		}
	}
    public static void infiniteloop() {
   
    	do {
    		System.out.println("do while loop");
        } while (true);
    }
	}

