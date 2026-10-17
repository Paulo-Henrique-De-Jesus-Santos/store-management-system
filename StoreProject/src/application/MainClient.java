package application;

import entities.Product;
import services.ProductService;

import java.util.Scanner;

public class MainClient {

    void main(ProductService productService) {

        Scanner sc = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("            CLIENT MENU            ");
        System.out.println("========================================");

        int option;

        do {

            System.out.println();
            System.out.println("1 - List products");
            System.out.println("2 - Search product");
            System.out.println("0 - Back to main menu");
            System.out.print("Choose an option: ");
            option = Integer.parseInt(sc.nextLine());
            System.out.println();

            if (option < 0 || option > 2) {
                System.out.println("You can only choose numbers from within the menu.");
            } else {
                switch (option) {
                    case 0:
                        System.out.println("You have logged out of the client menu.");
                        break;
                    case 1:
                        if (productService.getProducts().isEmpty()) {
                            System.out.println("No products available at the moment.");
                        } else {
                            System.out.println("--- LIST OF AVAILABLE PRODUCTS ---");
                            System.out.println();
                            for (Product product : productService.getProducts()) {
                                System.out.println(product);
                            }
                        }
                        break;
                    case 2:
                        if (productService.getProducts().isEmpty()) {
                            System.out.println("No products available at the moment.");
                        } else {
                            System.out.print("Which product would you like to search for? ");
                            String search = sc.nextLine();

                            boolean found = false;

                            for (Product product : productService.getProducts()) {
                                if (product.getName().toLowerCase().contains(search.toLowerCase())) {
                                    System.out.println(product);
                                    found = true;
                                    break;
                                }
                            }
                            if (!found) {
                                System.out.println("The product could not be found. ");
                            }

                            break;
                        }
                }
            }
        }
        while (option != 0);

    }
}
