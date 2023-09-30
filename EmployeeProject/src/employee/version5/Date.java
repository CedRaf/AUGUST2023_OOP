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
public class Date {
    
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day < 32 && day > 0 ? day: 1;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month <= 12 && month > 0 ? month: 1;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("%02d %02d %d", day, month, year); 
    }
    
        
}
