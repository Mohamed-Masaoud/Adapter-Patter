/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uk.ac.tees.scedt.a0123456.task2;

/**
 *
 * @author b1505861
 */
public abstract class PlaneDecorater implements Plane{
    protected Plane p;

    public PlaneDecorater(Plane p) {
        this.p = p;
    }
    
    @Override
    public int getPassengerCount(){
        return p.getPassengerCount();
    }
}
