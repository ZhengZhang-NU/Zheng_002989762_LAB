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
public class VitalSignHistory {

    /**
     * @return the vitalSignHistory
     */
    public ArrayList<Observation> getVitalSignHistory() {
        return vitalSignHistory;
    }

    /**
     * @param vitalSignHistory the vitalSignHistory to set
     */
    public void setVitalSignHistory(ArrayList<Observation> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    ArrayList<Observation> vitalSignHistory;
    
    public VitalSignHistory(){
        this.vitalSignHistory= new ArrayList<Observation>();
    }
    
    
    public Observation createObservation(int observationId, double bloodPressure, double temperature){
        Observation observation = new Observation();
        observation.setTemperature(temperature);
         observation.setBloodPressure(bloodPressure);
        
         this.getVitalSignHistory().add(observation);
        return observation;
        
        
    }
    
    
    
    
    public boolean checkObservationIdUnique(int id){
        for(Observation o: this.getVitalSignHistory()){
            if(o.getObservationId()==id){
                return false;
            }
        }
        return true;
        
        
        
    }
      public Observation findObservation(int id) {
        for(Observation o: this.vitalSignHistory) {
            if(o.getObservationId() == id) {
                return o;
            }
        }
        
        return null;
    }
}
