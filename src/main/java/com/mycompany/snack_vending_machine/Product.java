/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.snack_vending_machine;

/**
 *
 * @author Omar
 */
public enum Product {
    Twix(1, 100), Rite(2, 50), Doritos(3, 70), Pringles(4, 200), Skittles(5, 120);
    
    private int id;
    private int price;
    
    Product(int id, int price) {
        this.id = id;
        this.price = price;
    }
    
    public int getId() {
        return this.id;
    }
    
    public int getPrice() {
        return this.price;
    }
    
    public static Product valueOf(int productSelected) {
        for(Product product: Product.values()) {
            if(productSelected == product.getId()) {
                return product;
            }
        }
        return null;
    }
}
