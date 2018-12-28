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
public class Exchange extends Transaction {
  
    double quantity;
    Item oldItem;
    Item newItem; 
	public Exchange(int transactionNum, Item aitem, Item bitem, double quan)
	{
                super(transactionNum); 
		oldItem = aitem;
		newItem = bitem;
		quantity = quan;
	}

	
	 public static void run (Item aitem, Item bitem) {    
    
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).itemIDNum == bitem.itemIDNum) {
                inventory.add(aitem);
                inventory.remove(i);

            } 
        }

        }
    }

   
    

