/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.snack_vending_machine;

/**
 *
 * @author Omar
 */
public enum PaymentMethods {
    Cash(1), CreditCard(2);
    
    private int id;
    
    PaymentMethods(int id) {
        this.id = id;
    }
    
    public int getId() {
        return this.id;
    }
}
