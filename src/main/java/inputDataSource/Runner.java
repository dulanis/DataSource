package inputDataSource;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		System.out.println("Where would you like to read your data from?");
		System.out.println("\n\t(1) txt file\n\t(2) console input");
		System.out.print("Enter your choice: ");
		
		Scanner sc = new Scanner(System.in);
		int userInput = sc.nextInt();
				
		while (!(userInput >= 1 && userInput <=2)) {
			System.out.print("Not a valid input. Please enter a valid input: ");
			userInput = sc.nextInt();
		}
		
		switch (userInput) {
		case 1:
			Input tfi = new TextFileInput();
			Scanner scanner1 = new Scanner(System.in);
			System.out.print("Please enter the location to your txt file: ");
			String filePath = scanner1.nextLine();
			tfi.setInput(filePath);
			System.out.println(tfi.getInput());
			scanner1.close();
			break;
		case 2:
			System.out.print("Please enter your desired input: ");
			Scanner scanner2 = new Scanner(System.in);
			String input = scanner2.nextLine();
			Input user = new UserInput();
			user.setInput(input);
			System.out.println(user.getInput());
			scanner2.close();
			break;
		default:
			break;
		}
		System.out.println();
		System.out.println("Thank you");
		
		
		sc.close();

	}

}
