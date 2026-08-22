import java.util.Scanner;
public class CondionalStatement{
	public static void main(String[] args){

	String Name;
	String Course;
	int Level;
	float Prelim;
	float Midterm;
	Float Final;
	String Result;

	Scanner s = new Scanner(System.in);

	System.out.print("Enter your name: ");
	Name = s.nextLine();

	System.out.print("Enter your course: ");
	Course = s.nextLine();
	
	System.out.print("Enter your Year Level: ");
	Level = s.nextInt();

	System.out.print("Enter your prelim grade: ");
	Prelim = s.nextFloat();

	System.out.print("Enter your midterm grade: ");
	Midterm = s.nextFloat();
	
	System.out.print("Enter your final garde: ");
	Final = s.nextFloat();

	s.close();
	
	float average = (Prelim + Midterm + Final)/3;

	if (average >= 75){
		Result = "PASSED";

	} else {
		Result = "FAILED";
	}

	System.out.println("Name: " + Name);
	System.out.println("Course: " + Course);
	System.out.println("Year Level: " + Level);
	System.out.println("Prelim: " + Prelim);
	System.out.println("Midterm Grade: " + Midterm);
	System.out.println("Final Grade: " + Final);
	System.out.println("Average: " + average);
	System.out.println("Remark: " + Result);

}

}
