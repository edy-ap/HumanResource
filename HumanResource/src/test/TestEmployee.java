package test;


import employees.Employee;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CURSO
 */
public class TestEmployee {

    public static void main(String[] args) {

        Employee e1 = new Employee("Hector","Perez","hp@hotmail.com","5456456","22/01/1987","Administador","Jefe");
        Employee e2 = new Employee("","","","","","","");
        //Employee e3 = new Employee();

        e1.setAge(30);
        //e2.setAge(24);
        //e3.setAge(40);

//        e1.setFirstName("Juan");
//        e2.setFirstName("Pedro");
       // e3.setFirstName("Carlos");

        System.out.println("FirstName: " + e1.getFirstName() + " Age: " + e1.getAge());
      //  System.out.println("FirstName: " + e2.getFirstName() + " Age: " + e2.getAge());
     //   System.out.println("FirstName: " + e3.getFirstName() + " Age: " + e3.getAge());
    }

}
