package com.naresh.movieapp;
 
public class DiscountCalculator {
 
    public static void main(String[] args) {
 
        int ticketPrice = 100;
 
        int noOfTickets = 5;
 
        String discountCode = "D10";
 
        double discount = 0;
        int totalAmount = ticketPrice * noOfTickets;
 
        switch (discountCode) {
 
        case "D10":
            discount = (float)ticketPrice * noOfTickets * .10;
            break;
        case "D20":
            discount = (float)ticketPrice * noOfTickets * .20;
            break;
        default:
            discount = 0;
        }
        System.out.println("Discount:" + discount);
        System.out.println("Actual Price:" + totalAmount);
         
        double finalAmount = totalAmount - discount;
         
        System.out.println("After Discount:" + finalAmount);
 
    }
 
}
