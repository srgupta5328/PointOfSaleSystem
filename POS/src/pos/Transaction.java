/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;

/**
 *
 * @author rohangupta
 */
import java.util.ArrayList;

/**
 *
 * @author andreribau
 */

abstract public class Transaction extends Thread {
     static ArrayList<Item> shoppingCart = new ArrayList();
     static double total = 0;
     double transactionNum;

    
    public Transaction (double transID){
        transID = transactionNum; 
    }
    public ArrayList<Item> getCart(){
        return this.shoppingCart;
    }
}
