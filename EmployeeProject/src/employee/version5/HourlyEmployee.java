/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version5;

/**
 *
 * @author User
 */
public class HourlyEmployee extends Employee{
     
    private float totalHourWorked; 
    private float ratePerHour; 

    public HourlyEmployee() {
        super(); 
    }
    
    public HourlyEmployee(String fName, String mName, String lName){
        super(fName, mName, lName); 
    }
    
    public HourlyEmployee(int empID, Name empName, Date empDateHired, Date empBirthDate) {
        super(empID, empName, empDateHired, empBirthDate); 
    }
    
    public HourlyEmployee(int empID, Name empName, Date empDateHired, Date empBirthDate, float totalHourWorked, float ratePerHour) {
        super(empID, empName, empDateHired, empBirthDate);
        this.totalHourWorked = totalHourWorked;
        this.ratePerHour = ratePerHour;      
    }

    public float getTotalHourWorked() {
        return totalHourWorked;
    }

    public void setTotalHourWorked(float totalHourWorked) {
        this.totalHourWorked = totalHourWorked;
    }

    public float getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(float ratePerHour) {
        this.ratePerHour = ratePerHour;
    }
    
    @Override
    public double computeSalary(){
        
        float excessHrs; 
        float excessSal; 
        float salary; 
        float otRate = this.ratePerHour * 1.5f;
        
        if(this.totalHourWorked > 40){
           excessHrs = this.totalHourWorked - 40;
           excessSal = otRate * excessHrs;  
           salary = (40 * this.ratePerHour) + excessSal; 
          
           return salary;
           
        }else{
            
           salary = this.totalHourWorked * this.ratePerHour; 
           return salary;
           
        }
          
    }
    
    @Override
    public void displayInfo(){ 
        String display = this.toString();
        System.out.println(display);
    }

    @Override
    public String toString() {
        double salary = this.computeSalary();
        return "empID = " + getEmpID() + ", empName = " + getEmpName() + ", empDateHired = " + getEmpDateHired() + ", empBirthDate = " + getEmpBirthDate() + ", totalHourWorked = " + totalHourWorked + ", ratePerHour = " + ratePerHour + ", salary = " +salary;
    }
    
    
    
    
    


    
    
    
    
    
    
    
}
