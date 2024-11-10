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
public class Payment {

    private final CreditCard creditCard;
    private final UUID transationID;
    private int value;

    public Payment(CreditCard creditCard, UUID transationID, int value) {
        this.creditCard = creditCard;
        this.transationID = transationID;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Payment{" + "creditCard=" + creditCard + ", transationID=" + transationID + ", value=" + value + '}';
    }

}
