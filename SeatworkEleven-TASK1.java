import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		double weight;
		double newWeight;
		int choice;
		
		
		System.out.println("Weight Conversation Program");
		System.out.println("1: Convert 1lbs to kgs");
		System.out.println("2: Convert kgs to lbs");
		
		System.out.println("Choose an option:");
		choice = scanner.nextInt();
		
		System.out.println(choice);
	}
}
