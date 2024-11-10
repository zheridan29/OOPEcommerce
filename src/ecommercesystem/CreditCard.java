/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommercesystem;

import java.util.UUID;

/**
 *
 * @author zheridan29
 */
public class CreditCard {

    private final long ccnumber;

    public CreditCard(long ccnumber) {
        this.ccnumber = ccnumber;
    }

    public Payment mkPayment(int value) {

        if (Math.random() > 0.3) {
            return new Payment(this, UUID.randomUUID(), value);
        } else {
            return null;
        }

    }

    @Override
    public String toString() {
        return "CreditCard{" + "ccnumber=" + ccnumber + '}';
    }

}
