/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Customer.Customer;
import Restaurant.DeliveryAgent;

/**
 *
 * @author zhengzhang
 */
public class Order {


   
    Customer customer;
    DeliveryAgent agent;
    static int count=0;
    String orderId;
    String status;
    
    public Order(){
        this.customer =new Customer();
        this.agent =new DeliveryAgent();
        this.status="Created";
        this.count++;
        this.orderId= "ORDERNO"+this.count;
        
    }
    
       public Order(Customer customer, DeliveryAgent agent){
        this.customer =customer;
        this.agent =agent;
        this.status="Created";
        this.count++;
        this.orderId= "ORDERNO"+this.count;
        
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
     * @return the agent
     */
    public DeliveryAgent getAgent() {
        return agent;
    }

    /**
     * @param agent the agent to set
     */
    public void setAgent(DeliveryAgent agent) {
        this.agent = agent;
    }

    /**
     * @return the count
     */
    public static int getCount() {
        return count;
    }

    /**
     * @param aCount the count to set
     */
    public static void setCount(int aCount) {
        count = aCount;
    }

    /**
     * @return the orderId
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * @param orderId the orderId to set
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
  @Override
  public String toString(){
      return this.orderId;
  }
    
   
    
}
