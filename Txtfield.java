import java.awt.*;
import java.awt.event.*;
class Txtfield extends Frame{
    public static void main(String[] args) {
        Txtfield t_frame=new Txtfield();
        TextArea t1=new TextArea("This is textfield");
        t1.setBounds(30,40,200,200);
        t_frame.setTitle("Text Field AWT");
        t_frame.add(t1);
        t_frame.setSize(300,300);
        t_frame.setVisible(true);
        t_frame.addWindowListener(new Close()); 
    }
}