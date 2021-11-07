package chap9;

import javax.swing.*;

import java.awt.*;

public class Practice4 extends JFrame {

	public Practice4() {
	
		setTitle("GridLayout Sample");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(1,10);
		
		grid.setVgap(5);
		
		Container c = getContentPane();
		
		c.setLayout(grid);

		
		
		JButton b0 = new JButton("9");
		
		JButton b1 = new JButton("9");
		
		JButton b2 = new JButton("9");
		
		JButton b3 = new JButton("9");
		
		JButton b4 = new JButton("9");
		
		JButton b5 = new JButton("9");
		
		JButton b6 = new JButton("9");
		
		JButton b7 = new JButton("9");
		
		JButton b8 = new JButton("9");
		
		JButton b9 = new JButton("9");


		b0.setBackground(Color.RED);
		
		b1.setBackground(Color.ORANGE);
		
		b2.setBackground(Color.YELLOW);
		
		b3.setBackground(Color.GREEN);
		
		b4.setBackground(Color.CYAN);
		
		b5.setBackground(Color.BLUE);
		
		b6.setBackground(Color.MAGENTA);
		
		b7.setBackground(Color.GRAY);
		
		b8.setBackground(Color.PINK);
		
		b9.setBackground(Color.LIGHT_GRAY);
		
		
		
		c.add(b0);
		
		c.add(b1);
		
		c.add(b2);
		
		c.add(b3);
		
		c.add(b4);
		
		c.add(b5);
		
		c.add(b6);
		
		c.add(b7);
		
		c.add(b8);
		
		c.add(b9);
		
		
		setSize(500, 200);
		
		setVisible(true);
	}

	public static void main(String[] args) {

		new Practice4();
	}
}