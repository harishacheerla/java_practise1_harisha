package objects;

import java.util.Scanner;

public class StaticandNonstatic {


	    public static void main(String args[]) {
	    	StaticandNonstatic s= new StaticandNonstatic();
	        s.add(10,20);
	        int result=s.pssitiveornegative();
	    }

	    public void add(int x ,int y) {
	        int a = x;
	        int b = y;
	        int c = a + b;
	        System.out.println("addition " + c);
	    }
	    //Non parameterized method
	  public int pssitiveornegative() {
	    	int number=-1;
	    		
	    		if(number>0) {
	    			System.out.println("Number is Possitive:"+number);
	    		}else if (number<0){
	    			System.out.println("Number is Negative:"+number);
	    		}else 
	    			System.out.println("Number is Zero:"+number);
				return number;
	    		
	    	
	    }
	}
