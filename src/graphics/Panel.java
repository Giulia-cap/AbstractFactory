package graphics;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JPanel;

import factory.AbstractFactory;
import object.AbstractBuilding;
import object.AbstractDecoration;

public class Panel extends JPanel
{
	AbstractFactory factory;
	int tipo=1;
	BufferedImage img;
	
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public Panel(AbstractFactory fac) 
	{
		super(true); //crea un JPanel con doubleBuffered true
		try{
		setImage(ImageIO.read(new File( "resources/terrain.jpg")));
		} catch(Exception e) {}

		factory=fac;
		setPreferredSize( new Dimension(1280,640) );
	}
	
	public void setImage(BufferedImage img){
		this.img = img;
		/*width = img.getWidth();
		height = img.getHeight();*/}
	
		 public void paintComponent(Graphics g) {
		 super.paintComponent(g);
		 g.drawImage(img, 0, 0, 1280, 660, null);
		 disegna(g);
		 }
		 
		 public void disegna(Graphics g) 
		 {
			 g.setColor(Color.green);
			 g.drawRect(100, 100, 32, 32);
			 
			 if(tipo==0) {
			 AbstractBuilding house1 = factory.craeteBuilding("HOUSE");
			    house1.Draw(g,100,100);}
			    
			    AbstractBuilding house2 = factory.craeteBuilding("HOUSE");
		 	    house2.Draw(g,200,200);
		 	    
		 	    AbstractBuilding palace1 = factory.craeteBuilding("PALACE");
		 	    palace1.Draw(g,100,200);
		 	    
		 	    AbstractDecoration tree1 = factory.createDecoration("TREE");
		 	    tree1.Draw(g,300,100);
		 	    
		 	    AbstractDecoration tree2 = factory.createDecoration("TREE");
		 	    tree2.Draw(g,400,300);
		 	    
		 	    AbstractDecoration tree3 = factory.createDecoration("TREE");
		 	    tree3.Draw(g,500,300);
			 
		 }
		 

}



















