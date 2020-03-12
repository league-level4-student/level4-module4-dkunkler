package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;


public class RedPolymorph extends Polymorph { 
	RedPolymorph(int x, int y, int w, int h) {
		super(x, y, w, h);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}

}
