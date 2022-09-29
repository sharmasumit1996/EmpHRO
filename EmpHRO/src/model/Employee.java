/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author abhis
 */
public class Employee {
    private String EmpName;
    private String EmpId;
    private int EmpAge;
    private String EmpGender;
    private Date EmpStartDate;
    private String EmpLevel;
    private String EmpTeam;
    private String EmpPosition;
    private int EmpNumber;
    private String EmpEmail;

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String EmpName) {
        this.EmpName = EmpName;
    }
    
    public String getEmpId() {
        return EmpId;
    }

    public void setEmpId(String EmpId) {
        this.EmpId = EmpId;
    }
    
    public int getEmpAge() {
        return EmpAge;
    }

    public void setEmpAge(int EmpAge) {
        this.EmpAge = EmpAge;
    }
    
    public String getEmpGender() {
        return EmpGender;
    }

    public void setEmpGender(String EmpGender) {
        this.EmpGender = EmpGender;
    }
    
    public Date getEmpStartDate() {
        return EmpStartDate;
    }
    
    public void setEmpStartDate(Date EmpStartDate) {
        this.EmpStartDate = EmpStartDate;
    }

    public String getEmpLevel() {
        return EmpLevel;
    }
    
    public void setEmpLevel(String EmpLevel) {
        this.EmpLevel = EmpLevel;
    }
    
    public String getEmpTeam() {
        return EmpTeam;
    }
    
    public void setEmpTeam(String EmpTeam) {
        this.EmpTeam = EmpTeam;
    }

    public String getEmpPosition() {
        return EmpPosition;
    }

    public void setEmpPosition(String EmpPosition) {
        this.EmpPosition = EmpPosition;
    }
    
    public int getEmpNumber() {
        return EmpNumber;
    }

    public void setEmpNumber(int EmpNumber) {
        this.EmpNumber = EmpNumber;
    }
    
    public String getEmpEmail() {
        return EmpEmail;
    }

    public void setEmpEmail(String EmpEmail) {
        this.EmpEmail = EmpEmail;
    }
    
  
    @Override
    public String toString(){
        return EmpId;
    }
}
