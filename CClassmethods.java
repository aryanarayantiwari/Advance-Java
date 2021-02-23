import java.awt.*;
import java.awt.event.*;
class CClassmethods extends Frame{
	static String ln="";
	static int x,y,height,width;
	static Dimension size;
	static Point loc,getloc;
	CClassmethods(){
		//closing frame
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
	public void paint(Graphics g){
		Font f=new Font("Monospaced",Font.PLAIN,16);
		//variables for storing values of methods
		Color bg,fg,fc;
		Font fn;
		//set methods
		this.setBackground(new Color(200,80,50));
		this.setForeground(new Color(10,0,180));
 		g.fillRect(25,45,80,40);// component for foreground color
		g.setColor(Color.white);
        g.setFont(f);
        //get methods
		bg=this.getBackground();
		fg=this.getForeground();
        fn=g.getFont();
        fc=g.getColor();
        //drawing components
        g.drawString("Background Color = "+bg,20,130);
        g.drawString("Foreground Color = "+fg,20,150);
        g.drawString("Font Color = "+fc,20,170);
        g.drawString("Font = "+fn,20,190);
        g.drawString("Component Name = "+ln,20,210);
        g.drawString("Size of Frame = "+size,20,230);
        g.drawString("Height of Frame = "+height,20,250);
        g.drawString("Width of Frame = "+width,20,270);
        g.drawString("Location of Frame = "+loc,20,290);
        g.drawString("Location of Label = "+getloc,20,310);
        g.drawString("X of Button = "+x,20,330);
        g.drawString("Y of Button = "+y,20,350);
        

	}	
public static void main(String[] args) {
	CClassmethods c1=new CClassmethods();
	Label l1=new Label(" This is a Label ");
	Button b1=new Button("Button");
	Button b2=new Button("Disabled");
	//set methods
	b1.setBounds(30,52,70,25);
	b2.setBounds(120,52,70,25);
	b2.setEnabled(false);
	l1.setName("MyLabel");
	l1.setBounds(160,50,100,30);
	l1.setLocation(200,50);
	c1.setSize(800,400);
	c1.setVisible(true);
	c1.setTitle("Component Class Methods");
	c1.setLayout(null);
	//adding components to frame
	c1.add(b1);
	c1.add(b2);
	c1.add(l1);
	c1.add(l1);
	//get methods
	getloc=l1.getLocation();
	ln=l1.getName();
	size=c1.getSize();
	height=c1.getHeight();
	width=c1.getWidth();
    x=b1.getX();
	y=b1.getY();
    loc=l1.getLocation();
}
}