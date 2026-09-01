import java.util.Scanner;
public class UserCredentials {
	public static void main (String[] args){

	Scanner s = new Scanner(System.in);

	String passwords[] = {"Holy123", "Angel345", "Univesity678", "Foundations123", "Angeles345"};	
	String username[] = {"Jed", "Evan", "Cagulada", "Aminez", "Ming"};	
	String email[] = {"Jed@gmail.com", "Evan@gmail.com", "Cagulada@gmail.com", "Aminez@gmail.com", "Ming@gmail.com"};	

	int index;
	System.out.println("Enter index: ");
	index = s.nextInt();

	if (index == 0){
		System.out.println("Your password is: "+passwords[0]);
		System.out.println("Your username is: "+username[0]);
		System.out.println("Your email is: "+email[0]);
}
	else if (index == 1){
		System.out.println("Your password is: "+passwords[1]);
		System.out.println("Your username is: "+username[1]);
		System.out.println("Your email is: "+email[1]);
}
	else if (index == 2){
		System.out.println("Your password is: "+passwords[2]);
		System.out.println("Your username is: "+username[2]);
		System.out.println("Your email is: "+email[2]);
}
	else if (index == 3){
		System.out.println("Your password is: "+passwords[3]);
		System.out.println("Your username is: "+username[3]);
		System.out.println("Your email is: "+email[3]);
}
	else if (index == 4){
		System.out.println("Your password is: "+passwords[4]);
		System.out.println("Your username is: "+username[4]);
		System.out.println("Your email is: "+email[4]);

}
}
}
