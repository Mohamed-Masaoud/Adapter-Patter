/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uk.ac.tees.scedt.a0123456.task1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author b1505861
 */
public class UKStudentRecordAdapter implements USStudentRecord{
    private StudentRecord adaptee;

    public UKStudentRecordAdapter(StudentRecord adaptee) {
        this.adaptee = adaptee;
    }
    
    @Override
    public double getAverageGPA() {
        double GPA;
        int avgMark = this.adaptee.getAverageGrade();
        if (avgMark >= 70) {
            GPA = 4.0;
        }
        else if (avgMark >= 65 && avgMark <= 69) {
            GPA = 3.7;
        }
        else if (avgMark >= 60 && avgMark <= 64) {
            GPA = 3.3;
        }
        else if (avgMark >= 55 && avgMark <= 59) {
            GPA = 3.0;
        }
        else if (avgMark >= 50 && avgMark <= 54) {
            GPA = 2.7;
        }
        else if (avgMark >= 45 && avgMark <= 49) {
            GPA = 2.3;
        }
        else if (avgMark >= 40 && avgMark <= 44) {
            GPA = 2.0;
        }
        else if (avgMark >= 35 && avgMark <= 39) {
            GPA = 1.0;
        }
        else{
            GPA = 0.0;
        }
        
        return GPA;
    }

    @Override
    public String getDOB() {
        SimpleDateFormat uk = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat us = new SimpleDateFormat("MM/dd/yyyy");
        String dob = "";
        
        try {
            Date date = uk.parse(this.adaptee.getDob());
            dob = us.format(date);
        } catch (ParseException ex) {
            
        }
            return dob;    
    }

    @Override
    public String getFullName() {
        return this.adaptee.getLastName() + ", " + this.adaptee.getFirstName();
    }
    
}
