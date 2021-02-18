import java.awt.*;
import java.awt.event.*;
class Btn extends Frame{
    public static void main(String[] args) {
        Btn b=new Btn();
        Label l1=new Label("Button using AWT");
        Button b1=new Button("Click Me");
        b.setTitle("Button");
        b.setVisible(true);
        b.setSize(500,500);
        b.setLayout(null);
        b.addWindowListener(new Close());
        b1.setBounds(50,50,200,30);
        l1.setBounds(50,100,200,30);
        b.add(b1);
        b.add(l1);
        
    }
}
