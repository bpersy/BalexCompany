/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.balexcompany;

/**
 *
 * @author persy
 */
public class BalexCompany {

     public static void calculatePay(double basePay, int hoursWorked) {
        // Check if the base pay is less than the minimum wage ($8.00)
        if (basePay < 8.00) {
            System.out.println("Error: Base pay must not be less than $8.00 an hour.");
        } 
        // Check if the employee worked more than 60 hours in a week
        else if (hoursWorked > 60) {
            System.out.println("Error: Employee cannot work more than 60 hours in a week.");
        } 
        // If no errors, calculate the total pay
        else {
            double totalPay = 0;
            // If the employee worked 40 hours or less, calculate the total pay as base pay * hours worked
            if (hoursWorked <= 40) {
                totalPay = basePay * hoursWorked;
            } 
            // If the employee worked more than 40 hours, calculate the total pay with overtime
            else {
                totalPay = basePay * 40 + (basePay * 1.5) * (hoursWorked - 40);
            }
            // Print the total pay
            System.out.println("Total pay: $" + totalPay);
        }
    }

    /**
     * This is the main method where the program starts execution.
     * It creates arrays of base pays and hours worked for each employee and calls the calculatePay method for each employee.
     * 
     * @param args command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // Create arrays of base pays and hours worked for each employee
        double[] basePays = {7.50, 8.20, 10.00};
        int[] hoursWorkeds = {35, 47, 73};
        
        // Loop through each employee and calculate their total pay
        for (int i = 0; i < basePays.length; i++) {
            // Print the employee number
            System.out.println("Employee " + (i + 1) + ":");
            // Call the calculatePay method for the current employee
            calculatePay(basePays[i], hoursWorkeds[i]);
        }
    }
}
