/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Restaurant;

import Personnel.Person;
import Services.Order;
import java.util.ArrayList;

/**
 *
 * @author zhengzhang
 */
public class DeliveryAgent extends Person {

    public int getOrderCount() {
        return orderCount;
    }

    public ArrayList<Order> getAgentOrderlist() {
        return agentOrderlist;
    }

    public void setOrderCount(int orderCount) {
        this.orderCount = orderCount;
    }

    public void setAgentOrderlist(ArrayList<Order> agentOrderlist) {
        this.agentOrderlist = agentOrderlist;
    }

    private int orderCount;
    private ArrayList<Order> agentOrderlist;

    public DeliveryAgent(){
        super();
        this.agentOrderlist =new ArrayList<Order>();
        
    }
    
     public void addDeliveryOrder(Order o){
        this.agentOrderlist.add(o);
    }
    
    
}
