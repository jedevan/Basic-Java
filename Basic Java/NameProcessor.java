import java.util.Scanner;
public class NameProcessor {
	public static void main(String[] args) {
	
	String fname;
	String sname;
	String lname;

	Scanner scan = new Scanner(System.in);
	
	System.out.print("Enter your First name: ");
	fname = scan.nextLine();

	System.out.print("Enter your Second name: ");
	sname = scan.nextLine();

	System.out.print("Enter your Last name: ");
	lname = scan.nextLine();

	char initial = sname.charAt(0);
	
	String fullname = fname + "" + initial + "." + sname;
	int count = fname.length() + sname.length() + sname.length();
	System.out.println("Your full name is: " + fullname);
	System.out.println("The length of your Name is: "+count);
	



}
}	
