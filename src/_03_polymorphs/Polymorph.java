package _03_polymorphs;

import java.awt.Graphics;


public abstract class Polymorph {
    private
	int x;
    int y;
    int width;
    int height;
	
    
    public int getX() {
    	return x;
    }
    
    public void setX(int inX) {
    	if((inX < PolymorphWindow.WIDTH) && (inX >= 0)) {
    		x = inX;
    	}
    }
    
    public int getY() {
    	return y;
    }
    
    public void setY(int inY) {
    	if((inY < PolymorphWindow.HEIGHT) && (inY >= 0)) {
    		y=inY;
    	}
    }
    
    public int getWidth() {
    	return width;
    }
    public void setWidth(int w) {
    	width = w;
    }
    
    public int getHeight() {
    	return height;
    }
    public void setHeight(int h) {
    	height = h;
    }

    Polymorph(int x, int y, int w, int h){
   	 this.x = x;
   	 this.y = y;
   	 width = w;
   	 height = h;
   	 
    }
    
    public void update(){
   	 
    }
    
    public abstract void draw(Graphics g) ;

}
