package objects;

public class Human {
    String Name;
    int age;
    int Height;
    double weight;
    
	void speak(String content) 
	{
		System.out.println(Name + "-" + content);
	}
	void age(String content) 
	{
		System.out.println("happy Birthday " + Name);
		age++;
	}

}
