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
public class keyboard {
    private static char Key;
    public static void set_key(char key){
     Key=key;   
    }
    public static char get_key(){
        return Key;
    }
}
