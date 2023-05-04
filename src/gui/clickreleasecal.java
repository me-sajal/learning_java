
package gui;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

import javax.swing.*;
import java.awt.event.*;

public class clickreleasecal implements MouseListener{
	JFrame f1;
	JLabel l1,l2,l3;
	JTextField tf1,tf2,tf3;
	public clickreleasecal() {
		l1=new JLabel ("Frist number  :");
		l2=new JLabel ("Second number :");
		l3=new JLabel ("Result        :");
		tf1=new JTextField();
		tf2=new JTextField();
		tf3=new JTextField();
		f1=new JFrame("click calculator");
		l1.setBounds(50, 50, 100, 30);
		l2.setBounds(50, 100, 100, 30);
		l3.setBounds(50, 150, 100, 30);
		tf1.setBounds(250, 50, 100, 30);
		tf2.setBounds(250, 100, 100, 30);
		tf3.setBounds(250, 150, 100, 30);
		f1.add(l1);
		f1.add(l2);
		f1.add(l3);
		f1.add(tf1);
		f1.add(tf2);
		f1.add(tf3);
		f1.addMouseListener(this);
		f1.setLayout(null);
		f1.setSize(500,500);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new clickreleasecal();
	}
public void mousePressed(MouseEvent e) {
	String numa=tf1.getText();
	String numb=tf2.getText();
	
	double num1=Double.parseDouble(numa);
	double num2=Double.parseDouble(numb);
	double res=num1+num2;
	tf3.setText("sum:"+res);
}

public void mouseReleased(MouseEvent e) {
	String numa=tf1.getText();
	String numb=tf2.getText();
	
	double num1=Double.parseDouble(numa);
	double num2=Double.parseDouble(numb);
	double res=num1-num2;
	tf3.setText("Diffrances:"+res);
}

@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
//	String numa=tf1.getText();
//	String numb=tf2.getText();
//	
//	double num1=Double.parseDouble(numa);
//	double num2=Double.parseDouble(numb);
//	double res=num1+num2;
//	tf3.setText("sum:"+res);
//	
}

@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
//	String numa=tf1.getText();
//	String numb=tf2.getText();
//	
//	double num1=Double.parseDouble(numa);
//	double num2=Double.parseDouble(numb);
//	double res=num1-num2;
//	tf3.setText("sum:"+res);
	
}
}
