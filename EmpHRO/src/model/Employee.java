/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.awt.Image;
import java.util.Date;

/**
 *
 * @author sumit
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
        private Long EmpNumber;
        private String EmpEmail;
        public Image image;

    public void setImage(Image image) {
        this.image = image;
    }

    public Image getImage() {
        return image;
    }

    public String getEmpName() {
        return EmpName;
    }

    public String getEmpId() {
        return EmpId;
    }

    public int getEmpAge() {
        return EmpAge;
    }

    public String getEmpGender() {
        return EmpGender;
    }

    public Date getEmpStartDate() {
        return EmpStartDate;
    }

    public String getEmpLevel() {
        return EmpLevel;
    }

    public String getEmpTeam() {
        return EmpTeam;
    }

    public String getEmpPosition() {
        return EmpPosition;
    }

    public Long getEmpNumber() {
        return EmpNumber;
    }

    public String getEmpEmail() {
        return EmpEmail;
    }

    public void setEmpName(String EmpName) {
        this.EmpName = EmpName;
    }

    public void setEmpId(String EmpId) {
        this.EmpId = EmpId;
    }

    public void setEmpAge(int EmpAge) {
        this.EmpAge = EmpAge;
    }

    public void setEmpGender(String EmpGender) {
        this.EmpGender = EmpGender;
    }

    public void setEmpStartDate(Date EmpStartDate) {
        this.EmpStartDate = EmpStartDate;
    }

    public void setEmpLevel(String EmpLevel) {
        this.EmpLevel = EmpLevel;
    }

    public void setEmpTeam(String EmpTeam) {
        this.EmpTeam = EmpTeam;
    }

    public void setEmpPosition(String EmpPosition) {
        this.EmpPosition = EmpPosition;
    }

    public void setEmpNumber(Long EmpNumber) {
        this.EmpNumber = EmpNumber;
    }

    public void setEmpEmail(String EmpEmail) {
        this.EmpEmail = EmpEmail;
    }
        
     @Override
    public String toString(){
        return EmpId;
    }
        
}

