package object;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class RealPalace implements AbstractBuilding
{
BufferedImage img = null;
	
	public RealPalace()
	{
		try {
		    img = ImageIO.read(new File( "resources/realPalace.png"));
		} catch (IOException e) {
		}
	}
	
	public void Draw(Graphics g,int posX, int posY)
	{
		g.drawImage(img,posX, posY, 180, 180, null);
		System.out.println("DRAW REAL PALACE");
	}   
}
