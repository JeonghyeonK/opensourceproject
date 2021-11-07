package chap9;

import javax.swing.*;

import java.awt.*;

public class Practice2 extends JFrame {

	public Practice2() {
	
		setTitle("BorderLayout Practice");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout(5, 7));
		
		c.add(new JButton("Calculate"), BorderLayout.CENTER);
		
		c.add(new JButton("add"), BorderLayout.NORTH);
		
		c.add(new JButton("sub"), BorderLayout.SOUTH);
		
		c.add(new JButton("mul"), BorderLayout.EAST);
		
		c.add(new JButton("div"), BorderLayout.WEST);
		
		setSize(300, 200);
		
		setVisible(true);
	}

	public static void main(String[] args) {

		new Practice2();
	}
}