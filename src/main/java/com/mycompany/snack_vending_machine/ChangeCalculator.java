/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.snack_vending_machine;

/**
 *
 * @author Omar
 */
public class ChangeCalculator implements CalculatorInterface {

    @Override
    public int calculateTotal(MoneyBundle enterCoins) {
        return enterCoins.getTotal();
    }

    @Override
    public MoneyBundle calculateChange(int amountMoneyToReturn) {
        MoneyBundle change = new MoneyBundle(new int[7]);
        int remainingAmount = amountMoneyToReturn;
        
        change.number50DollarNotes = remainingAmount / Money.FIFTY_DOLLARS.getValue();
        remainingAmount = remainingAmount % Money.FIFTY_DOLLARS.getValue();
        
        change.number20DollarNotes = remainingAmount / Money.TWENTY_DOLLARS.getValue();
        remainingAmount = remainingAmount % Money.TWENTY_DOLLARS.getValue();
        
        change.number1DollarNotes = remainingAmount / Money.ONE_DOLLAR.getValue();
        remainingAmount = remainingAmount % Money.ONE_DOLLAR.getValue();

        change.number50CentsCoins = remainingAmount / Money.FIFTY_CENTS.getValue();
        remainingAmount = remainingAmount % Money.FIFTY_CENTS.getValue();

        change.number20CentsCoins = remainingAmount / Money.TWENTY_CENTS.getValue();
        remainingAmount = remainingAmount % Money.TWENTY_CENTS.getValue();

        change.number10CentsCoins = remainingAmount / Money.TEN_CENTS.getValue();
        remainingAmount = remainingAmount % Money.TEN_CENTS.getValue();

        change.number5CentsCoins = remainingAmount / Money.FIVE_CENTS.getValue();


        return change;
    }
    
}
