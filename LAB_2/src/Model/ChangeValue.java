/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author zhengzhang
 */
public class ChangeValue {

    ArrayList<Product> productList;

    public Product change() {
        for (Product p : this.productList) {
            if (productList.indexOf(p) / 2 == 0) {
                p.setProductPrice(2 * p.getProductPrice());
                return p;
            } else {
                p.setProductPrice(3 * p.getProductPrice());
                return p;
            }

        }
        return null;
    }

}
