package atm;

import java.io.IOException;
import java.util.Scanner;

public class AtmTest {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);

		UsersBasa usersBasa = new UsersBasa();
		
		String choice;
		
		System.out.println("1 ===> Create An Account ");
		System.out.println("2 ===> Transfer Money ");
		System.out.println("3 ===> View All Users Record ");
		
		System.out.print("\n\n");
		System.out.println("Enter your choice: ");

		choice = input.nextLine();
		switch (choice) {
		case "1":
			usersBasa.addUser();
			break;
		case "2":
			usersBasa.transferMoney();
			break;
		case "3":
			usersBasa.viewAllDataUser();
			break;
		default:
			System.out.println("Wrong Entry.");
			break;
		}

		input.close();
	}
}
