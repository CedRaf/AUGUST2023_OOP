/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.version1;

/**
 *
 * @author User
 */
public class CommissionEmployee {
    private int empID;
    private String empName; 
    private Date empDateHired; 
    private Date empBirthDate; 
    private double totalSales; 

    public CommissionEmployee() {
    }

    public CommissionEmployee(int empID, String empName, Date empDateHired, Date empBirthDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
    }

    public CommissionEmployee(int empID, String empName, Date empDateHired, Date empBirthDate, double totalSales) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalSales = totalSales;
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

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales >= 0 ? totalSales : 0;
    }
    
    public double computeSalary(){
        
        double salary = 0; 
        
        if(this.totalSales < 50000){
            salary = this.totalSales * 0.05; 
        }else if(this.totalSales >= 50000 && this.totalSales < 100000){
            salary = this.totalSales * 0.2; 
        }else if(this.totalSales >= 100000 && this.totalSales < 500000){
            salary = this.totalSales * 0.3;
        }else if(this.totalSales >= 500000){
            salary = this.totalSales * 0.5; 
        }
        
        return salary; 
        
    }
    
    public void displayInfo(){
        
        String display = this.toString(); 
        System.out.println(display);
        
    }

    @Override
    public String toString() {
        double salary = this.computeSalary(); 
        return "empID = " + empID + ", empName = " + empName + ", empDateHired = " + empDateHired + ", empBirthDate = " + empBirthDate + ", totalSales = " + totalSales + ", salary = " + salary ;
    }
    
}
