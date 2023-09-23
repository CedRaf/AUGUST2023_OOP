/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version3;

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
       Name emp1Name = new Name("Cedric Thomas", "Yu", "Rafanan");
       
       HourlyEmployee emp100 = new HourlyEmployee(); 
       emp100.setEmpID(100);
       emp100.setEmpName(emp1Name);
       emp100.setEmpBirthDate(emp1Bday);
       emp100.setEmpDateHired(emp1HireDate);
       emp100.setTotalHourWorked(40);
       emp100.setRatePerHour(1000); 
       System.out.println("Emp100 Salary = " + emp100.computeSalary());
       emp100.displayInfo();
       System.out.println(emp100);
       System.out.println("-----------------------------------------------------");
       
       HourlyEmployee emp1X = new HourlyEmployee("Cedric Thomas", "Yu", "Rafanan");
       emp1X.setEmpID(110);
       emp1X.setEmpBirthDate(emp1Bday);
       emp1X.setEmpDateHired(emp1HireDate);
       emp1X.setTotalHourWorked(40);
       emp1X.setRatePerHour(1000); 
       System.out.println("Emp1X Salary = " + emp100.computeSalary());
       emp1X.displayInfo();
       System.out.println(emp1X);
       System.out.println("-----------------------------------------------------");
       
       HourlyEmployee emp101 = new HourlyEmployee(101, emp1Name, emp1HireDate, emp1Bday); 
       emp101.setTotalHourWorked(40);
       emp101.setRatePerHour(1000);
       System.out.println("Emp101 Salary = " + emp101.computeSalary());
       emp101.displayInfo();
       System.out.println(emp101);
       System.out.println("-----------------------------------------------------");
       
       HourlyEmployee emp1 = new HourlyEmployee(1, emp1Name, emp1HireDate, emp1Bday, 40, 1000);
       System.out.println("Emp1 Salary = " + emp1.computeSalary());
       emp1.displayInfo();
       System.out.println(emp1);
       
       
       
       System.out.println("\n----------PIECE WORKER EMPLOYEE AND CONSTRUCTORS----------");
       Date emp2Bday = new Date(29, 03, 1999); 
       Date emp2HireDate = new Date(16, 04, 2021);
       Name emp2Name = new Name("Patrick Lewis", "Alcover", "Tiu");
       
       PieceWorkerEmployee emp200 = new PieceWorkerEmployee(); 
       emp200.setEmpID(200);
       emp200.setEmpName(emp2Name);
       emp200.setEmpBirthDate(emp1Bday);
       emp200.setEmpDateHired(emp1HireDate);
       emp200.setTotalPiecesFinished(200);
       emp200.setRatePerPiece(50);
       System.out.println("Emp200 Salary = " + emp200.computeSalary());
       emp200.displayInfo();
       System.out.println(emp200);
       System.out.println("-----------------------------------------------------");
       
       PieceWorkerEmployee emp2X = new PieceWorkerEmployee("Patrick Lewis", "Alcover", "Tiu");
       emp2X.setEmpID(220);
       emp2X.setEmpBirthDate(emp2Bday);
       emp2X.setEmpDateHired(emp2HireDate);
       emp2X.setTotalPiecesFinished(200);
       emp2X.setRatePerPiece(50);
       System.out.println("Emp2X Salary = " + emp2X.computeSalary());
       emp2X.displayInfo();
       System.out.println(emp2X);
       System.out.println("-----------------------------------------------------");
       
       
       PieceWorkerEmployee emp201 = new PieceWorkerEmployee(201, emp2Name, emp2HireDate, emp2Bday);
       emp201.setTotalPiecesFinished(200);
       emp201.setRatePerPiece(50);
       System.out.println("Emp201 Salary = " + emp201.computeSalary());
       emp201.displayInfo();
       System.out.println(emp201);
       System.out.println("-----------------------------------------------------");
       
       PieceWorkerEmployee emp2 = new PieceWorkerEmployee(2, emp2Name, emp2HireDate, emp2Bday, 200, 50);
       System.out.println("Emp2 Salary = " + emp2.computeSalary());
       emp2.displayInfo();
       System.out.println(emp2);
       
       System.out.println("\n----------COMMISSION EMPLOYEE AND CONSTRUCTORS----------");
       
       Date emp3Bday = new Date(218, 02, 1995); 
       Date emp3HireDate = new Date(20, 07, 2016);
       Name emp3Name = new Name("Krystofle Julian", "Bonpin", "Luym");
       
       CommissionEmployee emp300 = new CommissionEmployee(); 
       emp300.setEmpID(300);
       emp300.setEmpName(emp3Name);
       emp300.setEmpBirthDate(emp3Bday);
       emp300.setEmpDateHired(emp3HireDate);
       emp300.setTotalSales(175000);
       System.out.println("Emp300 Salary = " + emp300.computeSalary());
       emp300.displayInfo();
       System.out.println(emp300);
       System.out.println("-----------------------------------------------------");
       
       CommissionEmployee emp3X = new CommissionEmployee("Krystofle Julian", "Bonpin", "Luym");
       emp3X.setEmpID(330);
       emp3X.setEmpBirthDate(emp3Bday);
       emp3X.setEmpDateHired(emp3HireDate);
       emp3X.setTotalSales(175000);
       System.out.println("Emp3X Salary = " + emp3X.computeSalary());
       emp3X.displayInfo();
       System.out.println(emp3X);
       System.out.println("-----------------------------------------------------");
       
       CommissionEmployee emp301 = new CommissionEmployee(301, emp3Name, emp3HireDate, emp3Bday);
       emp301.setTotalSales(175000);
       System.out.println("Emp301 Salary = " + emp301.computeSalary());
       emp301.displayInfo();
       System.out.println(emp301);
       System.out.println("-----------------------------------------------------");
       
       CommissionEmployee emp3 = new CommissionEmployee(3, emp3Name, emp3HireDate, emp3Bday, 175000); 
       System.out.println("Emp3 Salary = " + emp3.computeSalary());
       emp3.displayInfo();
       System.out.println(emp3);
       
       
       System.out.println("\n----------BASE PLUS COMMISSION EMPLOYEE AND CONSTRUCTORS----------");
       Date emp4Bday = new Date(18, 06, 2000); 
       Date emp4HireDate = new Date(20, 12, 2018);
       Name emp4Name = new Name("Raymund Luis", " ", "Villoria");
       
       BasePlusCommissionEmployee emp400 = new BasePlusCommissionEmployee(); 
       emp400.setEmpID(400);
       emp400.setEmpName(emp4Name);
       emp400.setEmpBirthDate(emp4Bday);
       emp400.setEmpDateHired(emp4HireDate);
       emp400.setTotalSales(250000);
       emp400.setBaseSalary(50000);
       System.out.println("Emp400 Salary = " + emp400.computeSalary());
       emp400.displayInfo();
       System.out.println(emp400);
       System.out.println("-----------------------------------------------------");
       
       BasePlusCommissionEmployee emp4X = new BasePlusCommissionEmployee("Raymund Luis", " ", "Villoria");
       emp4X.setEmpID(440);
       emp4X.setEmpBirthDate(emp4Bday);
       emp4X.setEmpDateHired(emp4HireDate);
       emp4X.setTotalSales(250000);
       emp4X.setBaseSalary(50000);
       System.out.println("Emp4X Salary = " + emp4X.computeSalary());
       emp4X.displayInfo();
       System.out.println(emp4X);
       System.out.println("-----------------------------------------------------");
       
       BasePlusCommissionEmployee emp420 = new BasePlusCommissionEmployee(420, emp4Name, emp4HireDate, emp4Bday);
       emp420.setTotalSales(250000);
       emp420.setBaseSalary(50000);
       System.out.println("Emp420 Salary = " + emp420.computeSalary());
       emp420.displayInfo();
       System.out.println(emp420);
       System.out.println("-----------------------------------------------------");
       
       BasePlusCommissionEmployee emp4 = new BasePlusCommissionEmployee(4, emp4Name, emp4HireDate, emp4Bday, 250000, 50000); 
       System.out.println("Emp4 Salary = " + emp4.computeSalary());
       emp4.displayInfo();
       System.out.println(emp4);       
    }
    
}
