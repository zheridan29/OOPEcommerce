/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ecommercesystem;

import java.util.Optional;

/**
 * 
 * @author zheridan29
 */
public class EcommerceSystem {

    public static void main(String[] args) {
//        Product brush = new Product("Brush", 20);
//        Product ballpen = new Product("Ball Pen", 10);


        Product brush1 = Catalogue.getProduct("Brush");//Brush
        Product brush2 = Catalogue.getProduct("Brush");//Brush
        Product ballpen = Catalogue.getProduct("BallPen");//Ball pen
        Product lapis = Catalogue.getProduct("Lapis");//Lapis
        
        ShoppingCart cart = new ShoppingCart();
        System.out.println("CartID: " +cart.getCartID());
        
        //put the product inside the cart
        cart.addProduct(brush1);
        cart.addProduct(brush2);
        cart.addProduct(ballpen);
        cart.addProduct(lapis);
        
        System.out.println(cart);
        System.out.println(cart.getTotalCost());
        
        Customer c1 = new Customer("Ace", 01);
        Optional<Order> or1 = c1.checkout(cart);
        System.out.println(or1);
        
    }
}
