/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;

import java.util.ArrayList;

/**
 *
 * @author rohangupta
 */
public class Inventory {

    static ArrayList<Item> inventory = new ArrayList();

    public Inventory(ArrayList<Item> newInventory) {
        inventory = newInventory;

    }
    
    
}
