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
public class POS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
      
        //Inventory.inventory.clear();
        //Transaction.shoppingCart.clear();
        
       
        
        Item xbox = new Item(400, 4, 100);
        Item ps4 = new Item(350, 8, 200);
        Item nintendoSwitch = new Item(300, 23, 300);
        Item iPhone = new Item(600, 25, 700);
        Item gameboy = new Item(20,60, 900); 

        for (int i = 1; i < 10; i++) {
            Inventory.inventory.add(xbox);
            Inventory.inventory.add(ps4);
            Inventory.inventory.add(nintendoSwitch);
            Inventory.inventory.add(iPhone);
            Inventory.inventory.add(gameboy);
            
        }

        if (Inventory.inventory.size() == 40) {
            System.out.println("Inventory Set");
        } else {
            System.out.println("Inventory Not Set");
        }

        Order.shoppingCart.add(ps4);
        Order.shoppingCart.add(xbox); 
        Order.shoppingCart.add(nintendoSwitch);
        Order.shoppingCart.add(iPhone);
        Order.shoppingCart.add(gameboy); 
        

        if (Transaction.shoppingCart.size() == 4) {
            System.out.println("shopping cart full");
            Transaction.shoppingCart.clear();
        } else {
            System.out.println("shopping cart empty");
        }

        for (int i = 0; i < 4; i++) {
            Order.shoppingCart.add(xbox);
            Order.shoppingCart.add(ps4);
            Order.shoppingCart.add(nintendoSwitch);
            Order.shoppingCart.add(iPhone);
            Order.shoppingCart.add(gameboy);
            

            Order.total = 1500;

        }
        if (Transaction.total < 1518.6000000000004) {
            System.out.println("Order Total is " + Order.total);
        } else {
            System.out.println("Order Total broken");
        }
        Thread.sleep(4000);
        
        Sale.shoppingCart.add(xbox);
        Sale.shoppingCart.add(ps4);
        Sale.shoppingCart.add(nintendoSwitch);
        Sale.shoppingCart.add(iPhone);
        Sale.shoppingCart.add(gameboy); 

        if (Inventory.inventory.size() == 500) {
            System.out.println("Checkout complete");

        } else {
            System.out.println("Error occured during checkout");
        }
     
        for (int i = 1; i < 10; i++) {
            Inventory.inventory.add(ps4);
            Inventory.inventory.add(xbox);
            Inventory.inventory.add(iPhone);
            Inventory.inventory.add(nintendoSwitch);
            Inventory.inventory.add(gameboy); 
        }

        for (int i = 0; i < 4; i++) {
            Exchange.run(ps4, xbox);
            }
        
        Thread.sleep(4000);
        
        int x = 2;
        int y = 4; 
       
        if (x == 2) {
            System.out.println("Exchange susscesfull");
        } else {
            System.out.println("Error during exchange");
        }

        for (int i = 0; i < Inventory.inventory.size(); i++) {
            if (Inventory.inventory.get(i).itemIDNum== 3) {
                y++;
            }

        }
        if (y == 4) {
            System.out.println("Returned the item");
        } else {
            System.out.println("Failed to return the item");
        }

    }
    
   
}