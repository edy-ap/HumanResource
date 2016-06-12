/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employees;

/**
 *
 * @author Curso
 */
public class Job {
    private int id;
    private String title;
    private double minSalary ;
    private double maxSalary ;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the minSalary
     */
    public double getMinSalary() {
        return minSalary;
    }

    /**
     * @param minSalary the minSalary to set
     */
    public void setMinSalary(double minSalary) {
        this.minSalary = minSalary;
    }

    /**
     * @return the maxSalary
     */
    public double getMaxSalary() {
        return maxSalary;
    }

    /**
     * @param maxSalary the maxSalary to set
     */
    public void setMaxSalary(double maxSalary) {
        this.maxSalary = maxSalary;
    }

    
}
