/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uk.ac.tees.scedt.a0123456.task2;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author b1505861
 */
public class JTableExample {
    JFrame f;
    JTable t;
    Plane[] data;
    
    public JTableExample(Plane[] data) {
        this.data = data;
        
        AbstractTableModel at = new FlightsTableModel(data);
        

        f = new JFrame("Flights");
        
          // Initializing the JTable
        t = new JTable(at);
        
        t.setBounds(30, 40, 200, 300);
 
        // adding it to JScrollPane
        JScrollPane sp = new JScrollPane(t);
        f.add(sp);
        // Frame Size
        f.setSize(500, 200);
        // Frame Visible = true
        f.setVisible(true);
    }
    
    public static void main(String[] args) {
        Plane[] data = new Plane[4];
        
        
        Plane  p1 = new EF747("london", "log angeles", 58);
        Plane d1 = new prefixedDecorater(p1);
        Plane l1 = new ShortFlightDecorater(d1);
        
        Plane  p2 = new EF747("swansea", "scunthorpe", 126);
        Plane d2 = new prefixedDecorater(p2);
        Plane l2 = new LongFlightDecorater(d2);
        
        Plane  p3 = new EF747("doncaster", "miami", 199);
        Plane d3 = new prefixedDecorater(p3);
        Plane l3 = new ShortFlightDecorater(d3);
        
        Vehicle v1 = new HL777b("NEWCASTLE-HAVANA", 201, 2);
        Plane p4 = new VehicleAdapter(v1);
        Plane d4 = new prefixedDecorater(p4);
        Plane l4 = new ShortFlightDecorater(d4);
        
        data[0] = l1;
        data[1] = l2;
        data[2] = l3;
        data[3] = l4;
        JTableExample j = new JTableExample(data);
    }
    
    
}
