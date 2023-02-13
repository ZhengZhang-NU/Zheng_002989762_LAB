/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Customer.CustomerDirectory;
import Restaurant.DeliveryAgentDirectory;
import Services.MasterOrderDirectory;

/**
 *
 * @author zhengzhang
 */
public class Business {

    public UserAccountDirectory getUseraccountDirectory() {
        return useraccountDirectory;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public DeliveryAgentDirectory getDeliveryAgentDirectory() {
        return deliveryAgentDirectory;
    }

    public MasterOrderDirectory getAllOrders() {
        return allOrders;
    }

    public void setUseraccountDirectory(UserAccountDirectory useraccountDirectory) {
        this.useraccountDirectory = useraccountDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public void setDeliveryAgentDirectory(DeliveryAgentDirectory deliveryAgentDirectory) {
        this.deliveryAgentDirectory = deliveryAgentDirectory;
    }

    public void setAllOrders(MasterOrderDirectory allOrders) {
        this.allOrders = allOrders;
    }

    private UserAccountDirectory useraccountDirectory;
    private CustomerDirectory customerDirectory;
    private DeliveryAgentDirectory deliveryAgentDirectory;
    private MasterOrderDirectory allOrders;

    public Business() {
        this.useraccountDirectory = new UserAccountDirectory();
        this.customerDirectory = new CustomerDirectory();
        this.deliveryAgentDirectory = new DeliveryAgentDirectory();
        this.allOrders = new MasterOrderDirectory();
        UserAccount user =this.useraccountDirectory.createUserAccount("admin", "admin","manager");
    }

    public static Business getBusinessInstance() {
        return new Business();
    }
    
}
