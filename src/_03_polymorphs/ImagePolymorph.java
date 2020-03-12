package _03_polymorphs;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImagePolymorph extends Polymorph{
	
	BufferedImage image;
	ImagePolymorph(int x, int y, int w, int h) {
		super(x, y, w, h);

        try 
        {
       		image = ImageIO.read(this.getClass().getResourceAsStream("cat.jpg"));
        }	 
        catch (IOException e) 
        {
            System.out.println("The image was not loaded.");
        }
	}
	
	@Override
	public void draw(Graphics g)  {
		g.drawImage(image, getX(), getY(), getWidth(), getHeight(), null);
	}

}
