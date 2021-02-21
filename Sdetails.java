import java.awt.*;
import java.awt.event.*;
class Sdetails extends Frame{
    Sdetails(){
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
            System.exit(0);
            }
        });
    }
    public void paint(Graphics g){
        this.setBackground(new Color(255,50,50));
        Font f1=new Font("Helvetica",Font.PLAIN,25);
        Font f2=new Font("Arial",Font.BOLD,25);
        Font f3=new Font("Comic Sans MS",Font.ITALIC,25);
        Font f4=new Font("Monospaced",Font.BOLD | Font.ITALIC,25);
        g.setFont(f1);
        g.setColor(Color.green);
        g.drawString(" Name - Arya Narayan Tiwari ",65,130);
        g.setFont(f2);
        g.setColor(Color.blue);
        g.drawString(" Enroll - 19100BTIT06543 ",65,165);
        g.setFont(f3);
        g.setColor(Color.yellow);
        g.drawString(" Program - B.Tech(IT) ",65,195);
        g.setFont(f4);
        g.setColor(Color.green);
        g.drawString(" Session - July 2021 ",65,225);
    }
    public static void main(String[] args) {
        Sdetails s1=new Sdetails();
        s1.setSize(500,300);
        s1.setTitle("Student Information");
        s1.setVisible(true);
    }
}