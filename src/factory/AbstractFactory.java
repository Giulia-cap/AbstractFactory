package factory;

import object.AbstractBuilding;
import object.AbstractDecoration;

public interface AbstractFactory 
{
	  AbstractBuilding craeteBuilding (String building) ;
	  AbstractDecoration createDecoration (String decoration);
}
