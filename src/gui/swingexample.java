package gui;
import java.awt.BorderLayout;

import javax.swing.*;
public class swingexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f1=new JFrame("BCA5");
		JButton b1=new JButton("b1");
		JButton b2=new JButton("b2");
		JButton b3=new JButton("b3");
		JButton b4=new JButton("b4");
		JButton b5=new JButton("b5");
		f1.add(b1,BorderLayout.NORTH);
		f1.add(b2,BorderLayout.SOUTH);
		f1.add(b3,BorderLayout.EAST);
		f1.add(b4,BorderLayout.WEST);
		f1.add(b5,BorderLayout.CENTER);
		f1.setVisible(true);
		f1.setSize(400,400);
		f1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

}
