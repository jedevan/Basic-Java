#Part F
#26
public class {
	public static void main (String[]args) {
		int[]numbers = {5, 10, 15, 20, 25};

		for (int i = 0; i < numbers.length;i++) {
			System.out.println(numbers[i]);
		}
	}
}

#27

public class Main {
	public static void main(String[]args){
		int arr = new int[47];
	
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[0] = 100;
		
		for(int i = 0; i < arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}

#28
public class Main {
	public class void main (String[]args){
		int[] arr = {10, 20, 10};
	
	for (int i = 0; i < arr.length;i++) {
		System.out.println("Element at Index" + i +";" + arr[i]);
		}
	}
}

#29
public class Main {
	public static void main(String[]args) {
		int[]arr = {10, 20, 30};
		
		sum(arr);
	}

	public static void sum(int[]arr){
		int total = 0;
	
		for (int i=0; i < arr.length; i++) {
			total += arr[i];
		}
		
		System.out.println("Sum =" +total);
	}
}
