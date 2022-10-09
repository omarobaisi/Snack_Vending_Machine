/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.snack_vending_machine;

/**
 *
 * @author Omar
 */
public class MoneyBundle {
    public int number5CentsCoins;
    public int number10CentsCoins;
    public int number20CentsCoins;
    public int number50CentsCoins;
    public int number1DollarNotes;
    public int number20DollarNotes;
    public int number50DollarNotes;
    
    public MoneyBundle(int... enteredCoins) {
        this.number5CentsCoins = enteredCoins[0];
        this.number10CentsCoins = enteredCoins[1];
        this.number20CentsCoins = enteredCoins[2];
        this.number50CentsCoins = enteredCoins[3];
        this.number1DollarNotes = enteredCoins[4];
        this.number20DollarNotes = enteredCoins[5];
        this.number50DollarNotes = enteredCoins[6];
    }

    public int getTotal() {
        int total = 0;
        total = total+this.number5CentsCoins*Money.FIVE_CENTS.getValue();
        total = total+this.number10CentsCoins*Money.TEN_CENTS.getValue();
        total = total+this.number20CentsCoins*Money.TWENTY_CENTS.getValue();
        total = total+this.number50CentsCoins*Money.FIFTY_CENTS.getValue();
        total = total+this.number1DollarNotes*Money.ONE_DOLLAR.getValue();
        total = total+this.number20DollarNotes*Money.TWENTY_DOLLARS.getValue();
        total = total+this.number50DollarNotes*Money.FIFTY_DOLLARS.getValue();
        return total;
    }
}
