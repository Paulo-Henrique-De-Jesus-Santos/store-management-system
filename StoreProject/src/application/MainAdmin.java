package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class MainAdmin {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product> list = new ArrayList<>();

		System.out.println("========================================");
		System.out.println("       STORE MANAGEMENT SYSTEM    ");
		System.out.println("========================================");

		int option;

		do {
			System.out.println();
			System.out.println("1 - Register product");
			System.out.println("2 - List products");
			System.out.println("3 - Search product");
			System.out.println("4 - Remove product");
			System.out.println("5 - Add stock");
			System.out.println("6 - Remove stock");
			System.out.println("0 - Exit");
			System.out.println();
			System.out.print("Choose an option: ");

			option = sc.nextInt();
			System.out.println();

			if (option < 0 || option > 6) {
				System.out.println("You can only choose numbers from within the menu.");
			} else {
				switch (option) {
				case 0:
					System.out.println("You have logged out of the store system.");
					break;
				case 1:
					System.out.println("========================================");
					System.out.println("       PRODUCT REGISTRATION     ");
					System.out.println("========================================");
					System.out.println();
					System.out.print("How many products do you want to register? ");
					int register = sc.nextInt();
					sc.nextLine();

					if (register <= 0) {
						System.out.println("It is not possible to enter zero products or negative numbers.");
					} else {
						for (int i = 1; i <= register; i++) {

							System.out.println();
							System.out.println("Product " + i + "#");
							System.out.println();

							System.out.print("Product name: ");
							String name = sc.nextLine();

							System.out.print("Product price: ");
							double price = sc.nextDouble();
							sc.nextLine();

							System.out.print("Product quantity: ");
							int quantity = sc.nextInt();
							sc.nextLine();

							System.out.print("Product category: ");
							String category = sc.nextLine();

							Product product = new Product(name, price, quantity, category);
							list.add(product);
						}
						System.out.println("Product registered.");
					}

					break;
				case 2:
					if (list.isEmpty()) {
						System.out.println("There are no registered products. Please register a product first.");
					} else {
						System.out.println("Listed products: ");
						System.out.println();
						for (Product product : list) {
							System.out.println(product);
						}
					}

					break;
				case 3:
					if (list.isEmpty()) {
						System.out.println(
								"There are no registered products; you need to register a product first in order to search for one.");
					} else {
						sc.nextLine();
						System.out.print("Which product would you like to search for?");
						String search = sc.nextLine();

						boolean found = false;

						for (Product product : list) {
							if (product.getName().equalsIgnoreCase(search)) {
								System.out.println(product);
								found = true;
								break;
							}
						}
						if (!found) {
							System.out.println("The product could not be found.");
						}

					}
					break;
				case 4:
					try {
						if (list.isEmpty()) {
							System.out.println(
									"There are no registered products; you need to register a product first in order to search for one.");
						} else {
							sc.nextLine();
							System.out.print("Which product do you want to remove from stock?");
							String ChooseRemove = sc.nextLine();

							boolean removeStock = false;

							for (Product product : list) {
								if (product.getName().equalsIgnoreCase(ChooseRemove)) {
									System.out.print("How many units do you wish to pick up?");
									int pickUp = sc.nextInt();
									product.removeStock(pickUp);
									sc.nextLine();
									removeStock = true;
									System.out.println("Updated product.");
									break;
								}
							}

							if (!removeStock) {
								System.out.println("The product could not be found.");
							}
						}

					} catch (IllegalArgumentException e) {
						System.out.println(e.getMessage());
					}
					break;
				}

			}
		} while (option != 0);

		sc.close();

	}
}