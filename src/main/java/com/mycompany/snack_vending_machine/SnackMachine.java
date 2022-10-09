/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.snack_vending_machine;

import java.util.Scanner;

/**
 *
 * @author Omar
 */
public class SnackMachine {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        VendingMachineInterface vendingMachine = new TextBasedVendingMachine();
        
        vendingMachine.displayProducts();
        String selectProduct = scan.nextLine();
        int selectProductNumber = Integer.parseInt(selectProduct);
        vendingMachine.selectProduct(selectProductNumber);
        
        vendingMachine.choosePaymentMethod();
        String paymentMethod = scan.nextLine();
        int selectPaymentMethod = Integer.parseInt(paymentMethod);
        vendingMachine.setPaymentMethod(selectPaymentMethod);
    }
}
