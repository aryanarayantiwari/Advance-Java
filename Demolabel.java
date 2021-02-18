import java.awt.*;
import java.awt.event.*;
class Demolabel extends Frame{
    public static void main(String[] args) {
        Demolabel t1=new Demolabel();
        Label l1=new Label("Welcome to Java GUI");
        Label l2=new Label("Abstract Window Toolkit");
        l1.setBounds(50,100,200,30);
        l2.setBounds(50,50,200,30);
        t1.setTitle("Test AWT");
        t1.setSize(500,500);
        t1.setVisible(true);
        t1.setLayout(null);
        t1.add(l1);
        t1.add(l2);
        t1.addWindowListener(new Close());
        
    }
}
class Close extends WindowAdapter{
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}