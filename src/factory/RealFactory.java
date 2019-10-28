package factory;

import object.AbstractBuilding;
import object.AbstractDecoration;
import object.RealHouse;
import object.RealPalace;
import object.RealTree;

public class RealFactory implements AbstractFactory
{
	@Override
	   public AbstractBuilding craeteBuilding (String building)
	{
	   
	      if(building == null){
	         return null;
	      }    
	      
	      if(building== "HOUSE"){
	         return new RealHouse();
	         
	      }else if(building=="PALACE"){
	         return new RealPalace();
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
		         return new RealTree();}
		      return null;
	}
}
