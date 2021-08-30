/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Tyler Goldsmith
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the price of item 1? ");
        String Str1_price=input.nextLine();
        System.out.print("Enter the quantity of item 1? ");
        String Str1_amt=input.nextLine();

        System.out.print("Enter the price of item 2? ");
        String Str2_price=input.nextLine();
        System.out.print("Enter the quantity of item 2? ");
        String Str2_amt=input.nextLine();

        System.out.print("Enter the price of item 3? ");
        String Str3_price=input.nextLine();
        System.out.print("Enter the quantity of item 3? ");
        String Str3_amt=input.nextLine();

        double a_price= Double.parseDouble(Str1_price);
        double a_amt= Double.parseDouble(Str1_amt);
        double b_price= Double.parseDouble(Str2_price);
        double b_amt= Double.parseDouble(Str2_amt);
        double c_price= Double.parseDouble(Str3_price);
        double c_amt= Double.parseDouble(Str3_amt);

        double total= (a_price*a_amt)+(b_price*b_amt)+(c_price*c_amt);
        double tax= total*0.055;
        double tax_total=total+tax;

        System.out.format("Subtotal %.2f\nTax %.2f\nTotal %.2f",total, tax, tax_total);
    }
}