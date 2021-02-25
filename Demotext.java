import java.awt.*;
import java.awt.event.*;
class Demotext extends Frame{
	Demotext(){
	addWindowListener(new WindowAdapter(){
    public void windowClosing(WindowEvent e){
    System.exit(0);
    }
	});

	}
	public void paint(Graphics g){
        this.setBackground(new Color(104,176,212));
	}
	public static void main(String[] args){
	Demotext f1=new Demotext();
	f1.setTitle("Send E-mail");
	f1.setVisible(true);
	f1.setSize(560,250);
	f1.setLayout(new FlowLayout());
	Label l1=new Label("Name:",Label.RIGHT);
	Label l2=new Label("Email:",Label.RIGHT);
	Label l3=new Label("Subject:",Label.RIGHT);
	Label l4=new Label("Message:",Label.RIGHT);
    TextField t1=new TextField("Enter Name",25);
    TextField t2=new TextField("Enter Email",25);
    TextField t3=new TextField("Enter Subject",25);
    TextArea t4=new TextArea("Enter Your Message Here",5,25);
    Button b1=new Button("Send");
    f1.add(l1);
	f1.add(t1);
	f1.add(l2);
	f1.add(t2);
	f1.add(l3);
	f1.add(t3);
	f1.add(l4);
	f1.add(t4);
	f1.add(b1);
	}
}