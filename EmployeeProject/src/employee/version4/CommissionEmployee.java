/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.version4;

/**
 *
 * @author User
 */
public class CommissionEmployee extends Employee{
    
    private double totalSales; 

    public CommissionEmployee() {
        super();
    }
    
    public CommissionEmployee(String fName, String mName, String lName){
        super(fName, mName, lName); 
    }
    

    public CommissionEmployee(int empID, Name empName, Date empDateHired, Date empBirthDate) {
        super(empID, empName, empDateHired, empBirthDate);
    }

    public CommissionEmployee(int empID, Name empName, Date empDateHired, Date empBirthDate, double totalSales) {
        super(empID, empName, empDateHired, empBirthDate);
        this.totalSales = totalSales;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales >= 0 ? totalSales : 0;
    }
    
    /**
     *
     * @return
     */
    @Override
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
    
    @Override
    public void displayInfo(){
        
        String display = this.toString(); 
        System.out.println(display);
        
    }

    @Override
    public String toString() {
        double salary = this.computeSalary(); 
        return "empID = " + getEmpID() + ", empName = " + getEmpName() + ", empDateHired = " + getEmpDateHired() + ", empBirthDate = " + getEmpBirthDate() + ", totalSales = " + totalSales + ", salary = " + salary ;
    }
    
}
