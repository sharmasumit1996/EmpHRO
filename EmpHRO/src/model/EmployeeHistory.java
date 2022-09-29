/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author abhis
 */
public class EmployeeHistory {
    private ArrayList<Employee> history;
    
    public LocalTime tStamp;
    
   public EmployeeHistory(){
       this.history = new ArrayList<Employee>();
   }

    public ArrayList<Employee> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Employee> history) {
        this.history = history;
    }
    
    public Employee addNewValue(){
        Employee employee = new Employee();
        history.add(employee);
        return employee; 
    }
    
    public void updateEmployee(Employee employee){
        int index = history.indexOf(employee);
        history.set(index, employee);
    }
    
    public void deleteEmployee(Employee employee){
        history.remove(employee);
    }
    
}
