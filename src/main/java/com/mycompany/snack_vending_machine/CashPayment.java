/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.snack_vending_machine;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Omar
 */
public class CashPayment extends TextBasedVendingMachine implements CashPaymentInterface{
    
    private int selectedProduct;
    private int payment;
    private int[] enteredCoins;
    private MoneyBundle change;
    
    CashPayment(int selectedProduct, int payment) {
        this.selectedProduct = selectedProduct;
        this.payment = payment;
    }

    @Override
    public void enterMoneyMessage() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter coins as follows: ");
        System.out.println("num of 5 cents coins, num of 10 cents coins, num of 20 cents coins, num of 50 cents coins, num of 1 Dollar coins, num of 20 Dollar notes, num of 50 Dollar notes, ");
        System.out.println("                                   ");
        System.out.println("Example: if you want to enter 2 ten cents coin: 0,2,0,0,0,0,0");
        String userEnteredCoins = scan.nextLine();
        this.enteredCoins = Money.parseCoins(userEnteredCoins);
        System.out.println(Arrays.toString(this.enteredCoins));
        this.enterMoney();
    }

    @Override
    public void enterMoney() {
       CalculatorInterface calculator = new ChangeCalculator();
        Product product = Product.valueOf(this.selectedProduct);
        int total = calculator.calculateTotal(new MoneyBundle(this.enteredCoins));
        int changeAmount = total - product.getPrice();
        if(changeAmount == 0) {
            System.out.println("Payment Seccessful");
        } else if (changeAmount < 0) {
            System.out.println("Payment failed");
            System.out.println("You need to pay " + Money.turnToDollar(product.getPrice()) + "$");
            System.out.println("Return " + Money.turnToDollar(total) + "$");
        } else {
            this.change = calculator.calculateChange(changeAmount);
            this.displayChangeMessage();
        }
    }

    @Override
    public void displayChangeMessage() {
        System.out.println("                                              ");
        System.out.println("Your change is : "+ change.getTotal()+" cents splitted as follows: ");
        System.out.println("    50 dollar notes: "+ change.number50DollarNotes);
        System.out.println("    20 dollar notes: "+ change.number20DollarNotes);
        System.out.println("    1 dollar notes: "+ change.number1DollarNotes);
        System.out.println("    50 cents coins: "+ change.number50CentsCoins);
        System.out.println("    20 cents coins: "+ change.number20CentsCoins);
        System.out.println("    10 cents coins: "+ change.number10CentsCoins);
        System.out.println("    5 cents coins: "+ change.number5CentsCoins);
    }
    
    
    
}
