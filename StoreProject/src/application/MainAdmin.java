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

			switch (option) {
			case 1:
				System.out.println("========================================");
				System.out.println("       PRODUCT REGISTRATION     ");
				System.out.println("========================================");
				System.out.println();
				System.out.print("How many products do you want to register? ");
				int register = sc.nextInt();
				sc.nextLine();

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
				break;
			case 2:
				System.out.println("Listed products: ");
				System.out.println();
					for(Product product : list) {
						System.out.println(product);
					}
				break;
			}
		} while (option != 0);

		sc.close();
	}

}
