/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommercesystem;

import ecommercesystem.Order;
import ecommercesystem.Payment;
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

//    public Order checkout(ShoppingCart cart) {
////**1        conversion to Optional
//        Optional<Payment> p = ccard.mkPayment(cart.getTotalCost());
////**1        now since we change p into optional it will have an error, why?
////**1        since the constructor is not optional in p, there will be an error
////**1 check if p is present.
//
////**1        return new Order(this, cart, p);
//        return p.isPresent() ? new Order(this, cart, p.get()) : null; //this has a problem
////**1        we must be consistent and use Optional all through out and change null to optional.empty
//    }

//***2
    public Optional<Order> checkout(ShoppingCart cart) {
        //**1        conversion to Optional
        Optional<Payment> p = ccard.mkPayment(cart.getTotalCost());
//**2        now since we change p into optional it will have an error, why?
//**2        since the constructor is not optional in p, there will be an error
//**2 check if p is present.

//**23        return new Order(this, cart, p);
//        return p.isPresent() ? Optional.of(new Order(this, cart, p.get())) : Optional.empty(); //this has a problem
//**2        we must be consistent and use Optional all through out and change null to optional.empty

//chnage the **23 to a functional style expression
//this is called a Lambda expression
        return p.map(value -> new Order(this, cart, value));
    
//   goto LineItem then ShoppingCart
    }

    public CreditCard getCcard() {
        return ccard;
    }

    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", ccard=" + ccard + '}';
    }

}
