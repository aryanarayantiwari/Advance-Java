import java.awt.*;
import java.awt.event.*;
class DrawPhone extends Frame{
DrawPhone(){
    //closing the frame
    this.addWindowListener(new WindowAdapter(){
    public void windowClosing(WindowEvent e ){
        System.exit(0);
    }
    });
}
//frame contents
public void paint(Graphics g){
    //white canvas
    g.setColor(Color.white);
    g.fillRect(10,30,378,355);
    //rounded rectangle main body
    g.setColor(Color.black);
    g.fillRoundRect(110,45,150,240,30,30);
    //rounded rectangle screen 
    g.setColor(Color.blue);
    g.fillRoundRect(120,52,130,215,15,15);
    //rounded google tab
    g.setColor(Color.white);
    g.fillRoundRect(125,60,120,15,5,5);
    g.setColor(Color.red);
    g.drawLine(130,63,130,73);
    //time
    g.setColor(Color.white);
    g.drawLine(130,86,130,106);
    g.setColor(Color.white);
    g.drawLine(140,86,140,106);
    g.setColor(Color.white);
    g.fillOval(145,86,6,6);
    g.setColor(Color.white);
    g.fillOval(145,100,6,6);
    g.setColor(Color.white);
    g.drawOval(155,86,10,20);
    g.setColor(Color.white);
    g.drawOval(168,86,10,20);
    //app icons 
    g.setColor(Color.green);
    g.fillOval(130,245,16,16);
    g.setColor(Color.yellow);
    g.fillOval(155,245,16,16);
    g.setColor(Color.red);
    g.fillOval(180,245,16,16);
    g.setColor(Color.pink);
    g.fillOval(205,245,16,16);
    g.setColor(Color.white);
    g.fillOval(230,245,16,16);
    //home button
    g.setColor(Color.white);
    g.drawOval(180,270,10,10);
}
public static void main(String[] args){
    DrawPhone d=new DrawPhone();
    d.setTitle("Phone");
    d.setSize(400,400);
    d.setVisible(true);
}
}