package application;

import java.util.Scanner;

import services.ProductService;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductService productService = new ProductService(); // Instância única partilhada por todo o sistema
        int option = -1;

        while (option != 0) {
            System.out.println("========================================");
            System.out.println("          STORE MANAGEMENT SYSTEM       ");
            System.out.println("========================================");
            System.out.println("1 - Admin Menu");
            System.out.println("2 - Client Menu");
            System.out.println("0 - Exit");
            System.out.print("Choose an option: ");

            try {
                option = Integer.parseInt(sc.nextLine());

                switch (option) {
                    case 1:
                        System.out.println("Accessing Admin Menu...");

                        MainAdmin.menu(sc, productService);
                        break;

                    case 2:
                        System.out.println("Accessing Client Menu...");
                        MainClient.menu(sc, productService);
                        break;

                    case 0:
                        System.out.println("Exiting system. Goodbye!");
                        break;

                    default:
                        System.out.println("Invalid option! Please choose 1, 2, or 0.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number.");
            }

            System.out.println();
        }

        sc.close();
    }
}