class Product {
    String productName;
    int productId;
    double price;
    int quantityInStock;

    // Constructor
    Product(String productName, int productId, double price, int quantityInStock) {
        this.productName = productName;
        this.productId = productId;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    // Method to display product information
    void displayInfo() {
        System.out.println("Product Name: " + productName);
        System.out.println("Product ID: " + productId);
        System.out.println("Price: $" + price);
        System.out.println("Quantity in Stock: " + quantityInStock);
    }
}

class InventorySystem {
    public static void main(String[] args) {
        // Creating some products
        Product product1 = new Product("Laptop", 101, 1200.50, 10);
        Product product2 = new Product("Smartphone", 102, 799.99, 20);

        // Displaying product information
        System.out.println("Product 1:");
        product1.displayInfo();
        System.out.println("\nProduct 2:");
        product2.displayInfo();
    }
}
