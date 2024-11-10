/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommercesystem;

/**
 *
 * @author zheridan29
 */
public class Product {

    private ProductType type;
    private final String productName;
    private int price;

    public Product(String productName, int price, ProductType type) {
        this.productName = productName;
        this.price = price;
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" + "type=" + type + ", productName=" + productName + ", price=" + price + '}';
    }

}
