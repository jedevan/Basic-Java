import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);
    
            System.out.print("Enter the number of food you would order: ");
        
        int Norders = s.nextInt();
        s.nextLine();
        ArrayList<String> order = new ArrayList<>();
            for (int i = 0; i < Norders; i++) {
        System.out.print("Enter food number "+ (i +1) + ": ");
        String food = s.nextLine();
        order.add(food);
        
        }
  
        System.out.println(order.toString());
        s.close();
    
    }

}
