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
public class Item {
        double itemIDNum;
	double itemCost;
	double itemTotal;
	 
	    public Item(double cost, double itemID,double quantity){
	        itemCost = cost;
                itemIDNum = itemID;
	        itemTotal = quantity;
	  }
	 
	    public double getItemIDNum() {
	        return itemIDNum;
	    }
	 
	    public void setItemIDNum(double itemID) {
	        this.itemIDNum = itemID;
	    }
	 
	    public double getItemCost() {
	        return itemCost;
	    }
	 
	    public void setItemCost(double cost) {
	        this.itemCost = cost;
	    }
	 
	    public double getItemTotal() {
	        return itemTotal;
	    }
	 
	    public void setItemTotal(double quantity) {
	        this.itemTotal = quantity;
	    }
}
