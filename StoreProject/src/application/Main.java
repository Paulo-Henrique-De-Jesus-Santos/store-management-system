package application;

import services.ProductService;

public class Main {
    void main(String[] args) {
        ProductService productService = new ProductService();
        MainAdmin mainAdmin = new MainAdmin();
        mainAdmin.main(productService);
    }
}
