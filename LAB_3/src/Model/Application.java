/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author zhengzhang
 */
public class Application {

    /**
     * @return the history
     */
    public VitalSignHistory getHistory() {
        return history;
    }

    /**
     * @param history the history to set
     */
    public void setHistory(VitalSignHistory history) {
        this.history = history;
    }

    /**
     * @return the catalog
     */
    public Medicine getCatalog() {
        return catalog;
    }

    /**
     * @param catalog the catalog to set
     */
    public void setCatalog(Medicine catalog) {
        this.catalog = catalog;
    }
    VitalSignHistory history;
    Medicine catalog;
     public Application(){
         this.catalog = new Medicine();
         this.history =new VitalSignHistory();
     }
}
