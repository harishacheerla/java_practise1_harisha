package objects;

public class StaticandNonstatic {


	    public static void main(String args[]) {
	    	StaticandNonstatic s= new StaticandNonstatic();
	        s.add(10,20);
	    }

	    public void add(int x ,int y) {
	        int a = x;
	        int b = y;
	        int c = a + b;
	        System.out.println("addition " + c);
	    }
	}
