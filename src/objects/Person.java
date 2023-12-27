package objects;
public class Person {

	String name;
	int age;
	String gender;


	public Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public static void main(String[] args) {
		Person personInstance = new Person("Ishitha", 03, "Female");

		System.out.println("Name: " + personInstance.name);
		System.out.println("Age: " + personInstance.age);
		System.out.println("Gender: " +personInstance. gender);
	}
}


