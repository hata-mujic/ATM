package atm;

import java.io.IOException;
import java.util.Scanner;

public class AtmTest {

	public static void main(String[] args) throws IOException {
		Scanner input1 = new Scanner(System.in);

		UsersBasa usersBasa = new UsersBasa();
		ArrayBasa arrayBasa = new ArrayBasa();

		int choice;
		String toContinue = "y";

		while (toContinue.equalsIgnoreCase("y")) {

			System.out.println("1 ===> Create An Account ");
			System.out.println("2 ===> Transfer Money ");
			System.out.println("3 ===> View All Users Record ");

			System.out.print("\n\n");
			System.out.println("Enter your choice: ");
			choice = input1.nextInt();

			switch (choice) {
			case 1:
				usersBasa.addUser();
				break;
			case 2:
				usersBasa.transferMoney();
				break;
			case 3:
				arrayBasa.ViewAllUsersAccount();
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
