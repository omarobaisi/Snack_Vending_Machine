/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.snack_vending_machine;

/**
 *
 * @author Omar
 */
public class TextBasedVendingMachine implements VendingMachineInterface{
    
    private int selectedProduct;
    private int payment;
    
    TextBasedVendingMachine() {
        
    }

    @Override
    public void displayProducts() {
        System.out.println("***********************************");
        System.out.println("  WELCOME TO THE VENDING MACHINE   ");
        System.out.println("***********************************");
        System.out.println("        Products available:        ");
        System.out.println("                                   ");
        for(Product product: Product.values()){
            System.out.println("     " + product.getId() + "  " + product.name() + " - Price: " + Money.turnToDollar(product.getPrice()) + "$   ");
        }
        System.out.println("                                              ");
        System.out.println(" Please select your product: ");
    }

    @Override
    public void selectProduct(int product) {
        this.selectedProduct = product;
    }

    @Override
    public void choosePaymentMethod() {
        System.out.println("***********************************");
        System.out.println("       Choose payment method       ");
        System.out.println("***********************************");
        for(PaymentMethods method: PaymentMethods.values()){
            System.out.println("       " + method.getId() + "  " + method.name() + "   ");
        }
    }
    
    @Override
    public void setPaymentMethod(int payment) {
        this.payment = payment;
        if(this.payment == 1) {
            CashPaymentInterface cash = new CashPayment(this.selectedProduct, this.payment);
            cash.enterMoneyMessage();
        } else if(this.payment == 2) {
            System.out.println("Payment Seccessful");
        }
    }
    
}
