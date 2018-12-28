/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;

import static pos.Inventory.inventory;

/**
 *
 * @author rohangupta
 */
public class Return extends Transaction {
    Item oldItem;
    Inventory inventory; 
    double invquan;
	
	public Return (int transactionNum, Item itemReturn,double quan) {
		super(transactionNum);
		oldItem = itemReturn;
		invquan =quan; 
		 
	}
	public void run(Item itemReturn) {
            synchronized(this){
        Inventory.inventory.add(itemReturn);
        System.out.println(transactionNum + "#" + itemReturn.itemCost + "has been refunded");
        }
    }

}
