/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommercesystem;

/**
 *
 * @author zheridan29
 */
public class Customer {

    private final String name;
    private CreditCard ccard;

    public Customer(String name, long ccnumber) {
        this.name = name;
        this.ccard = new CreditCard(ccnumber);//composition
    }

    public Order checkout(ShoppingCart cart) {
        Payment p = ccard.mkPayment(cart.getTotalCost());
        return new Order(this, cart, p);
    }

    public CreditCard getCcard() {
        return ccard;
    }

    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", ccard=" + ccard + '}';
    }

}
