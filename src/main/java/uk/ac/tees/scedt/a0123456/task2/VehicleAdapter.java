/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uk.ac.tees.scedt.a0123456.task2;

/**
 *
 * @author b1505861
 */
public class VehicleAdapter implements Plane{
    private Vehicle v;

    public VehicleAdapter(Vehicle v) {
        this.v = v;
    }
    
    @Override
    public String getOrigin() {
        return v.getFlightPlan().substring(0,v.getFlightPlan().indexOf("-")).toLowerCase();
    }

    @Override
    public String getDestination() {
        return v.getFlightPlan().substring(v.getFlightPlan().indexOf("-") + 1).toLowerCase();
    }

    @Override
    public int getPassengerCount() {
       return v.getCapacity() - v.getEmptySeats();
    }
    
}
