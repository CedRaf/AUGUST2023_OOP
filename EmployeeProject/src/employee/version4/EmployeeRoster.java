/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.version4;
 
/**
 *
 * @author User
 */
public class EmployeeRoster {
    
    private Employee[] empList; 
    private int count = 0; 
    private int max; 

    public EmployeeRoster() {
        this.max = 10; 
        this.empList = new Employee[max]; 
        
    }

    public EmployeeRoster(int max) {
        this.max = max;
        this.empList = new Employee[max]; 
    }

    public Employee[] getEmpList() {
        return empList;
    }

    public void setEmpList(Employee[] empList) {
        this.empList = empList;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
    
    public void displayAllEmployee(){
        
        System.out.printf("%5s | %-30s | %-30s | %10s | %12s | %10s%n", "EmpID", "EmpType", "EmpName", "EmpBday", "EmpHireDate", "EmpSalary");
        for(int i = 0; i < this.count; i++){
            System.out.printf("%5d | %-30s | %-30s | %10s | %12s | %10.2f%n", empList[i].getEmpID(),empList[i].getClass().getSimpleName(), empList[i].getEmpName(), empList[i].getEmpBirthDate(), empList[i].getEmpDateHired(), empList[i].computeSalary());
        }
}

     
    public int countHE(){
        
        int ctr = 0;
        
        for(int i = 0; i < this.count; i++){
            if(empList[i] instanceof HourlyEmployee){
                ctr++; 
            }
        }
        return ctr; 
    }
    
    public int countPWE(){
        
        int ctr = 0;
        
        for(int i = 0; i < this.count; i++){
            if(empList[i] instanceof PieceWorkerEmployee){
                ctr++; 
            }
        }
        return ctr;         
    }
     
    public int countCE(){
        
        int ctr = 0;
        
        for(int i = 0; i < this.count; i++){
            if(empList[i] instanceof CommissionEmployee){
                ctr++; 
            }
        }
        return ctr;         
    }

    public int countBPCE(){
        
        int ctr = 0;
        
        for(int i = 0; i < this.count; i++){
            if(empList[i] instanceof BasePlusCommissionEmployee){
                ctr++; 
            }
        }  
        return ctr; 
    }


    public void displayHE(){
        System.out.printf("%5s | %-30s | %10s | %12s | %10s%n", "EmpID", "EmpName", "EmpBday", "EmpHireDate", "EmpSalary");
        for(int i = 0;i<this.count;i++){
            if(empList[i] instanceof HourlyEmployee){
                System.out.printf("%5d | %-30s | %10s | %12s | %10.2f%n", empList[i].getEmpID(), empList[i].getEmpName(), empList[i].getEmpBirthDate(), empList[i].getEmpDateHired(), empList[i].computeSalary());
            }
        }
    }
    
    public void displayPWE(){
        System.out.printf("%5s | %-30s | %10s | %12s | %10s%n", "EmpID", "EmpName", "EmpBday", "EmpHireDate", "EmpSalary");
        for(int i = 0;i<this.count;i++){
            if(empList[i] instanceof PieceWorkerEmployee){
                System.out.printf("%5d | %-30s | %10s | %12s | %10.2f%n", empList[i].getEmpID(), empList[i].getEmpName(), empList[i].getEmpBirthDate(), empList[i].getEmpDateHired(), empList[i].computeSalary());
            }
        }
    }
    
    public void displayCE(){
        System.out.printf("%5s | %-30s | %10s | %12s | %10s%n", "EmpID", "EmpName", "EmpBday", "EmpHireDate", "EmpSalary");
        for(int i = 0;i<this.count;i++){
            if(empList[i] instanceof CommissionEmployee){
                System.out.printf("%5d | %-30s | %10s | %12s | %10.2f%n", empList[i].getEmpID(), empList[i].getEmpName(), empList[i].getEmpBirthDate(), empList[i].getEmpDateHired(), empList[i].computeSalary());
            }
        } 
    }
    
    public void displayBPCE(){
        System.out.printf("%5s | %-30s | %10s | %12s | %10s%n", "EmpID", "EmpName", "EmpBday", "EmpHireDate", "EmpSalary");
        for(int i = 0;i<this.count;i++){
            if(empList[i] instanceof BasePlusCommissionEmployee){
                System.out.printf("%5d | %-30s | %10s | %12s | %10.2f%n", empList[i].getEmpID(), empList[i].getEmpName(), empList[i].getEmpBirthDate(), empList[i].getEmpDateHired(), empList[i].computeSalary());
            }
        }
    }
    
    public boolean addEmployee(Employee e){
        if(this.count < this.max){
            this.empList[this.count] = e;
            this.count++;
            return true;
        }else{
            System.out.println("EMP LIST IS FULL");
            return false;
        }     
    }

    public boolean removeEmployee(int id){
        
        for(int i = 0;i<this.count;i++){
            if(empList[i]!= null && empList[i].getEmpID() == id){
                for(int j = i;j < this.count - 1;j++){
                    empList[j] = empList[j+1]; 
                }
                empList[this.count-1] = null;
                this.count--;                
                return true;
            }            
        }
        
        System.out.println("EMPLOYEE ID NOT FOUND");
        return false; 
    }
    
    public EmployeeRoster getEmployee(String n){
       
        boolean found = false; 
        //checks if name even exists in the list
        for(int i=0;i< this.count;i++){ 
            if(empList[i].getEmpName().getfName().equals(n) || empList[i].getEmpName().getlName().equals(n)){
                found = true;
                break; 
            }
        }
          
        if(found){            
            EmployeeRoster newRoster = new EmployeeRoster(this.max);      
            for(int i = 0;i<this.count;i++){               
                if(empList[i].getEmpName().getfName().equals(n) || empList[i].getEmpName().getlName().equals(n)){
                    newRoster.empList[newRoster.getCount()] = empList[i];
                    newRoster.setCount(newRoster.getCount()+1);
                }
            }
        
            return newRoster;
        }
        
        System.out.println("NAME NOT FOUND, RETURNING NULL");
        return null;
    }
   
    public void updateEmployee(int empID, Name newName, Date newBday, Date newHireDate){
        
        boolean found = false;
        
        for(int i=0;i<this.count;i++){
            if(empList[i].getEmpID() == empID){
                empList[i].setEmpName(newName);
                empList[i].setEmpBirthDate(newBday);
                empList[i].setEmpDateHired(newHireDate);
                found = true;
                break; 
            }
        }
        
        if(found == false){
            System.out.println("EMPLOYEE WITH ID: " + empID + "NOT FOUND");
        }
        
    }
   
    
}
