package com.bridgelabz.shoppingcart;

import java.util.*;

class ShoppingCart {
    private final Map<String, Double> productPrices = new HashMap<>(); // Stores product prices
    private final Map<String, Integer> cart = new LinkedHashMap<>(); // Maintains order of items added

    // Adds product with price to store
    public void addProduct(String name, double price) {
        productPrices.put(name, price);
    }

    // Adds product to cart
    public void addToCart(String name, int quantity) {
        if (productPrices.containsKey(name)) {
            cart.put(name, cart.getOrDefault(name, 0) + quantity);
        } else {
            System.out.println("Product not found!");
        }
    }

    // Displays cart items in order added
    public void displayCart() {
        System.out.println("Cart Contents (Order Added):");
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            System.out.println(entry.getKey() + " - Quantity: " + entry.getValue() + " - Price: $" + productPrices.get(entry.getKey()));
        }
    }

    // Displays items sorted by price
    public void displaySortedByPrice() {
        TreeMap<Double, String> sortedByPrice = new TreeMap<>();
        for (String name : cart.keySet()) {
            sortedByPrice.put(productPrices.get(name), name);
        }
        System.out.println("Cart Items Sorted by Price:");
        for (Map.Entry<Double, String> entry : sortedByPrice.entrySet()) {
            System.out.println(entry.getValue() + " - Price: $" + entry.getKey());
        }
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Adding products
        cart.addProduct("Laptop", 1200.99);
        cart.addProduct("Phone", 699.49);
        cart.addProduct("Headphones", 199.99);

        // Adding items to cart
        cart.addToCart("Laptop", 1);
        cart.addToCart("Phone", 2);
        cart.addToCart("Headphones", 1);

        // Display cart contents
        cart.displayCart();

        // Display sorted by price
        cart.displaySortedByPrice();
    }
}