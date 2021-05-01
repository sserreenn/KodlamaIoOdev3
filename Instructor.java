/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seren
 */
public class Instructor extends User{
    private int salary;
    private String branch;
    
    public Instructor(int id, String firstName, String lastName, 
            String eMail,int salary, String branch){
        super(id, firstName, lastName, eMail);
        this.salary=salary;
        this.branch=branch;
    }

    /**
     * @return the salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * @return the branch
     */
    public String getBranch() {
        return branch;
    }

    /**
     * @param branch the branch to set
     */
    public void setBranch(String branch) {
        this.branch = branch;
    }
}
