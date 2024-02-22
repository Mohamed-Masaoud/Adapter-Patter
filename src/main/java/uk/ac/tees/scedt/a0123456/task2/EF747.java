/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uk.ac.tees.scedt.a0123456.task2;

/**
 *
 * @author b1505861
 */
public class EF747 implements Plane{

    private String destination;
    private String origin;
    private int passengerCount;

    public EF747(String origin, String destination, int passengerCount) {
        this.destination = destination;
        this.origin = origin;
        this.passengerCount = passengerCount;
    }
    
    
    @Override
    public String getOrigin() {
        return this.origin.toLowerCase();
    }

    @Override
    public String getDestination() {
        return this.destination.toLowerCase();
    }

    @Override
    public int getPassengerCount() {
        return this.passengerCount;
    }
    
}
