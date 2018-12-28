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
public class Sale extends Transaction{
  
     Item soldItem;  
    double itemQuantity;
    
    public Sale(int transactionNum, Item itemSold, double quan){
        super(transactionNum);
        soldItem = itemSold; 
        itemQuantity = quan; 
        
}
  
    
    public void run( int transactionNum, double payment){
        synchronized(this){
        if(payment == total){
            itemQuantity = soldItem.itemTotal - 1;
            System.out.println(transactionNum + "#" + "Sale completed, total remaining inventory is " + itemQuantity);
            
        }
        
        else {
            System.out.println(transactionNum + "#" + "Sale error need to review");
        }
      }
    }

    
    
}

