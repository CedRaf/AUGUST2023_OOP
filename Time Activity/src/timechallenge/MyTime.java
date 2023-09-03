/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package timechallenge;

/**
 *
 * @author Cedric
 */
//The initial time format of this code will be 12 hour format
//The initial time format of this code will be 12 hour format
public class MyTime {
    private int hour;
    private int min;
    private int sec;
    private boolean merdian; 

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour <= 12 && hour > 0 ? hour: 12;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min < 60 && min >= 0 ? min : 0;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec < 60 && sec >= 0 ? sec : 0;
    }

    public boolean isMerdian() {
        return merdian;
    }

    public void setMerdian(boolean merdian) {
        this.merdian = merdian;
    }
    
    public void advanceTime(int seconds){
       
       int total = this.hour * 3600 + this.min * 60 + this.sec + seconds;
       if(total < 0){
           total += 24 * 3600; 
       }
       this.hour = (total/3600) % 24;
       this.min = (total % 3600)/60;
       this.sec = total % 60; 
       
       if(this.hour == 12){
           this.merdian = !this.merdian; 
       }
       
    }
    
    public void tickByHour(){
        this.hour += 1;
        
        if(this.hour == 12){
            this.merdian = !this.merdian;
        }
        
        if(this.hour == 13){
            this.hour = 1;        
        }     
    }
    
    public void tickByMinute(){
        this.min += 1;
        if(this.min == 60){
            this.min = 0;
            this.tickByHour();
        }
    }
    
    public void tickBySecond(){
        this.sec += 1; 
        if(this.sec == 60){
            this.sec = 0;
            this.tickByMinute(); 
        }
    }
    
    public void display12Hour(){
       String time = this.toString();
       System.out.println(time);
    }
    
    public void display24Hour(){
        this.hour += 12; 
        if(this.hour == 24){
            this.hour = 0; 
        }
        String time = this.toString();
        System.out.println(time);
        
    }

    @Override
    public String toString() {
        if(this.merdian == true){
            return String.format("%02d:%02d:%02d AM", this.hour, this.min, this.sec);
        }else{
            return String.format("%02d:%02d:%02d PM", this.hour, this.min, this.sec);
        }
    }
    
    
    
}
