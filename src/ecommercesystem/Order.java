/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommercesystem;

/**
 *
 * @author zheridan29
 */
public class Order {

    private final Customer customer;
    private final ShoppingCart cart;
    private final Payment payment;

    public Order(Customer customer, ShoppingCart cart, Payment payment) {
        this.customer = customer;
        this.cart = cart;
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "Order{" + "customer=" + customer + ", cart=" + cart + ", payment=" + payment + '}';
    }

}
