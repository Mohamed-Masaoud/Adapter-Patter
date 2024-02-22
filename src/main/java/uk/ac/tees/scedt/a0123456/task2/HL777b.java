/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uk.ac.tees.scedt.a0123456.task2;

/**
 *
 * @author b1505861
 */
public class HL777b implements Vehicle{
    private String flightPlan;
    private int capacity;
    private int emptySeats;

    public HL777b(String flightPlan, int capacity, int emptySeats) {
        this.flightPlan = flightPlan;
        this.capacity = capacity;
        this.emptySeats = emptySeats;
    }
    
    

    @Override
    public String getFlightPlan() {
        return this.flightPlan.toUpperCase();
    }

    @Override
    public int getCapacity() {
        return this.capacity;
    }

    @Override
    public int getEmptySeats() {
        return this.emptySeats;
    }
    
}
