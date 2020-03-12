package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

@SuppressWarnings("serial")
public class PolymorphWindow extends JPanel implements ActionListener, MouseMotionListener, MouseListener {

	public static final int WIDTH = 900;
	public static final int HEIGHT = 600;

	private JFrame window;
	private Timer timer;
	

	ArrayList<Polymorph> polyList = new ArrayList<Polymorph>();

	public static void main(String[] args) throws IOException {
		new PolymorphWindow().buildWindow();
	}

	public void buildWindow() {
		window = new JFrame("IT'S MORPHIN' TIME!");
		window.add(this);
		window.getContentPane().setPreferredSize(new Dimension(500, 500));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		window.addMouseMotionListener(this);
		window.addMouseListener(this);
		window.pack();
		window.setVisible(true);

		polyList.add(new BluePolymorph(50, 50, 50, 50));
		polyList.add(new RedPolymorph(325, 250, 150, 150));
		polyList.add(new MovingPolymorph(300, 100, 25, 25));
		polyList.add(new CirclePolymorph(125, 225, 75, 75));
		polyList.add(new MousePolymorph(50, 300, 25, 25));
		polyList.add(new ImagePolymorph(150, 30, 120, 90));
		polyList.add(new MessageMorph(75,200, 70, 70));
		
		timer = new Timer(1000 / 30, this);
		timer.start();
		
	}
	
	public void paintComponent(Graphics g) {
		// draw background
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, 500, 500);

		// draw polymorph
		for (Polymorph p : polyList) {

			p.draw(g);
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		for (Polymorph p : polyList) {
			p.update();
		}

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		for (Polymorph p : polyList) {
			if(p.getClass().equals(MousePolymorph.class)) {
			((MousePolymorph)p).mouseMoved(e);
			}
		}

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		for( Polymorph p : polyList)
		{
			if(p.getClass().equals(MessageMorph.class)) {
			((MessageMorph)p).mouseClicked(e);
			}
		}
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
