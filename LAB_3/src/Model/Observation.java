/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author zhengzhang
 */
public class Observation {

    /**
     * @param observationId the observationId to set
     */
    public void setObservationId(int observationId) {
        this.observationId = observationId;
    }

    /**
     * @return the bloodPressure
     */
    public double getBloodPressure() {
        return bloodPressure;
    }

    /**
     * @param bloodPressure the bloodPressure to set
     */
    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    /**
     * @return the temperature
     */
    public double getTemperature() {
        return temperature;
    }

    /**
     * @param temperature the temperature to set
     */
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    /**
     * @return the observationId
     */
    public int getObservationId() {
        return observationId;
    }

 
    int observationId;
   double bloodPressure;
    double temperature;
    
    public Observation(){
        
    }
    
    
    
}
