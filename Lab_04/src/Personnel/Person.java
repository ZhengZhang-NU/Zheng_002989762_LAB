/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnel;

/**
 *
 * @author zhengzhang
 */
public class Person {

    String personID;
    String name;
    String age;

    public Person() {

    }

    public Person(String personID, String name, String age) {
        this.personID = personID;
        this.name = name;
        this.age = age;

    }

    /**
     * @return the personID
     */
    public String getPersonID() {
        return personID;
    }

    /**
     * @param personID the personID to set
     */
    public void setPersonID(String personID) {
        this.personID = personID;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public String getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.personID;
    }
}
