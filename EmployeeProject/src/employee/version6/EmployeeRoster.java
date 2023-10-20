/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.version6;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class EmployeeRoster {
    
    private ArrayList<Employee> empList;  
    private int max; 

    public EmployeeRoster() {
        this.max = 10; 
        this.empList = new ArrayList<>(); 
        
    }

    public EmployeeRoster(int max) {
        this.max = max;
        this.empList = new ArrayList<>();
    }

    public ArrayList<Employee> getEmpList() {
        return empList;
    }

    public void setEmpList(ArrayList<Employee> empList) {
        this.empList = empList;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
    
    public void displayAllEmployee(){
        
        System.out.printf("%5s | %-30s | %-30s | %10s | %12s | %10s%n", "EmpID", "EmpType", "EmpName", "EmpBday", "EmpHireDate", "EmpSalary");
        for(int i = 0; i < empList.size(); i++){
            if(empList.get(i) instanceof HourlyEmployee){
                System.out.printf("%5d | %-30s | %-30s | %10s | %12s | %10.2f%n", empList.get(i).getEmpID(),empList.get(i).getClass().getSimpleName(), empList.get(i).getEmpName(), empList.get(i).getEmpBirthDate(), empList.get(i).getEmpDateHired(), ((HourlyEmployee)empList.get(i)).computeSalary());
            }else if(empList.get(i) instanceof PieceWorkerEmployee){
                System.out.printf("%5d | %-30s | %-30s | %10s | %12s | %10.2f%n", empList.get(i).getEmpID(),empList.get(i).getClass().getSimpleName(), empList.get(i).getEmpName(), empList.get(i).getEmpBirthDate(), empList.get(i).getEmpDateHired(), ((PieceWorkerEmployee)empList.get(i)).computeSalary());
            }else if(empList.get(i) instanceof CommissionEmployee){
                System.out.printf("%5d | %-30s | %-30s | %10s | %12s | %10.2f%n", empList.get(i).getEmpID(),empList.get(i).getClass().getSimpleName(), empList.get(i).getEmpName(), empList.get(i).getEmpBirthDate(), empList.get(i).getEmpDateHired(), ((CommissionEmployee)empList.get(i)).computeSalary());
            }else if(empList.get(i) instanceof BasePlusCommissionEmployee){
                System.out.printf("%5d | %-30s | %-30s | %10s | %12s | %10.2f%n", empList.get(i).getEmpID(),empList.get(i).getClass().getSimpleName(), empList.get(i).getEmpName(), empList.get(i).getEmpBirthDate(), empList.get(i).getEmpDateHired(), ((BasePlusCommissionEmployee)empList.get(i)).computeSalary());
            }
            
        }
}

     
    public int countHE(){
        
        int ctr = 0;
        
        for(int i = 0; i < empList.size(); i++){
            if(empList.get(i) instanceof HourlyEmployee){
                ctr++; 
            }
        }
        return ctr; 
    }
    
    public int countPWE(){
        
        int ctr = 0;
        
        for(int i = 0; i < empList.size(); i++){
            if(empList.get(i) instanceof PieceWorkerEmployee){
                ctr++; 
            }
        }
        return ctr;         
    }
     
    public int countCE(){
        
        int ctr = 0;
        
        for(int i = 0; i < empList.size(); i++){
            if(empList.get(i) instanceof CommissionEmployee){
                ctr++; 
            }
        }
        return ctr;         
    }

    public int countBPCE(){
        
        int ctr = 0;
        
        for(int i = 0; i < empList.size(); i++){
            if(empList.get(i) instanceof BasePlusCommissionEmployee){
                ctr++; 
            }
        }  
        return ctr; 
    }


    public void displayHE(){
        System.out.printf("%5s | %-30s | %-30s | %10s | %12s | %10s%n", "EmpID", "EmpType", "EmpName", "EmpBday", "EmpHireDate", "EmpSalary");
        for(int i = 0;i<empList.size();i++){
            if(empList.get(i) instanceof HourlyEmployee){
                System.out.printf("%5d | %-30s | %-30s | %10s | %12s | %10.2f%n", empList.get(i).getEmpID(),empList.get(i).getClass().getSimpleName(), empList.get(i).getEmpName(), empList.get(i).getEmpBirthDate(), empList.get(i).getEmpDateHired(), ((HourlyEmployee)empList.get(i)).computeSalary());
            }
        }
    }
    
    public void displayPWE(){
        System.out.printf("%5s | %-30s | %-30s | %10s | %12s | %10s%n", "EmpID", "EmpType", "EmpName", "EmpBday", "EmpHireDate", "EmpSalary");
        for(int i = 0;i<empList.size();i++){
            if(empList.get(i) instanceof PieceWorkerEmployee){
                System.out.printf("%5d | %-30s | %-30s | %10s | %12s | %10.2f%n", empList.get(i).getEmpID(),empList.get(i).getClass().getSimpleName(), empList.get(i).getEmpName(), empList.get(i).getEmpBirthDate(), empList.get(i).getEmpDateHired(), ((PieceWorkerEmployee)empList.get(i)).computeSalary());
            }
        }
    }
    
    public void displayCE(){
        System.out.printf("%5s | %-30s | %-30s | %10s | %12s | %10s%n", "EmpID", "EmpType", "EmpName", "EmpBday", "EmpHireDate", "EmpSalary");
        for(int i = 0;i<empList.size();i++){
            if(empList.get(i) instanceof CommissionEmployee){
                System.out.printf("%5d | %-30s | %-30s | %10s | %12s | %10.2f%n", empList.get(i).getEmpID(),empList.get(i).getClass().getSimpleName(), empList.get(i).getEmpName(), empList.get(i).getEmpBirthDate(), empList.get(i).getEmpDateHired(), ((CommissionEmployee)empList.get(i)).computeSalary());
            }
        } 
    }
    
    public void displayBPCE(){
        System.out.printf("%5s | %-30s | %-30s | %10s | %12s | %10s%n", "EmpID", "EmpType", "EmpName", "EmpBday", "EmpHireDate", "EmpSalary");
        for(int i = 0;i<empList.size();i++){
            if(empList.get(i) instanceof BasePlusCommissionEmployee){
                System.out.printf("%5d | %-30s | %-30s | %10s | %12s | %10.2f%n", empList.get(i).getEmpID(),empList.get(i).getClass().getSimpleName(), empList.get(i).getEmpName(), empList.get(i).getEmpBirthDate(), empList.get(i).getEmpDateHired(), ((BasePlusCommissionEmployee)empList.get(i)).computeSalary());
            }
        }
    }
    
    public boolean addEmployee(Employee e){
        if(empList.size() < this.max){
            empList.add(e);
            return true;
        }else{
            System.out.println("EMP LIST IS FULL");
            return false;
        }     
    }

    public boolean removeEmployee(int id){
        
        for(int i = 0;i<empList.size();i++){
            if(empList.get(i)!= null && empList.get(i).getEmpID() == id){
                empList.remove(i);
                return true; 
            }            
        }
        
        System.out.println("EMPLOYEE ID NOT FOUND");
        return false; 
    }
    
    public EmployeeRoster getEmployee(String n){
       
        boolean found = false; 
        //checks if name even exists in the list
        for(int i=0;i< empList.size();i++){ 
            if(empList.get(i).getEmpName().getfName().equals(n) || empList.get(i).getEmpName().getlName().equals(n)){
                found = true;
                break; 
            }
        }
          
        if(found){            
            EmployeeRoster newRoster = new EmployeeRoster(this.max);      
            for(int i = 0;i<empList.size();i++){               
                if(empList.get(i).getEmpName().getfName().equals(n) || empList.get(i).getEmpName().getlName().equals(n)){                    
                    newRoster.empList.add(this.empList.get(i));                                                        
                }
            }
        
            return newRoster;
        }
        
        System.out.println("NAME NOT FOUND, RETURNING NULL");
        return null;
    }
   
    public void updateEmployee(int empID, Name newName, Date newBday, Date newHireDate){
        
        boolean found = false;
        
        for(int i=0;i<empList.size();i++){
            if(empList.get(i).getEmpID() == empID){
                empList.get(i).setEmpName(newName);
                empList.get(i).setEmpBirthDate(newBday);
                empList.get(i).setEmpDateHired(newHireDate);
                found = true;
                break; 
            }
        }
        
        if(found == false){
            System.out.println("EMPLOYEE WITH ID: " + empID + "NOT FOUND");
        }
        
    }
   
    
}
