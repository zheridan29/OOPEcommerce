/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommercesystem;

import java.util.Optional;

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

    public Optional<Order> checkout(ShoppingCart cart) {
        Optional<Payment> p = ccard.mkPayment(cart.getTotalCost());
//        return p.isPresent() ? Optional.of(new Order(this, cart, p.get())) : Optional.empty();
        //Lambda expression
        return p.map(value -> new Order(this, cart, value));
        
    }
    
    public CreditCard getCcard() {
        return ccard;
    }

    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", ccard=" + ccard + '}';
    }

}
