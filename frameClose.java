import java.awt.*;
import java.awt.event.*;
class frameClose extends Frame{
	public static void main(String[] args){
    frameClose c1= new frameClose();
    c1.setTitle("Click to Close");
    c1.setSize(500,450);
    c1.setVisible(true);
    c1.addWindowListener(new newClass());
	}
}
class newClass implements WindowListener{
public void windowActivated(WindowEvent e){}
public void windowClosed(WindowEvent e){}
public void windowClosing(WindowEvent e){
System.exit(0);
}
public void windowDeactivated(WindowEvent e){}
public void windowDeiconified(WindowEvent e){}
public void windowIconified(WindowEvent e){}
public void windowOpened(WindowEvent e){}
}