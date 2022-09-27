package com.company;

import java.util.Scanner;

public class Main{

    public static void main(String [] args){
        Double hourlyRate= Double.valueOf(500); // Adjunct lecturers are paid GHC 500 per hour
        Double staffWelfare = Double.valueOf(70); // All adjunct lecturers are to contribute GHC 70 from their salaries every month towards staff welfare.
        Double Bonus,Salary,Gross,Deductions,VAT;
        Integer hoursWorked;

        //Given..
//        Gross = (Hourly rate x Hours Worked) + bonuses
//        Salary = Gross - Deductions
//        Deductions = VAT+ Welfare
//        VAT = 17.5% of Gross

        //Q1
        Scanner scan = new Scanner(System.in);

        System.out.println("\t\t\t\t\tUniversity of Fafa");
        System.out.println("Question 1");
        System.out.println("Enter a given number of hours worked = ");
        hoursWorked=scan.nextInt();

        System.out.println("Enter lecturers bonus = Ghc ");
        Bonus=scan.nextDouble();

        System.out.println("Hourly rate =GHc "+ hourlyRate);
        System.out.println("Hours worked = "+ hoursWorked + " hours");
        System.out.println("Bonuses =GHc "+ Bonus);
        Gross= (hourlyRate * hoursWorked)+Bonus;
        VAT= 0.175 * Gross;
        Deductions= VAT + staffWelfare;
        Salary =Gross - Deductions;

        System.out.println("Salary of hundred (100) adjunct lecturers =GHc "+ (Salary*100));


        //Q2
        System.out.println("Question 2");
        System.out.println("Enter number of hours worked = ");
        hoursWorked=scan.nextInt();
        if(hoursWorked>20){
            System.out.println("Bonus of GHc50 has been added");
        }
        else{
            System.out.println("Bonus not added because hours are not upto 20 hours");
        }
    }
}
