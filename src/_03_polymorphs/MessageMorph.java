package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

public class MessageMorph extends Polymorph implements MouseListener{
	
	MessageMorph(int x, int y, int w, int h) {
		super(x, y, w, h);

	}

	@Override
	public void draw(Graphics g) {

		g.setColor(Color.WHITE);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}



	@Override
	public void mouseClicked(MouseEvent e) {

		JOptionPane.showMessageDialog(null, "You clicked a MessageMorph object");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


}

