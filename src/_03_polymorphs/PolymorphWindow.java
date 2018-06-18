package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener {
	public static final int WIDTH = 900;
	public static final int HEIGHT = 600;

	private JFrame window;
	private Timer timer;
	
	Polymorph blueMorph = new BluePolymorph(20, 20, 30, 30);
	Polymorph movingMorph = new MovingMorph(140,140,30,30);
	Polymorph redMorph = new RedMorph(400,400,30,30);
	Polymorph circleMorph = new CircleMorph(350,350,30,30);
	Polymorph mouseMorph = new MouseMorph(100,100,30,30);
	Polymorph imageMorph = new ImageMorph(200,200,100,100);
	Polymorph messageMorph = new MessageMorph(75,75,40,40);

	ArrayList<Polymorph> polymorphs = new ArrayList<Polymorph>();
		
		
	public static void main(String[] args) {
		new PolymorphWindow().buildWindow();

	}

	public void buildWindow() {
		window = new JFrame("IT'S MORPHIN' TIME!");
		window.add(this);
		window.getContentPane().setPreferredSize(new Dimension(500, 500));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
		window.setVisible(true);

	addMouseMotionListener((MouseMorph)mouseMorph);
		addMouseListener((MessageMorph)messageMorph);
		
		polymorphs.add(blueMorph);
		polymorphs.add(movingMorph);
		polymorphs.add(redMorph);
		polymorphs.add(circleMorph);
		polymorphs.add(mouseMorph);
		polymorphs.add(imageMorph);
		polymorphs.add(messageMorph);
		

		timer = new Timer(1000 / 30, this);
		timer.start();
	}

	public void paintComponent(Graphics g) {
		// draw background
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, 500, 500);

		// draw polymorph
		for (Polymorph p : polymorphs) {
			p.draw(g);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		for (Polymorph p : polymorphs) {
			p.update();
		}
		
	}
}
