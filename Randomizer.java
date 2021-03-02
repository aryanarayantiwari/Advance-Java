import java.awt.*;
import java.awt.event.*;
import java.lang.Math;//importing math package for random method
class Randomizer extends Frame implements ActionListener{//implementing action listener
	String[] arr={"play COD","watch TV","study","go out","listen music","sleep","use Whatsapp","use Instagram"};//list of things to chose from
	String msg="";
	String name="User";
	double d;
	int i;
	TextField t1=new TextField(10);//text field to take user name 
	 //start of the constructor
	 Randomizer(){
	 //closing the window
	 addWindowListener(new WindowAdapter(){
	 public void windowClosing(WindowEvent e){
	 System.exit(0);
	 }
	 });
	 //setting layout
	 setLayout(new FlowLayout());
	 Label l1=new Label("Name",Label.CENTER);
	 Button b1=new Button("Click");
	 l1.setBackground(new Color(32,68,92));
	 l1.setForeground(Color.white);
         b1.setBackground(new Color(35,68,92));
         b1.setForeground(Color.white);
         b1.addActionListener(this);
         t1.addActionListener(this);
         this.add(l1);
	 this.add(t1);
	 this.add(b1);
	 this.setBackground(Color.red);
	 }
    //end of constructor
	public void actionPerformed(ActionEvent ae){//action method
         String str=ae.getActionCommand();//gives the label
	 if(str.equals("Click")){//if user clicks button
	 name=t1.getText();
	 d=Math.random()*arr.length;//generating a random number
         i=(int)Math.floor(d);//flooring the value
         msg=arr[i];//getting the message
         repaint();//to refresh the message
          }
        }
	public void paint(Graphics g){
	 Font f=new Font("Arial",Font.BOLD,25);
	 Font j=new Font("Arial",Font.PLAIN,14);
	 g.setFont(f);
	 g.setColor(Color.white);
	 g.drawString("Message:Hey! "+name+" I think you should "+msg+".",15,100);//message on screen
	 g.setFont(j);
	 g.drawString("Note:Press the 'Click' button multiple times to randomly select from the available list of choices",15,140);
	 }
 public static void main(String[] args){
	Randomizer r=new Randomizer();
	r.setVisible(true);
	r.setSize(650,200);
	r.setTitle("What to do?");
}
}
