package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class BluePolymorph extends Polymorph {

	private int width;
	private int height;

	BluePolymorph(int x, int y) {
		super(x, y);
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

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(getX(), getY(), width, height);
	}

}
