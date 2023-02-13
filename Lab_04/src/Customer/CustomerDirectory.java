/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Customer;

import java.util.ArrayList;

/**
 *
 * @author zhengzhang
 */
public class CustomerDirectory {

    /**
     * @return the customerlist
     */
    public ArrayList <Customer> getCustomerlist() {
        return customerlist;
    }

    /**
     * @param customerlist the customerlist to set
     */
    public void setCustomerlist(ArrayList <Customer> customerlist) {
        this.customerlist = customerlist;
    }
    ArrayList <Customer> customerlist;
    
    public CustomerDirectory (){
    this.customerlist = new ArrayList<>();
}
    
    public Customer findById (String id){
        for (Customer c:this.customerlist){
            if (c.getPersonID().equals(id)){
                return c;
            }
        }
        return null;
    }
    
    public Customer createCustomer(String id, String name, String age){
        Customer c= new Customer();
        c.setPersonID(id);
        c.setName(name);
        c.setAge(age);
         this.customerlist.add(c);
         return c;
       
        
        
    }
}
