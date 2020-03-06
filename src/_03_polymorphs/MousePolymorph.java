package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MousePolymorph extends Polymorph implements MouseMotionListener {
	int targetX;
	int targetY;
	
	MousePolymorph(int x, int y, int w, int h) {
		super(x, y, w, h);
		targetX = x;
		targetY = y;
	}

	@Override
	public void draw(Graphics g) {

		g.setColor(Color.black);
		g.fillOval(getX(), getY(), getWidth(), getHeight());
	}

	@Override
	public void update() {
		int newX = getX();
		int newY = getY();

		if(getX() < targetX) {
			newX = getX()+1;
		}
		else if(getX() > targetX) {
			newX = getX()-1;
		}
		
		if(getY() < targetY) {
			newY = getY()+1;
		}
		else if(getY() > targetY) {
			newY = getY()-1;
		}
		
		if((newY < PolymorphWindow.HEIGHT-getHeight()) && (newY >=getHeight()))
		{
			setY(newY);
		}
		if((newX < PolymorphWindow.WIDTH-getWidth()) && (newX >=getWidth()))
		{
			setX(newX);
		}
	}

	
	@Override
	public void mouseMoved(MouseEvent e) {
		targetX = e.getX();
		targetY = e.getY();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}



