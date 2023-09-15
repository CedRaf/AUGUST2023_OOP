/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version1;

/**
 *
 * @author User
 */
public class HourlyEmployee {
    
    private int empID;
    private String empName; 
    private Date empDateHired; 
    private Date empBirthDate; 
    private float totalHourWorked; 
    private float ratePerHour; 

    public HourlyEmployee() {
        
    }
    
    public HourlyEmployee(int empID, String empName, Date empDateHired, Date empBirthDate, float totalHourWorked, float ratePerHour) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalHourWorked = totalHourWorked;
        this.ratePerHour = ratePerHour;
    }

    public HourlyEmployee(int empID, String empName, Date empDateHired, Date empBirthDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Date getEmpDateHired() {
        return empDateHired;
    }

    public void setEmpDateHired(Date empDateHired) {
        this.empDateHired = empDateHired;
    }

    public Date getEmpBirthDate() {
        return empBirthDate;
    }

    public void setEmpBirthDate(Date empBirthDate) {
        this.empBirthDate = empBirthDate;
    }

    public float getTotalHourWorked() {
        return totalHourWorked;
    }

    public void setTotalHourWorked(float totalHourWorked) {
        this.totalHourWorked = totalHourWorked >= 0 ? totalHourWorked: 0;
    }

    public float getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(float ratePerHour) {
        this.ratePerHour = ratePerHour >= 0 ? ratePerHour: 0;
    }
    
    
    public double computeSalary(){
        
        float excessHrs; 
        float excessSal; 
        float totalSalary; 
        float otRate = this.ratePerHour * 1.5f;
        
        if(this.totalHourWorked > 40){
           excessHrs = this.totalHourWorked - 40;
           excessSal = otRate * excessHrs;  
           totalSalary = (40 * this.ratePerHour) + excessSal; 
          
           return totalSalary;
           
        }else{
            
           totalSalary = this.totalHourWorked * this.ratePerHour; 
           return totalSalary;
           
        }
          
    }
    
    public void displayInfo(){ 
        String display = this.toString();
        System.out.println(display);
    }

    @Override
    public String toString() {
        double salary = this.computeSalary();
        return "empID = " + empID + ", empName = " + empName + ", empDateHired = " + empDateHired + ", empBirthDate = " + empBirthDate + ", totalHourWorked = " + totalHourWorked + ", ratePerHour = " + ratePerHour + ", salary = " +salary;
    }
    
    
    
    
    


    
    
    
    
    
    
    
}
