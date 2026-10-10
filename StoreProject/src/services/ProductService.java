package services;

import entities.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductService {

    private List<Product> list = new ArrayList<>();

    public void addProduct(Product product) {
        this.list.add(product);
    }

    public boolean removeProduct(String name) {
        Iterator<Product> iterator = list.iterator();

        while (iterator.hasNext()) {
            Product product = iterator.next();

            if (product.getName().equalsIgnoreCase(name)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public List<Product> getProducts() {
        return new ArrayList<>(list);
    }
}
