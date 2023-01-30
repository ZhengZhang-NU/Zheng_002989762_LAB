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
public class DeliveryPackage {

    int packageId;
    double packageWeight;
    ArrayList<Product> productList;
    Customer customer;

    public DeliveryPackage() {
        this.productList = new ArrayList<Product>();

        this.customer = new Customer();
    }

    /**
     * @return the packageId
     */
    public int getPackageId() {
        return packageId;
    }

    /**
     * @param packageId the packageId to set
     */
    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    /**
     * @return the packageWeight
     */
    public double getPackageWeight() {
        return packageWeight;
    }

    /**
     * @param packageWeight the packageWeight to set
     */
    public void setPackageWeight(double packageWeight) {
        this.packageWeight = packageWeight;
    }

    /**
     * @return the customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * @return the productList
     */
    public ArrayList<Product> getProductList() {
        return productList;
    }

    /**
     * @param productList the productList to set
     */
    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }

    public Product createProduct(int productId, double productPrice, String productName) {
        Product p = new Product();

        p.setProductId(productId);
        p.setProductName(productName);
        p.setProductPrice(productPrice);

        this.productList.add(p);//add product into product list
        return p;
    }

    public Product findProduct(int pid) {
        for (Product p : this.productList) {
            if (p.getProductId() == pid) {
                return p;
            }
        }

        return null;
    }
}
