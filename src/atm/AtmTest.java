package atm;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AtmTest {

	public static void main(String[] args) throws IOException {
		Scanner input1 = new Scanner(System.in);

		UsersBasa usersBasa = new UsersBasa();

		int choice = -1;
		String toContinue = "y";

		while (toContinue.equalsIgnoreCase("y")) {

			System.out.println("1 ===> Create An Account ");
			System.out.println("2 ===> Transfer Money ");
			System.out.println("3 ===> View All Users Record ");

			boolean correct = false;

			do {
				try {
					correct = true;

					System.out.print("\n");
					System.out.println("Enter your choice: ");
					choice = input1.nextInt();

				} catch (InputMismatchException e) {

					System.out.println("\tWrong input, enter again ==>>");
					input1.nextLine();
					correct = false;
				}

			} while (correct == false);

			switch (choice) {
			case 1:
				usersBasa.addUser();
				break;
			case 2:
				usersBasa.transferMoney();
				break;
			case 3:
				usersBasa.viewAllUsersAccount();
				break;
			default:
				System.out.println("Wrong Entry.");
				break;
			}

			System.out.println("Do you want to continue? Y/N");
			toContinue = input1.next();
			System.out.println("---------------------------------------------------------");
			System.out.println("---------------------------------------------------------");
		}

		input1.close();
	}

}
