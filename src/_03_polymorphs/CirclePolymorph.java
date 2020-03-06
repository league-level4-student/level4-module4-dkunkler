package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

public class CirclePolymorph extends Polymorph{

	int circleX;
	int circleY;
	int radius = 75;
	double path = 0.0;
	CirclePolymorph(int x, int y, int w, int h) {
		super(x, y, w, h);
		circleX = x;
		circleY = y;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.CYAN);
		g.fillOval(getX(), getY(), getWidth(), getHeight());
	}

	@Override
	public void update() {
		path+=0.1;
		setX(circleX + (int)(radius * Math.cos(path)));
		setY(circleY + (int)(radius * Math.sin(path)));

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
