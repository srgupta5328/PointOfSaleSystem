/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;

/**
 *
 * @author rohangupta*/

public class Order extends Transaction {
double quantity; 
Item orderedItem; 

    public Order(int transactionNum, double quan, Item ordered) {
           super (transactionNum); 
           quantity = quan; 
           orderedItem = ordered; 
    }

   public void addToShoppingCart(Item itemAdded) {
        shoppingCart.add(itemAdded);
    }
@Override
    public void run() {
        synchronized(this){
        for (int i = 0; i < shoppingCart.size(); i++) {
            total = total + shoppingCart.get(i).itemCost;

        }
        for (int i = 0; i < shoppingCart.size(); i++){
        System.out.print(transactionNum + "#" + Transaction.shoppingCart.get(i).itemIDNum+" ");
        }
        System.out.println(transactionNum + "#" + "Your shopping cart total is: " + total);
         }
    }


    
    
}




