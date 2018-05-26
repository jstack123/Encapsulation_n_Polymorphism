package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Polymorph {
	private int x;
	private int y;
	private int width;
	private int height;

	Polymorph(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width=width;
		this.height=height;
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
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int wvar) {
		width = wvar;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int hvar) {
		height = hvar;
	}

	public void update() {
		
	}

	public abstract void draw(Graphics g);
}
