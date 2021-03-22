import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Gridlyt implements ActionListener{
	JFrame f;
	JButton buttons[];
	Gridlyt(){
	f=new JFrame();
    buttons=new JButton[9];
	for(int i=0;i<9;i++){
    buttons[i]=new JButton(""+(i+1));
	}
	for(int i=0;i<9;i++){
	buttons[i].addActionListener(this);	
	f.add(buttons[i]);
    }
    f.setLayout(new GridLayout(3,3));
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setSize(300,300);
	f.setTitle("Grid Layout");
	f.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae){
    String click=ae.getActionCommand();
    for (int i=1;i<10 ;i++ ) {
    if (click.equals(""+i)){
    	JOptionPane.showMessageDialog(f,"You clicked Button "+i);
    }	
    }
	}
	public static void main(String[] args){
    new Gridlyt();
	}
}