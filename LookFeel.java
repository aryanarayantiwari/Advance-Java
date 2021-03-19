import java.awt.*;
import java.awt.event.*;
import javax.swing.plaf.*;
import javax.swing.*;
class LookFeel extends JFrame implements ItemListener{
	
	JButton b;
	JCheckBox cb;
	JLabel l;
	JTextField t;
	JRadioButton me,mo,wi;
	ButtonGroup bg;
	Container c;
	
	LookFeel(){
    
    c=this.getContentPane();
    c.setLayout(null);

    b=new JButton("Button");
    cb=new JCheckBox("Checkbox");
    t=new JTextField("TEXT",20);
	l=new JLabel("Select Look and Feel:");
	me=new JRadioButton("Metal");
	mo=new JRadioButton("Motif");
	wi=new JRadioButton("Window");

	bg=new ButtonGroup();
	bg.add(me);
	bg.add(mo);
	bg.add(wi);

	me.addItemListener(this);
	mo.addItemListener(this);
	wi.addItemListener(this);

	b.setBounds(100,50,75,40);
	cb.setBounds(100,100,100,40);
	t.setBounds(100,150,100,40);
	l.setBounds(100,200,150,30);
	me.setBounds(50,250,100,30);
	mo.setBounds(150,250,100,30);
	wi.setBounds(250,250,100,30);

	c.add(b);
	c.add(cb);
	c.add(t);
	c.add(l);
	c.add(me);
	c.add(mo);
	c.add(wi);
	
    setSize(400,400);
    setTitle("Look and Feel");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);    
	}
	public void itemStateChanged(ItemEvent ie){
	try{
    if (me.isSelected()) {
    	UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
    	t.setText("METAL");
    }
    else if (mo.isSelected()) {
    	UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
    	t.setText("MOTIF");
    }
    else if (wi.isSelected()) {
    	UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
    	t.setText("WINDOW");
    }
    SwingUtilities.updateComponentTreeUI(this);
}
catch (Exception e) {
	System.out.println("Exception Occured "+e);
    }
   }
	public static void main(String[] args) {
		new LookFeel();
	}
}