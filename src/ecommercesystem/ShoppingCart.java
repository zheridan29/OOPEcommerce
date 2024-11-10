/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommercesystem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zheridan29
 */
public class ShoppingCart {
//change to LineItem
    private List<Product> productList = new ArrayList();
    private final double cartID;

    public ShoppingCart() {
        this.cartID = Math.random();
    }

    public void addProduct(Product p) {
        this.productList.add(p);
    }

    //computation of the total cost
    public int getTotalCost() {
        return productList.stream()
                .mapToInt(Product::getPrice)
                .sum();
    }

    public double getCartID() {
        return cartID;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" + "products=" + productList + ", cartID=" + cartID + '}';
    }

}
