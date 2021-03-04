import java.awt.*;
import java.awt.event.*;
class Scribble extends Frame implements MouseListener,MouseMotionListener,ActionListener{
	public int last_x,last_y;
    String color;
	Scribble(){
	setLayout( new FlowLayout());
	this.addMouseListener(this);
	this.addMouseMotionListener(this);
	Label l1=new Label("Select Color",Label.CENTER);	
	Button b1=new Button("Blue");
	Button b2=new Button("Green");
	Button b3=new Button("Red");
	Button b4=new Button("Orange");
	Button b5=new Button("Yellow");
	b1.setBackground(Color.blue);
	b2.setBackground(Color.green);
	b3.setBackground(Color.red);
	b4.setBackground(Color.orange);
	b5.setBackground(Color.yellow);
	this.add(l1);
	this.add(b1);
	this.add(b2);
	this.add(b3);
	this.add(b4);
	this.add(b5);
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	b5.addActionListener(this);
	addWindowListener(new WindowAdapter(){
	public void windowClosing(WindowEvent e){
	System.exit(0);
	}
	});
	}
	
	public void actionPerformed(ActionEvent ae){
    String str=ae.getActionCommand();
    if (str.equals("Red")){
    color="red";
    }
    if (str.equals("Blue")){
    color="blue";
    }
    if (str.equals("Green")){
    color="green";
    }
    if (str.equals("Yellow")){
    color="yellow";
    }
    if (str.equals("Orange")){
    color="orange";
    }
	}

	public void mousePressed(MouseEvent e){
    last_x=e.getX();
    last_y=e.getY();
	}
	public void mouseDragged(MouseEvent e){
    Graphics g=this.getGraphics();
    int x=e.getX(),y=e.getY();
    if(color=="red"){
    	g.setColor(Color.red);
    }
    else if(color=="yellow"){
    	g.setColor(Color.yellow);
    }
    else if(color=="blue"){
    	g.setColor(Color.blue);
    }
    else if(color=="green"){
    	g.setColor(Color.green);
    }
    else if(color=="orange"){
    	g.setColor(Color.orange);
    }
    else{
    	g.setColor(Color.black);
    }
    g.drawLine(last_x,last_y,x,y);
    last_x=x;last_y=y;
	}
	public void mouseClicked(MouseEvent e){}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}
	public void mouseMoved(MouseEvent e){}
	
	public static void main(String[] args){
    Scribble s=new Scribble();
    s.setVisible(true);
    s.setSize(450,400);
    s.setTitle("Scribble");
	}
}