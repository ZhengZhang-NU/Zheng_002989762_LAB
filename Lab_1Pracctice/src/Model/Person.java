/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author zhengzhang
 */
public class Person {

    String firstName;
    Address address;
    String NUID;
    String lastName;
    String collegeName;
    public ContactInformation contactInformation;
    

    public Person() {
        this.firstName = "";
        this.address= new Address();
        this.lastName="";
        this.collegeName="";
        this.NUID = "";
        this.contactInformation = new ContactInformation();
        
        
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(Address address) {
        this.address = address;
    }
    
    
    /**
     * @return the NUID
     */
    public String getNUID() {
        return NUID;
    }

    /**
     * @param NUID the NUID to set
     */
    public void setNUID(String NUID) {
        this.NUID = NUID;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the collegeName
     */
    public String getCollegeName() {
        return collegeName;
    }

    /**
     * @param collegeName the collegeName to set
     */
    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
    
      /**
     * @return the contactInformation
     */
    public ContactInformation getContactInformation() {
        return contactInformation;
    }

    /**
     * @param contactInformation the contactInformation to set
     */
    public void setContactInformation(ContactInformation contactInformation) {
        this.contactInformation = contactInformation;
    }


    
    
    
    
   public static void main (String[] args){
        Person p = new Person();
        p.setFirstName("Zheng");
        p.setLastName("Zhang");
        p.setCollegeName("Northeastern");
        p.setNUID("002989762");
        
        Address addr1 = p.getAddress();
        p.setAddress(addr1);
        
        ContactInformation ci1 = p.getContactInformation();
        p.setContactInformation(ci1);
        
       
 
      
    }

  
   
}
