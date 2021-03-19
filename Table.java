import javax.swing.*;
public class Table{
	JFrame f;
	JLabel team;
	Table(){
	f=new JFrame();
	team=new JLabel("Team India");
	String data[][]={{"At No.1","Rahul","110"},
		{"At No.2","Rohit","118"},
		{"At No.3","Virat","94"},
		{"At No.4","Shreyas","67"},
		{"At No.5","Rishabh","65"}};
	String column[]={"POSITION","NAME","CAREER BEST"};
	JTable jt=new JTable(data, column);    
    jt.setBounds(30,40,200,300);          
    JScrollPane sp=new JScrollPane(jt);
	f.add(sp);
	f.setSize(300,400);
	f.setTitle("JTable");
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setVisible(true);
	}
	public static void main(String[] args){
	new Table();
	}
}