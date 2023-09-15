/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.version2;

/**
 *
 * @author User
 */
public class BasePlusCommissionEmployee extends CommissionEmployee{
    
    private double baseSalary; 

    public BasePlusCommissionEmployee() {
        super(); 
    }

    public BasePlusCommissionEmployee(int empID, String empName, Date empDateHired, Date empBirthDate) {
        super(empID, empName, empDateHired, empBirthDate);
    }

    public BasePlusCommissionEmployee(int empID, String empName, Date empDateHired, Date empBirthDate, double totalSales, double baseSalary) {
        super(empID, empName, empDateHired, empBirthDate, totalSales); 
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary >= 0 ? baseSalary: 0;
    }
    
    @Override
    public double computeSalary(){
        
        return super.computeSalary() + this.baseSalary;  
        
    }
    
    @Override
    public void displayInfo(){ 
        String display = this.toString(); 
        System.out.println(display);
    
    }

    @Override
    public String toString() {
       double salary = this.computeSalary(); 
        return "empID = " + getEmpID() + ", empName = " + getEmpName() + ", empDateHired = " + getEmpDateHired() + ", empBirthDate = " + getEmpBirthDate() + ", totalSales = " + getTotalSales() + ", baseSalary =  " + baseSalary + ", salary = " + salary;
    }
    
    
    
}
