/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vending_machine;

import javafx.util.Pair;

/**
 *
 * @author Kristi
 */
public class display {
    private static String names[]={"Coca-Cola","Pepsi","Sprite","Bake Rolls","Water","Fanta"};
    private static String items[]={"A1","A2","B1","B2","B3","B4"};
    private static int prices[]={100,120,125,200,350,470};
     
    public static String[] get_items_name(){
        return names;
    }
    public static String[] get_items_code(){
        return items;
    }
    public static int[] get_items_price(){
        return prices;
    }
}
