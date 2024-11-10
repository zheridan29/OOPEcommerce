/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommercesystem;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author zheridan29
 */
class Catalogue {

//    Java 9 and up
//    public static Map<String, Product> productMap = Map.of(
//        "Brush", new Product("Brush", 20),
//        "BallPen", new Product("Ball Pen", 10)
//    );
// Java 8 and lower
    public static Map<String, Product> productMap = new HashMap();
    
    
    static {
        productMap.put("Brush", new Product("Brush", 20, ProductType.PHYSICAL));
        productMap.put("BallPen", new Product("Ball Pen", 10, ProductType.PHYSICAL));
        productMap.put("Lapis", new Product("Lapis", 10, ProductType.NONPERISHABLE));
    }

    static Product getProduct(String productName) {
        return productMap.get(productName);
    }

}
