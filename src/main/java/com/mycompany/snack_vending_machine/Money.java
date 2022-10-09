/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.snack_vending_machine;

/**
 *
 * @author Omar
 */
public enum Money {
    FIVE_CENTS(5), TEN_CENTS(10), TWENTY_CENTS(20), FIFTY_CENTS(50), ONE_DOLLAR(100), TWENTY_DOLLARS(2000), FIFTY_DOLLARS(5000);
    
    private int value;
    
    private Money(int value) { 
        this.value = value;
    }
    
    public int getValue(){ 
        return this.value;
    }
    
    public static int[] parseCoins(String money){
        String[] numberCoinsInText = money.split(",");
        int[] result = new int[numberCoinsInText.length];
        for(int index=0;index<numberCoinsInText.length;index++){
            result[index] = Integer.parseInt(numberCoinsInText[index]);
        }
        return result;
    }
    
    public static String turnToDollar(int money) {
        String dollar;
        if(money < 100) {
            dollar = "0."+money;
        } else {
            money = money/100;
            dollar = Integer.toString(money);
        }
        return dollar;
    }
}