package client;

import factory.AbstractFactory;
import factory.CartoonFactory;
import factory.RealFactory;

public class Main 
{
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		AbstractFactory factory=new CartoonFactory();
		
		SimCity game=new SimCity("CinCity",1280,640,factory);

	}

}
