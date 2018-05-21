package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
	private int x;
	private int y;

	Polymorph(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	class RedMorph {
		
	}

	public int getX() {
		return x;
	}

	public void setX(int xvar) {
		x = xvar;
	}

	public int getY() {
		return y;
	}

	public void setY(int yvar) {
		y = yvar;
	}

	public void update() {

	}

	public abstract void draw(Graphics g);
}
