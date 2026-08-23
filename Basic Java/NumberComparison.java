import java.util.Scanner;
public class NumberComparison{
	public static void main(String[] args){

	
	float n1;
	float n2;
	
	Scanner s = new Scanner(System.in);

	System.out.print("Enter The First Number: ");
	n1 = s.nextFloat();

	System.out.print("Enter The Second Number: ");
	n2 = s.nextFloat();

if (n1 > n2) {
	System.out.print("The First Number is Greater");
}

else if (n1 == n2){
	System.out.print("The Numbers are Equal");
}

else {
	System.out.print("The Second Number is Greater");
}
	s.close();

}

}
