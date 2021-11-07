package chap9;

import java.awt.BorderLayout;

import java.awt.Color;

import java.awt.FlowLayout;

import java.awt.TextField;

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JPanel;


class NorthPanel extends JPanel {

	public NorthPanel() {
	
		setBackground(Color.LIGHT_GRAY);
		
		add(new JButton("����"));
		
		add(new JButton("�ݱ�"));
		
		add(new JButton("������"));
	}
}

class CenterPanel extends JPanel {

	public CenterPanel() {
	
		setLayout(null);
		
		for (int i = 0; i < 20; i++) {
		
			int x = (int) (Math.random() * 250);
			
			int y = (int) (Math.random() * 250);
			
			JLabel label = new JLabel("*");
			
			label.setForeground(Color.RED);
			
			label.setLocation(x, y);
			
			label.setSize(20, 20);
			
			label.setOpaque(true);
			
			add(label);
		}
	}
}

class SouthPanel extends JPanel {

	public SouthPanel() {
	
		setBackground(Color.YELLOW);
		
		add(new JButton("Word Input"));
	
		add(new TextField(15));
	}
}

public class Practice8 extends JFrame {

	Practice8() {
	
		setTitle("���� ���� �г��� ���� ������");
		
		setSize(300, 300);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		NorthPanel nP = new NorthPanel();
		
		CenterPanel nC = new CenterPanel();
		
		SouthPanel nS = new SouthPanel();
		
		add(nP, BorderLayout.NORTH);
		
		add(nS, BorderLayout.SOUTH);
		
		add(nC);
		
		setVisible(true);
	}

	public static void main(String[] args) {

		new Practice8();
	}
}