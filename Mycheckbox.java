import java.awt.*;
import java.awt.event.*;
class Mycheckbox extends Frame implements ItemListener{
	String msg="";
	Checkbox c1,c2,c3;
	Mycheckbox(){
	setLayout(new FlowLayout());
	c1=new Checkbox("Italic",true);
	c2=new Checkbox("Bold");
	c3=new Checkbox("Underline");
    add(c1);
    add(c2);
	add(c3);
    c1.addItemListener(this);
    c2.addItemListener(this);
	c3.addItemListener(this);
	//to close window
	addWindowListener(new WindowAdapter()
	{
	public void windowClosing(WindowEvent e){
	System.exit(0);
	}
	});
	}
	//method when user click the checkbox
	public void itemStateChanged(ItemEvent ie){
		repaint();
	}
	public void paint(Graphics g){
	Font f=new Font("Arial",Font.PLAIN,14);
	g.setFont(f);
	g.setColor(Color.black);
	msg="Italic:"+c1.getState();	
	g.drawString("Show State:"+msg,15,100);
	msg="Bold:"+c2.getState();
	g.drawString("Show State:"+msg,15,140);
    msg="Underline:"+c3.getState();
	g.drawString("Show State:"+msg,15,180);
	}
	public static void main(String[] args){
    Mycheckbox ch=new Mycheckbox();
    ch.setTitle("Check Box Status");
    ch.setSize(450,400);
    ch.setVisible(true);
	}
}