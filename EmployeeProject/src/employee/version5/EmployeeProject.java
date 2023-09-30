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
public class EmployeeProject {
    public static void main(String[] args) {
       
       System.out.println("----------VERSION 5: POLYMORPHISM USING ARRAY LIST----------\n");
       System.out.println("----------HOURLY EMPLOYEE AND CONSTRUCTORS----------");
       
       EmployeeRoster empList = new EmployeeRoster(); 
       
       
       Date emp1Bday = new Date(27, 02, 2003);
       Date emp1HireDate = new Date(15, 12, 2022); 
       Name emp1Name = new Name("Cedric Thomas", "Yu", "Rafanan");
       
       Employee emp1  = new HourlyEmployee(1, emp1Name, emp1HireDate, emp1Bday, 40, 1000); 
       
       boolean val1 = empList.addEmployee(emp1); 
       
       
       if(empList.countHE() > 0){
           empList.displayHE();
       }
       
       
       System.out.println("\n----------PIECE WORKER EMPLOYEE AND CONSTRUCTORS----------");
       Date emp2Bday = new Date(06, 03, 2003); 
       Date emp2HireDate = new Date(16, 04, 2021);
       Name emp2Name = new Name("Patrick Lewis", "Alcover", "Tiu");
       
       Employee emp2 = new PieceWorkerEmployee(2, emp2Name, emp2HireDate, emp2Bday, 200, 50);
          
       boolean val2 = empList.addEmployee(emp2);
       
       if(empList.countPWE() > 0){
           empList.displayPWE();
       }
       
       
       System.out.println("\n----------COMMISSION EMPLOYEE AND CONSTRUCTORS----------");
       Date emp3Bday = new Date(28, 8, 2003);
       Date emp3HireDate = new Date(20, 07, 2016);
       Name emp3Name = new Name("Krystofle Julian", "Bonpin", "Luym");
       
       Employee emp3 = new CommissionEmployee(3, emp3Name, emp3HireDate, emp3Bday, 100000);
       
       boolean val3 = empList.addEmployee(emp3); 
       
       if(empList.countCE() > 0){
           empList.displayCE();
       }
       
       System.out.println("\n----------BASE PLUS COMMISSION EMPLOYEE AND CONSTRUCTORS----------");
       Date emp4Bday = new Date(1, 05, 2003); 
       Date emp4HireDate = new Date(20, 12, 2018);
       Name emp4Name = new Name("Raymund Luis", " ", "Villoria");
       
       Employee emp4 = new BasePlusCommissionEmployee(4, emp4Name, emp4HireDate, emp4Bday, 250000, 30000);
       
       boolean val4 = empList.addEmployee(emp4); 
       
       if(empList.countBPCE() > 0){
           empList.displayBPCE();
       }
       
       
       System.out.println("\n----------ENTIRE EMPLOYEE ROSTER----------");
       
       if(!empList.getEmpList().isEmpty()){
           empList.displayAllEmployee();
       }
       
       System.out.println("\n----------REMOVING AN EMPLOYEE ENTRY (ID: 2)----------");
       empList.removeEmployee(2);
       if(!empList.getEmpList().isEmpty()){
           empList.displayAllEmployee();
       }
       
       System.out.println("\n----------SEARCHING EMPLOYEE NAME----------");
       EmployeeRoster newRoster = empList.getEmployee("Rafanan");
       if(newRoster != null){
           newRoster.displayAllEmployee();
       }
       
       System.out.println("\n----------UPDATING EMPLOYEE----------");
       Name newName = new Name("Alfonso Joaquin", " ", "Gruet");
       Date newBday = new Date(14, 03, 2003);
       
       empList.updateEmployee(1, newName, newBday, emp4HireDate);
       
       empList.displayAllEmployee();
       
    }
    
}
