/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;
/**
 *
 * @author sumit
 */
public class EmployeeHistory {
        private ArrayList<Employee> history;
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
