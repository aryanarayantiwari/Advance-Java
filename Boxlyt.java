import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Boxlyt extends Frame implements ActionListener{
	Button buttons[];
    Boxlyt(){
    buttons=new Button[5];
    for(int i=0;i<5;i++){
    buttons[i]=new Button("Button "+(i+1));
    buttons[i].addActionListener(this);	
    add(buttons[i]);
    }
    setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
    setSize(400,400);
    setTitle("Box Layout");
    setVisible(true);
    addWindowListener(new WindowAdapter(){
    	public void windowClosing(WindowEvent e){
    	System.exit(0);
    	}
    });
    }
    public void actionPerformed(ActionEvent ae){
    String click=ae.getActionCommand();
    for (int i=0;i<5 ;i++ ) {
    if (click.equals("Button "+i)){
    	JOptionPane.showMessageDialog(this,"You clicked Button "+i);
    }	
    }
	}
    public static void main(String[] args){
    Boxlyt bl= new Boxlyt();
    }
}