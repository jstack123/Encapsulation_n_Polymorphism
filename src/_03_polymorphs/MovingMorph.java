package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph{

	MovingMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
	}
	
	boolean z = true;
	
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
	@Override
	public void update() {
		
		super.update();
		
		
		if (getX()<300 && getY()<300 && z) {
			setX(getX()+5);
			setY(getY()+5);
			
		} else { 
			z=false;
			setY(getY()-5);
		}
		
	
		if (getY() < 20) {
			setY(getY()+5);
		}
		
		
		
		
	}
	

}
