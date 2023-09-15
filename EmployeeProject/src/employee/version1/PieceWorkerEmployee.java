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
public class PieceWorkerEmployee {
    
    private int empID;
    private String empName; 
    private Date empDateHired; 
    private Date empBirthDate; 
    private int totalPiecesFinished; 
    private float ratePerPiece; 

    public PieceWorkerEmployee() {
        
    }

    public PieceWorkerEmployee(int empID, String empName, Date empDateHired, Date empBirthDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
    }

    public PieceWorkerEmployee(int empID, String empName, Date empDateHired, Date empBirthDate, int totalPiecesFinished, float ratePerPiece) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
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

    public int getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished >= 0 ? totalPiecesFinished: 0;
    }

    public float getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(float ratePerPiece) {
        this.ratePerPiece = ratePerPiece >= 0 ? ratePerPiece: 0;
    }
    
    public double computeSalary(){
        
        float salary = this.totalPiecesFinished * this.ratePerPiece;
          
        if(this.totalPiecesFinished >= 100){
            //declaring here because these variables are only needed if there is a bonus
            float numOfBonus = this.totalPiecesFinished /100; 
            float bonusAmount = numOfBonus * this.ratePerPiece * 10;
                        
            salary += bonusAmount;
             
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
        return "empID = " + empID + ", empName = " + empName + ", empDateHired = " + empDateHired + ", empBirthDate = " + empBirthDate + ", totalPiecesFinished = " + totalPiecesFinished + ", ratePerPiece = " + ratePerPiece + ", salary = " + salary;

    }
    
    
    
    
    
    
}
