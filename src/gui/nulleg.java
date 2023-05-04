package gui;

import javax.swing.*;

public class nulleg{

	public static void main(String[] args) {
	JFrame f1=new JFrame("BCA5");
	JButton b1=new JButton("b1");
	JButton b2=new JButton("b2");
	JButton b3=new JButton("b3");
	JButton b4=new JButton("b4");
	JButton b5=new JButton("b5");
	JButton b6=new JButton("b6");
	JButton b7=new JButton("b7");
	b1.setBounds(40,40,40,40);
	b2.setBounds(80,40,40,40);
	b3.setBounds(120,40,100,100);
	
	f1.add(b1);
	f1.add(b2);
	f1.add(b3);
	f1.add(b4);
	f1.add(b5);
	f1.add(b6);
	f1.add(b7);
	f1.setLayout (null);
	f1.setVisible(true);
	f1.setSize(400,400);
	f1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

}}
