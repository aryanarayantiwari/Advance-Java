import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Borderlyt implements ActionListener{
	JFrame f;
	Borderlyt(){
	f=new JFrame();
	JButton b1=new JButton("North Btn");
	JButton b2=new JButton("South Btn");
	JButton b3=new JButton("East Btn");
	JButton b4=new JButton("West Btn");
	JButton b5=new JButton("Center Btn");

	f.add(b1,BorderLayout.NORTH);
	f.add(b2,BorderLayout.SOUTH);
	f.add(b3,BorderLayout.EAST);
	f.add(b4,BorderLayout.WEST);
	f.add(b5,BorderLayout.CENTER);
	f.setSize(400,400);
	f.setVisible(true);
	f.setTitle("Border Layout");
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	b5.addActionListener(this);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e){
	String msg="";
	msg=e.getActionCommand();
	if(msg.equals("North Btn")){
		JOptionPane.showMessageDialog(f,"You clicked North Button");
	}
	else if(msg.equals("South Btn")){
		JOptionPane.showMessageDialog(f,"You clicked South Button");
	}
	else if(msg.equals("West Btn")){
		JOptionPane.showMessageDialog(f,"You clicked West Button");
	}
	else if(msg.equals("East Btn")){
		JOptionPane.showMessageDialog(f,"You clicked East Button");
	}
	else{
		JOptionPane.showMessageDialog(f,"You clicked Center Button");
	}
	}
	public static void main(String[] args){
    new Borderlyt();
	}
}