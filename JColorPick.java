import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class JColorPick extends JFrame implements ActionListener{
JButton b;
Container c;
JColorPick(){
c = getContentPane();
c.setLayout(new FlowLayout());
b = new JButton("Select Color");
c.add(b);
b.addActionListener(this);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
	public void actionPerformed(ActionEvent e){
		Color selectedcolor=null;
		Color color=JColorChooser.showDialog(this,"Select Color",selectedcolor);
		if (selectedcolor!=null) {
			selectedcolor=color;
		}
		c.setBackground(color);
	}
	public static void main(String[] args) {
		JColorPick obj = new JColorPick();
		obj.setSize(400,400);
		obj.setTitle("Color Picker");
		obj.setVisible(true);
	}
}