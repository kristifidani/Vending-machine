/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vending_machine;

/**
 *
 * @author Kristi
 */
public class item_dispenser {
    public static int get_price_of_item(String[] items,String item){
        int[] prices=display.get_items_price();
        int price=0;
        for(int i=0;i<items.length;i++){
            if(items[i].equals(item)){
                price=prices[i];
            }
        }
        return price;
    }
}
