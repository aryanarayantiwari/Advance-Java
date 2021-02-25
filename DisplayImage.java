import java.awt.*;
import java.awt.event.*;
class DisplayImage extends Frame{
	DisplayImage(){
	//frame closing
	addWindowListener(new WindowAdapter(){
    public void windowClosing(WindowEvent e){
    System.exit(0);
    } 
    });
	}	
	public void paint(Graphics g){
		//loading image
		Image img = Toolkit.getDefaultToolkit().getImage("Images/abc.jpg");
		//displaying image
		g.drawImage(img,50,60,this);
	}
public static void main(String[] args){
DisplayImage d=new DisplayImage();
d.setTitle("Display Image");
d.setVisible(true);
d.setSize(500,450);
}
}