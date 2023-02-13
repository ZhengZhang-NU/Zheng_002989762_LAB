/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import UI.CustomerWorkArea.CustomerJFrame;
import UI.DeliveyAgentDirectory.AgentJFrame;
import UI.ManegerWorkArea.ManagerJFrame;
import javax.swing.JFrame;

/**
 *
 * @author zhengzhang
 */
public class UserAccount {

    /**
     * @return the role
     */
    public String getRole() {
        return role;
    }

    /**
     * @param role the role to set
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * @return the accountId
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * @param accountId the accountId to set
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        UserAccount.count = count;
    }

    private static int count = 0;
    String accountId;
    String username;
    String password;

    String role;

    public UserAccount() {
        this.accountId = "ACC" + count++;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public UserAccount(String username, String password, String role) {
        this.accountId = role + count++;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public JFrame getWorkArea(String role, Business business, UserAccount useraccount) {
        if (role.equals("manager")) {
            return new ManagerJFrame(business, useraccount);
        }
        if (role.equals("customer")) {
            return new CustomerJFrame(business, useraccount);
        }
        if (role.equals("agent")) {
            return new AgentJFrame(business, useraccount);
        }
        return null;
    }
}
