import java.util.Scanner;
import java.util.InputMismatchException;

public class StudentGradeCalculator {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

try {
System.out.print("Enter first score: ");
double score1 = scanner.nextDouble();

System.out.print("Enter second score: ");
double score2 = scanner.nextDouble();

double average = (score1 + score2) / 2;
System.out.println("\nAverage Grade: " + average);

} catch (InputMismatchException e) {
System.out.println("\nInvalid input! Please enter numbers only.");

} finally {
System.out.println("Calculation completed.");
scanner.close();
}
}
}
