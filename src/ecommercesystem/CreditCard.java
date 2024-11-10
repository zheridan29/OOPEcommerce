/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommercesystem;

import java.util.Optional;
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

//    use Optional here | use <> for class conversion
    public Optional<Payment> mkPayment(int value) {

        if (Math.random() > 0.3) {
            //use Optional.of() for creating Objects based on Optional
            return Optional.of(new Payment(this, UUID.randomUUID(), value));
        } else {
//            return Optional
            return Optional.empty();
        }
//            goto Customer which has errors
    }

    @Override
    public String toString() {
        return "CreditCard{" + "ccnumber=" + ccnumber + '}';
    }

}
