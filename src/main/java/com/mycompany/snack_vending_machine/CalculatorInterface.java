/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.snack_vending_machine;

/**
 *
 * @author Omar
 */
public interface CalculatorInterface {
    int calculateTotal(MoneyBundle enterCoins);
    MoneyBundle calculateChange(int amountMoneyToReturn);
}
