/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classchallengeexercise;

/**
 *
 * @author Cedric
 */
public class ClassChallengeExercise {
    public static void main(String[] args) {
        
        Account bankAccount = new Account();
        bankAccount.setBalance(100000);
        bankAccount.setName("Cedric");
        bankAccount.setEmail("cedric@gmail.com");
        bankAccount.setNumber(22102746);
        bankAccount.setPhoneNum(1234567);
        
        bankAccount.deposit(50000);
        System.out.println("Balance: " + bankAccount.getBalance());
        
        bankAccount.withdraw(25000);
        System.out.println("Balance: " + bankAccount.getBalance());
        
    }
    
}
