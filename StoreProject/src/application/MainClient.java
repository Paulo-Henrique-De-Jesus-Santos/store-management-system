package application;

import entities.Product;
import services.ProductService;

import java.util.Scanner;

public class MainClient {

    public static void menu(Scanner sc, ProductService productService) {
        int option;

        do {
            System.out.println("========================================");
            System.out.println("           CLIENT STORE MENU            ");
            System.out.println("========================================");
            System.out.println("1 - List available products");
            System.out.println("2 - Search product");
            System.out.println("0 - Back to Main Menu");
            System.out.println();
            System.out.print("Choose an option: ");

            try {
                option = Integer.parseInt(sc.nextLine());
                System.out.println();

                switch (option) {
                    case 1:
                        if (productService.getProducts().isEmpty()) {
                            System.out.println("There are no registered products in the store yet.");
                        } else {
                            System.out.println("Available products:");
                            System.out.println();
                            for (Product product : productService.getProducts()) {
                                System.out.println(product);
                            }
                        }
                        break;

                    case 2:
                        if (productService.getProducts().isEmpty()) {
                            System.out.println("There are no registered products to search.");
                        } else {
                            System.out.print("Enter the name of the product you are looking for: ");
                            String search = sc.nextLine();

                            boolean found = false;
                            for (Product product : productService.getProducts()) {
                                if (product.getName().equalsIgnoreCase(search)) {
                                    System.out.println("Product found: " + product);
                                    found = true;
                                    break;
                                }
                            }

                            if (!found) {
                                System.out.println("Product not found.");
                            }
                        }
                        break;

                    case 0:
                        System.out.println("Returning to the main menu...");
                        break;

                    default:
                        System.out.println("Invalid option! Please choose 1, 2, or 0.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number.");
                option = -1;
            }

            System.out.println();
        } while (option != 0);
    }
}