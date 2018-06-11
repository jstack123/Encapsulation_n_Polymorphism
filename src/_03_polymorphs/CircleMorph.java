package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;


public class CircleMorph extends Polymorph {
	
	int center=0;
	int length=30;
	
	CircleMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.ORANGE);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
	public void update() {
		

	setX(getX()+(Math.sin(center)*length));
	setY(getY()+(Math.cos(center)*length));
		center++;
		
	}
}
