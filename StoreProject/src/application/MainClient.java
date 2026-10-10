package application;

import java.util.Scanner;

public class MainClient {

    void main(String[] args) {

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
            option = sc.nextInt();

            if (option < 0 || option > 2) {
                System.out.println("You can only choose numbers from within the menu.");
            } else {
                switch (option) {
                    case 0:
                        System.out.println("You have logged out of the client menu.");
                        break;
                    case 1:

                        break;
                }
            }
        } while (option != 0);

    }
}
