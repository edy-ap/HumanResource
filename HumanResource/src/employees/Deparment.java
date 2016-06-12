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
public class Deparment {

    private int id;
    private String title;
    private Employee manager;
    private Location location;
    private Employee[] employeLists;

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
     * @return the manager
     */
    public Employee getManager() {
        return manager;
    }

    /**
     * @param manager the manager to set
     */
    public void setManager(Employee manager) {
        this.manager = manager;
    }

    /**
     * @return the location
     */
    public Location getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    public void setEmployeLists(Employee[] employeLists) {
        this.employeLists = employeLists;
    }

}
