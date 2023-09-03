/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package timechallenge;

/**
 *
 * @author Cedric
 */
public class TimeChallenge {
    public static void main(String[] args) {
        
        //The initial time format of this code will be 12 hour format
        
        MyTime t = new MyTime();
        
        t.setHour(12);
        t.setMin(59);
        t.setSec(59);
        t.setMerdian(false);
        
        System.out.println(t);
        
        t.tickByHour();
        System.out.println(t);
        
        t.tickByMinute();
        System.out.println(t);
        
        t.tickBySecond();
        System.out.println(t);

        t.display12Hour();
          
        t.display24Hour();
          
        t.advanceTime(120);
        System.out.println(t);

    }
    
}
