import java.awt.*;
import java.awt.event.*;
public class DrawSmiley extends Frame{
DrawSmiley(){
	//closing the frame
	this.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e){
			System.exit(0);
		}
	});
}
//to refresh the frame contents
public void paint(Graphics g){
	g.setColor(Color.blue);
	g.fillRect(40,40,200,200);
	//face
	g.setColor(Color.yellow);
	g.fillOval(90,70,80,80);
	//eyes
	g.setColor(Color.black);
	g.fillOval(110,95,5,5);
	g.fillOval(145,95,5,5);
	//nose
	// g.drawLine(130,95,130,115);
	//smile
	g.setColor(Color.red);
	g.drawArc(113,115,35,20,0,-180);
}
public static void main(String[] args) {
	DrawSmiley d=new DrawSmiley();
	d.setTitle("Smiley");
	d.setSize(400,400);
	d.setVisible(true);
}
}