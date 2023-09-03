/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classchallengeexercise;

/**
 *
 * @author Cedric
 */
public class Account {
    
    private int number; 
    private double balance; 
    private String name; 
    private String email; 
    private int phoneNum; 

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance > 0 ? balance: 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }
    
    public void withdraw(int amount){
         if(amount > 0 && amount <= this.balance){
             this.balance -= amount; 
         }else{
            
         }
    }
    
    public void deposit(int amount){
        this.balance += amount > 0 ? amount: 0;
    }
    
}
