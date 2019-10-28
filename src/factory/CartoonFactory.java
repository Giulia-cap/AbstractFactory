package factory;

import object.AbstractBuilding;
import object.AbstractDecoration;
import object.CartoonHouse;
import object.CartoonPalace;
import object.CartoonTree;

public class CartoonFactory implements AbstractFactory
{
	@Override
	   public AbstractBuilding craeteBuilding (String building)
	{
	   
	      if(building == null){
	         return null;
	      }    
	      
	      if(building== "HOUSE"){
	         return new CartoonHouse();
	         
	      }else if(building=="PALACE"){
	         return new CartoonPalace();
	      }
	      
	      return null;
	   }
	
	
	
	
	@Override
	   public AbstractDecoration createDecoration (String decoration)
	{
		   if(decoration == null){
		         return null;
		      }    
		      
		      if(decoration== "TREE"){
		         return new CartoonTree();}
		      return null;
	}
}
