package objects;

public class ChatApplication {

	public static void main(String[] args) {
		Human h1=new Human();
		h1.Name="Ashrith";
		h1.age=33;
		h1.weight=60;
		h1.Height=130;
		
		h1.speak("hello");
		h1.speak("How are you?");
		
		
		Human h2=new Human();
		h2.Name="Ishitha";
		h2.age=3;
		h2.weight=12;
		System.out.println(h2.Name);

	}

}
