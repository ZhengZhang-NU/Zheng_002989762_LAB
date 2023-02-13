/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Customer;
import java.util.ArrayList;
import Personnel.Person;
import Services.Order;
import Customer.CustomerDirectory;


/**
 *
 * @author zhengzhang
 */
public class Customer extends Person{
    private int ordersTotal;

   ArrayList<Order> customerOrderlist;
   
    public Customer(){
        super();
        this.customerOrderlist=new ArrayList<Order>();
        
    }
    
    public void setCustomerOrderlist(ArrayList<Order> customerOrderlist) {
        this.customerOrderlist = customerOrderlist;
    }
    public int getOrdersTotal(){
        return ordersTotal;
        
    }
    
    public void setOrdersTotal(int ordersTotal){
        this.ordersTotal=ordersTotal;
    }
    
    public ArrayList<Order>getCustomerOrderlist(){
        return customerOrderlist;
    }
    public void addOrder(Order order){
        this.customerOrderlist.add(order);
        
    }
    

}
