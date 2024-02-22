/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uk.ac.tees.scedt.a0123456.task1;

/**
 *
 * @author b1505861 Hello
 */
public class StudentRecord {

    private final String firstName;
    private final String lastName;
    private final String dob;
    private int averageGrade;
    
    public StudentRecord(String firstName, String lastName, String dob, int averageGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.averageGrade = averageGrade;
    }
    
        public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDob() {
        return dob;
    }

    public int getAverageGrade() {
        return averageGrade;
    }

    
    
    public static void main(String[] args) {
        StudentRecord sr = new StudentRecord("Joe", "Bloggs", "23-01-2001", 68);
        USStudentRecord usSR = new UKStudentRecordAdapter(sr);
        
        System.out.println("Name: " + usSR.getFullName());
        System.out.println("DOB: " + usSR.getDOB());
        System.out.println("Average GPS: " + usSR.getAverageGPA());
    }
}
