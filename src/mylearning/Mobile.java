package mylearning;

public class Mobile {

	public static void main(String[] args) {
		Application a1=new Application();
		a1.colour="Blue";
		a1.Model="Rono5";
		a1.CompanyName="OPPO";
		a1.size=5.6;
		a1.comminication("Incoming calls");
		System.out.println(a1.colour);
		//System.out.println(a1.CompanyName);
		
		Application a2=new Application();
		a2.colour="Black";
		a2.CompanyName="Apple";
		a2.photos();
		System.out.println(a1.CompanyName);
	}
	
}
