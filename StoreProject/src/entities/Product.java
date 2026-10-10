package entities;

public class Product {

    private String name;
    private Double price;
    private Integer quantity;
    private String category;

    public Product() {
    }

    public Product(String name, Double price, Integer quantity, String category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void addStock(Integer quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("It is not possible to add zero or negative numbers.");
        }
        this.quantity += quantity;
    }

    public void removeStock(Integer quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("It is not possible to remove zero or negative numbers.");
        } else if (this.quantity < quantity) {
            throw new IllegalArgumentException("It is not possible to remove an amount greater than the current one.");
        } else {
            this.quantity -= quantity;
        }
    }

    @Override
    public String toString() {
        return "Product: \n" + "Name: " + name + "\n" + "Price: " + String.format("%.2f", price) + "\n" + "Quantity:  "
                + quantity + "\n" + "Category: " + category + "\n";
    }

}
