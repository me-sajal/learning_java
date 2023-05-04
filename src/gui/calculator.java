package gui;
import java.awt.event.*;
import java.awt.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class calculator implements ActionListener{

	
	JFrame f1= new JFrame("calculator");
	JLabel l1,l2,l3 ;
	JTextField tf1,tf2,tf3;
	Button b1,b2,b3,b4;
	public calculator() {
		l1=new JLabel ("number 1 :");
		l2=new JLabel ("number 2 :");
		l3=new JLabel ("Result :");
		tf1=new JTextField();
		tf2=new JTextField();
		tf3=new JTextField();
		b1=new Button("+");
		b2=new Button("-");
		b3=new Button("*");
		b4=new Button("/");
		l1.setBounds(50, 50, 100, 30);
		l2.setBounds(50, 100, 100, 30);
		l3.setBounds(50, 150, 100, 30);
		tf1.setBounds(250, 50, 100, 30);
		tf2.setBounds(250, 100, 100, 30);
		tf3.setBounds(250, 150, 100, 30);
		b1.setBounds(150,400,100,30);
		b2.setBounds(300,400,100,30);
		b3.setBounds(150,450,100,30);
		b4.setBounds(300,450,100,30);
	
		f1.add(l1);
		f1.add(l2);
		f1.add(l3);
		f1.add(tf1);
		f1.add(tf2);
		f1.add(tf3);
		f1.add(b1);
		f1.add(b2);
		f1.add(b3);
		f1.add(b4);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		f1.setLayout(null);
		f1.setSize(900,900);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
	public void actionPerformed(ActionEvent e) {
		String num1=tf1.getText();
		double num1n=Double.parseDouble(num1);
		String num2=tf2.getText();
		double num2n=Double.parseDouble(num2);
		
		if(e.getSource()==b1) {
			double res=num1n+num2n;
			tf3.setText(""+res);
		}
		else if(e.getSource()==b2) {
			double res=num1n-num2n;
			tf3.setText(""+res);
		}
		else if(e.getSource()==b3) {
			double res=num1n*num2n;
			tf3.setText(""+res);
		}
		else if(e.getSource()==b4) {
			double res=num1n/num2n;
			tf3.setText(""+res);
		}
	}
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		calculator c=new calculator();
	}
	
	}	

