/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seren
 */
public class Student extends User{
    private int schoolNumber;
    private int numberOfLessons;
    private String department;
    
    public Student(int id, String firstName, String lastName, String eMail, int schoolNumber,int numberOfLesson, String department){
        super(id, firstName, lastName, eMail);
        this.schoolNumber=schoolNumber;
        this.numberOfLessons=numberOfLesson;
        this.department=department;
    }

    /**
     * @return the schoolNumber
     */
    public int getSchoolNumber() {
        return schoolNumber;
    }

    /**
     * @param schoolNumber the schoolNumber to set
     */
    public void setSchoolNumber(int schoolNumber) {
        this.schoolNumber = schoolNumber;
    }

    /**
     * @return the numberOfLessons
     */
    public int getNumberOfLessons() {
        return numberOfLessons;
    }

    /**
     * @param numberOfLessons the numberOfLessons to set
     */
    public void setNumberOfLessons(int numberOfLessons) {
        this.numberOfLessons = numberOfLessons;
    }

    /**
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(String department) {
        this.department = department;
    }
}
