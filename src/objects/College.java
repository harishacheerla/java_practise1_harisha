package objects;

public class College 
{
	String studentName="Harisha";
	int rollNo=1;
	String teacherName="Vaibhav";
public static void main(String args[]) {
	College c=new College();
		c.teacher();
		c.student();
	
}
public void teacher()
{
	System.out.println("TeacherName"+ " - " + teacherName);
}
public void student()
{
	System.out.println("Student Name" + " - " +studentName );
	System.out.println("Student Roll no" + " - " +rollNo );
}
}



		
