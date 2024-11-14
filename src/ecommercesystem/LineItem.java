/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommercesystem;

/**
 *
 * @author zheridan29
 */

public class LineItem {

    private Product product;
    private int quantity;

    public LineItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getPrice() {
//        return product.getPrice() * quantity;
//          return product.price * quantity;
//  but now the bussiness changes the requirements
//  we have to store and apply percentage discounts to product prices
//  put the discount in the Product class - goto product

//change after Product putting discount

// add the computation of discount here
int price = product.price * ((100 - product.discount)/100);
//Queation? what will happen to other class that uses the price var ? (it will all change)
return price * quantity;

//NEXT - if instead we encapsulate calculating a price and the getPrice method
//and placed the computation of price inside the Product class itself


    }

    @Override
    public String toString() {
        return "LineItem{" + "product=" + product + ", quantity=" + quantity + '}';
    }

}
