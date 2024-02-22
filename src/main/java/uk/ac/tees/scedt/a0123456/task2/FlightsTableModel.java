/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uk.ac.tees.scedt.a0123456.task2;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author b1505861
 */
public class FlightsTableModel extends AbstractTableModel{
    private Plane[] a;
    private final String[] colNames = {"Origin", "Destanation", "Number of Passengers"};

    public FlightsTableModel(Plane[] a) {
        this.a = a;
    }
    
    
    
    @Override
    public int getRowCount() {
        return a.length;
    }

    @Override
    public int getColumnCount() {
        return this.colNames.length;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        if (i1 == 0) {
            return a[i].getOrigin();
        }
        else if (i1 == 1) {
            return a[i].getDestination();
        }
        return a[i].getPassengerCount();
    }
    
}
