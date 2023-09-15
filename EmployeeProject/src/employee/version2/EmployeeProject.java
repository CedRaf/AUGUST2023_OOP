/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version2;

/**
 *
 * @author User
 */
public class EmployeeProject {
    public static void main(String[] args) {
       //The salary for all Employee classes is found in the display method
       //The computeSalary method is called in their display methods
        System.out.println("----------VERSION 2: USING INHERITANCE----------\n");
       System.out.println("----------HOURLY EMPLOYEE AND CONSTRUCTORS----------");
       Date emp1Bday = new Date(27, 02, 2003);
       Date emp1HireDate = new Date(15, 12, 2022); 
       
       HourlyEmployee emp100 = new HourlyEmployee(); 
       emp100.setEmpID(100);
       emp100.setEmpName("emp100");
       emp100.setEmpBirthDate(emp1Bday);
       emp100.setEmpDateHired(emp1HireDate);
       emp100.setTotalHourWorked(40);
       emp100.setRatePerHour(1000); 
       System.out.println("Emp100 Salary = " + emp100.computeSalary());
       emp100.displayInfo();
       System.out.println(emp100);
       System.out.println("-----------------------------------------------------");
       
       HourlyEmployee emp101 = new HourlyEmployee(101, "emp101", emp1HireDate, emp1Bday); 
       emp101.setTotalHourWorked(40);
       emp101.setRatePerHour(1000);
       System.out.println("Emp101 Salary = " + emp101.computeSalary());
       emp101.displayInfo();
       System.out.println(emp101);
       System.out.println("-----------------------------------------------------");
       
       HourlyEmployee emp1 = new HourlyEmployee(1, "emp1", emp1HireDate, emp1Bday, 40, 1000);
       System.out.println("Emp1 Salary = " + emp1.computeSalary());
       emp1.displayInfo();
       System.out.println(emp1);
       
       
       
       System.out.println("\n----------PIECE WORKER EMPLOYEE AND CONSTRUCTORS----------");
       Date emp2Bday = new Date(29, 03, 1999); 
       Date emp2HireDate = new Date(16, 04, 2021);
       
       PieceWorkerEmployee emp200 = new PieceWorkerEmployee(); 
       emp200.setEmpID(200);
       emp200.setEmpName("emp200");
       emp200.setEmpBirthDate(emp1Bday);
       emp200.setEmpDateHired(emp1HireDate);
       emp200.setTotalPiecesFinished(200);
       emp200.setRatePerPiece(50);
       System.out.println("Emp200 Salary = " + emp200.computeSalary());
       emp200.displayInfo();
       System.out.println(emp200);
       System.out.println("-----------------------------------------------------");
       
       PieceWorkerEmployee emp201 = new PieceWorkerEmployee(201, "emp201", emp2HireDate, emp2Bday);
       emp201.setTotalPiecesFinished(200);
       emp201.setRatePerPiece(50);
       System.out.println("Emp201 Salary = " + emp201.computeSalary());
       emp201.displayInfo();
       System.out.println(emp201);
       System.out.println("-----------------------------------------------------");
       
       PieceWorkerEmployee emp2 = new PieceWorkerEmployee(2, "emp2", emp2HireDate, emp2Bday, 200, 50);
       System.out.println("Emp2 Salary = " + emp2.computeSalary());
       emp2.displayInfo();
       System.out.println(emp2);
       
       System.out.println("\n----------COMMISSION EMPLOYEE AND CONSTRUCTORS----------");
       
       Date emp3Bday = new Date(218, 02, 1995); 
       Date emp3HireDate = new Date(20, 07, 2016);
       
       CommissionEmployee emp300 = new CommissionEmployee(); 
       emp300.setEmpID(300);
       emp300.setEmpName("emp300");
       emp300.setEmpBirthDate(emp3Bday);
       emp300.setEmpDateHired(emp3HireDate);
       emp300.setTotalSales(175000);
       System.out.println("Emp300 Salary = " + emp300.computeSalary());
       emp300.displayInfo();
       System.out.println(emp300);
       System.out.println("-----------------------------------------------------");
       
       CommissionEmployee emp301 = new CommissionEmployee(301, "emp301", emp3HireDate, emp3Bday);
       emp301.setTotalSales(175000);
       System.out.println("Emp301 Salary = " + emp301.computeSalary());
       emp301.displayInfo();
       System.out.println(emp301);
       System.out.println("-----------------------------------------------------");
       
       CommissionEmployee emp3 = new CommissionEmployee(3, "emp3", emp3HireDate, emp3Bday, 175000); 
       System.out.println("Emp3 Salary = " + emp3.computeSalary());
       emp3.displayInfo();
       System.out.println(emp3);
       
       
       System.out.println("\n----------BASE PLUS COMMISSION EMPLOYEE AND CONSTRUCTORS----------");
       Date emp4Bday = new Date(18, 06, 2000); 
       Date emp4HireDate = new Date(20, 12, 2018);
       
       BasePlusCommissionEmployee emp400 = new BasePlusCommissionEmployee(); 
       emp400.setEmpID(400);
       emp400.setEmpName("emp400");
       emp400.setEmpBirthDate(emp3Bday);
       emp400.setEmpDateHired(emp3HireDate);
       emp400.setTotalSales(250000);
       emp400.setBaseSalary(50000);
       System.out.println("Emp400 Salary = " + emp400.computeSalary());
       emp400.displayInfo();
       System.out.println(emp400);
       System.out.println("-----------------------------------------------------");
       
       BasePlusCommissionEmployee emp420 = new BasePlusCommissionEmployee(420, "emp420", emp4HireDate, emp4Bday);
       emp420.setTotalSales(250000);
       emp420.setBaseSalary(50000);
       System.out.println("Emp420 Salary = " + emp420.computeSalary());
       emp420.displayInfo();
       System.out.println(emp420);
       System.out.println("-----------------------------------------------------");
       
       BasePlusCommissionEmployee emp4 = new BasePlusCommissionEmployee(4, "emp4", emp4HireDate, emp4Bday, 250000, 50000); 
       System.out.println("Emp4 Salary = " + emp4.computeSalary());
       emp4.displayInfo();
       System.out.println(emp4);       
    }
    
}
