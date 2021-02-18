import java.awt.*;
import java.awt.event.*;
class frameClose1 extends Frame{
	public static void main(String[] args){
    frameClose1 c1= new frameClose1();
    c1.setTitle("Click to Close");
    c1.setSize(300,150);
    c1.setVisible(true);
    c1.addWindowListener(new newClass());
	}
}
class newClass extends WindowAdapter{
public void windowClosing(WindowEvent e){
System.exit(0);
}
}
