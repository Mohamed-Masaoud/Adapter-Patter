/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uk.ac.tees.scedt.a0123456.task2;

/**
 *
 * @author b1505861
 */
public class prefixedDecorater extends PlaneDecorater{

    public prefixedDecorater(Plane p) {
        super(p);
    }

    @Override
    public String getOrigin() {
        return "> " + this.p.getOrigin();
    }

    @Override
    public String getDestination() {
        return "< " + this.p.getDestination();
    }
    
}
