package gui;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.*;
import java.awt.event.*;
public class form implements ActionListener{
	JFrame f1;
	JLabel l1,l2,l3,l4,l5;
	JTextField tf1,tf2,tf3;
	JRadioButton r1,r2,r3;
	JButton b1,b2;
	JTextArea ta;
	String sub[]= {"","C","C++","JAVA"};
	JCheckBox cb;
	@SuppressWarnings("rawtypes")
	JComboBox CB;
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public form() {
		CB=new JComboBox(sub);
		ta=new JTextArea("Texts \n goes \n here \n at \n last. ");
		l1=new JLabel ("Name :");
		l2=new JLabel ("Address :");
		l3=new JLabel ("Contact :");
		l4=new JLabel ("Gender :");
		l5=new JLabel ("Subjects :");
		tf1=new JTextField();
		tf2=new JTextField();
		tf3=new JTextField();
		r1=new JRadioButton("Male");
		r2=new JRadioButton("Female");
		r3=new JRadioButton("Others");
		cb=new JCheckBox("I Accept terms and conditions.");
		b1=new JButton("Subbmit");
		b2=new JButton("Clear");
		f1=new JFrame("Form");
		l1.setBounds(50, 50, 100, 30);
		l2.setBounds(50, 100, 100, 30);
		l3.setBounds(50, 150, 100, 30);
		l4.setBounds(50, 200, 100, 30);
		l5.setBounds(50, 250, 100, 30);
		tf1.setBounds(250, 50, 100, 30);
		tf2.setBounds(250, 100, 100, 30);
		tf3.setBounds(250, 150, 100, 30);
		ta.setBounds(400,50,80,100);
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		r1.setBounds(175,200,75,30);
		r2.setBounds(275,200,75,30);
		r3.setBounds(375,200,75,30);
		cb.setBounds(50,300,250,30);
		CB.setBounds(200,250,100,30);
		b1.setBounds(150,400,100,30);
		b2.setBounds(300,400,100,30);
		f1.add(l1);
		f1.add(l2);
		f1.add(l3);
		f1.add(l4);
		f1.add(l5);
		f1.add(tf1);
		f1.add(tf2);
		f1.add(tf3);
		f1.add(r1);
		f1.add(r2);
		f1.add(r3);
		f1.add(cb);
		f1.add(CB);
		f1.add(b1);
		f1.add(b2);
		f1.add(ta);
		f1.setLayout(null);
		f1.setSize(900,900);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(EXIT_ON_CLOSE);
		b1.addActionListener(this);
		b2.addActionListener( this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new form();
	}
	public void actionPerformed(ActionEvent e) {
		String name=tf1.getText();
		String add=tf2.getText();
		String con=tf3.getText();
		String subject= CB.getSelectedItem()+"";
		String gender;
		gender=findgen();
		if(e.getSource()==b1) {
			if(cb.isSelected()) {
				ta.setText("Name: "+name+ "\n Address: "+add+"\n Contacts: "+con+"\n Gender: "+gender + "Subject: "+subject);
			}
		}
		else if (e.getSource()==b2) {
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
			tf1.setText("");
			CB.setSelectedIndex(0);
			ta.setText("Texts \n goes \n here \n at \n last. ");
			if (r1.isSelected()) {
				r1.setSelected(false);
			}
			else if (r2.isSelected()) {
				r2.setSelected(false);
			}
			else if (r3.isSelected()) {
				r3.setSelected(false);
			}
			cb.setSelected(false);
			}
		}		
			
	 	String findgen() {
	 		if(r1.isSelected()) {
	 			return"Male";
	 		}
	 		else if(r2.isSelected()) {
	 			return"Female";
	 		}
	 		else if(r3.isSelected()) {
	 			return"Others";
	 		}
	 		return null;
	 	}
}