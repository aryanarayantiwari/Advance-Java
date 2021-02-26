import java.awt.*;
import java.awt.event.*;
class WatchChoice extends Frame implements ItemListener{
	String w="";
	Choice watch;
	WatchChoice(){
    setLayout(new FlowLayout());
    watch=new Choice();
    //adding choices
    watch.add("WandaVision");
    watch.add("Legacies");
    watch.add("The Big Bang Theory");
    watch.add("Superman & Lois");
    watch.add("Taarak Mehta Ka Ooltah Chasma");
    watch.addItemListener(this);
    Label l1=new Label("List Of Shows",Label.CENTER);
    add(l1);//adding label
    add(watch);//adding choice in frame
    //closing frame
    addWindowListener(new WindowAdapter(){
    public void windowClosing(WindowEvent e){
    System.exit(0);
    }
	});
    }
    //item state changed method
	public void itemStateChanged(ItemEvent ie){
    repaint();
	}
	//graphics method
	public void paint(Graphics g){
	this.setBackground(Color.yellow);
	Font f=new Font("Arial",Font.BOLD,13);
	g.setFont(f);
	g.setColor(Color.black);
	g.fillRoundRect(20,75,360,200,15,15);
    g.setColor(Color.white);
	g.drawRect(30,85,340,180);
	g.setColor(Color.green);
	g.fillOval(200,268,5,5);
	g.setColor(new Color(5,197,255));
	g.fillRect(32,87,338,178);
	g.setColor(new Color(130,130,133));
	g.fillRect(180,275,45,10);
	g.setColor(new Color(64,64,64));
	g.fillRect(160,280,75,10);
	g.setColor(Color.white);
	w=watch.getSelectedItem();
	g.drawString("You're Watching:"+w,40,245);
	}
	//main method
	public static void main(String[] args){
    WatchChoice W=new WatchChoice();
    W.setVisible(true);
    W.setTitle("What are you Watching ?");
    W.setSize(400,450);
	}
}