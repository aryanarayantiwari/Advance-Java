import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class CardlytDemo extends JFrame implements ItemListener{
	Container pane=getContentPane();
	JPanel cards;
	CardLayout card;
	String BUTTONPANEL="JButton";
	String LISTPANEL="JList";
	String LABELPANEL="JLabel";
	String RADIOBUTTONPANEL="JRadioButton";
	String TEXTPANEL="TextField";
	String listitems[]={"Item1","Item2","Item3"};
	JPanel cbp=new JPanel();
	String comboBoxItems[] = { BUTTONPANEL, TEXTPANEL,LISTPANEL,LABELPANEL,RADIOBUTTONPANEL };
	JComboBox cb=new JComboBox(comboBoxItems);
	CardlytDemo(){
	cb.addItemListener(this);
	cbp.add(cb);
	JPanel card1=new JPanel();
	card1.add(new JButton("Button 1"));
	card1.add(new JButton("Button 2"));
	card1.add(new JButton("Button 3"));
	JPanel card2=new JPanel();
	card2.add(new JTextField("TextField",20));
	JPanel card3=new JPanel();
	card3.add(new JList(listitems));
    JPanel card4=new JPanel();
	card4.add(new JRadioButton("R Button 1"));
	card4.add(new JRadioButton("R Button 2"));
	card4.add(new JRadioButton("R Button 3"));
	JPanel card5=new JPanel();
	card5.add(new JLabel("JLabel"));
	cards=new JPanel(new CardLayout());
	cards.add(card1,BUTTONPANEL);
	cards.add(card2,TEXTPANEL);
	cards.add(card3,LISTPANEL);
	cards.add(card4,RADIOBUTTONPANEL);
	cards.add(card5,LABELPANEL);

	pane.add(cbp, BorderLayout.PAGE_START);
    pane.add(cards, BorderLayout.CENTER);
	}
	public void itemStateChanged(ItemEvent e){
		 CardLayout cl = (CardLayout)(cards.getLayout());
        cl.show(cards, (String)e.getItem());
	}
	public static void main(String[] args){
		CardlytDemo c1=new CardlytDemo();
		c1.setTitle("Card Layout");
		c1.setDefaultCloseOperation(EXIT_ON_CLOSE);
		c1.setSize(300,300);
		c1.setVisible(true);
	}
}