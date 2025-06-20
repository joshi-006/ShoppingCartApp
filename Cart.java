package Project;

class Cart {
    private Product[] items;
    private int count = 0;
    public Cart(int size) {
        items = new Product[size];
    }
    public void addProduct(Product product) {
        if (count < items.length) {
            items[count++] = product;
            System.out.println(product.Name + " added to cart."); 
        } else {
            System.out.println("Cart is full.");
        }
    }
    public void displayCart() {
        if (count == 0) {
            System.out.println("🛒 No items in cart!");
            return;
        }

        double totalBill = 0;
        for (int i = 0; i < count; i++) {
            items[i].display(); 
            totalBill += items[i].finalPrice(); 
        }
        System.out.println(" Total: $" + totalBill);
    }
}

