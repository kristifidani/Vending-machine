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
public class coin_slot {
    private static int total_coins;
    private static int change;
    public static void set_total_coins(int coins){
        total_coins = coins;
    }
    public static int get_coins(){
        return total_coins;
    }
}
