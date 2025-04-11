package org.example;

import java.math.BigDecimal;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double total_amount_loan;
        double annual_interest_rate;
        int loan_term_in_Years;

        // 12*loan_term_in_Years
        int number_of_monthly_payments;

        //annual_interest_rate/12
        double monthly_interest_rate;

        //(monthly_payment×number_of_monthly_payments)−total_amount_loan
        double total_interest;
        //M=total_amount_loan×(monthly_interest_rate*(1+monthly_interest_rate)^number_of_monthly_payments / ((1+monthly_interest_rate)^number_of_monthly_payments)-1)
        double monthly_payment;

        Scanner myscanner = new Scanner(System.in);

        System.out.println("What is the total amount of loan (principal). Please insert on number.Eg 5300,6777");
        total_amount_loan = myscanner.nextDouble();
        System.out.println(total_amount_loan);

        System.out.println("What is the annual interest rate as a percentage.Please do not include %.Eg 7.62,5");
        annual_interest_rate = myscanner.nextDouble();
        System.out.println(annual_interest_rate);

        System.out.println("What is the loan term in Years.Eg 12,34");
        loan_term_in_Years = myscanner.nextInt();
        System.out.println(loan_term_in_Years);


    }
}