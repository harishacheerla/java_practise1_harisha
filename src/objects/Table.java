package objects;

import java.awt.geom.Point2D;

public class Table {

	public static void main(String[] args) {
	Tablechild T1=new Tablechild();
	T1.color="Black";
	T1.size=5.5;
	T1.Holdings("Laptop");
	
	Tablechild T2=new Tablechild();
	T2.size=6.6;
	System.out.println(T1.size);

}
}
