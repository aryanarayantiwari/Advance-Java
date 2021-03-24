import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Calculator extends JFrame implements ActionListener {

  private double total1 = 0.0;
  private double total2 = 0.0;
  private char math;
  JButton button[];
  JPanel btnpanel = new JPanel();
  JTextField tf;

  //start of constructor
  Calculator() {
    tf = new JTextField(10);
    button = new JButton[10];
    //creating buttons 0 to 9
    for (int i = 0; i < 10; i++) {
      button[i] = new JButton("" + (i));
    }
    //creating math operator buttons
    JButton add = new JButton("+");
    JButton sub = new JButton("-");
    JButton div = new JButton("/");
    JButton mul = new JButton("*");
    JButton dec = new JButton(".");
    JButton eql = new JButton("=");
    JButton clr = new JButton("Clear");

    //adding action listener to buttons with their methods
    button[0].addActionListener(
        new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            String buttontext = tf.getText() + button[0].getText();
            tf.setText(buttontext);
          }
        }
      );
    button[1].addActionListener(
        new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            String buttontext = tf.getText() + button[1].getText();
            tf.setText(buttontext);
          }
        }
      );
    button[2].addActionListener(
        new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            String buttontext = tf.getText() + button[2].getText();
            tf.setText(buttontext);
          }
        }
      );
    button[3].addActionListener(
        new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            String buttontext = tf.getText() + button[3].getText();
            tf.setText(buttontext);
          }
        }
      );
    button[4].addActionListener(
        new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            String buttontext = tf.getText() + button[4].getText();
            tf.setText(buttontext);
          }
        }
      );
    button[5].addActionListener(
        new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            String buttontext = tf.getText() + button[5].getText();
            tf.setText(buttontext);
          }
        }
      );
    button[6].addActionListener(
        new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            String buttontext = tf.getText() + button[6].getText();
            tf.setText(buttontext);
          }
        }
      );
    button[7].addActionListener(
        new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            String buttontext = tf.getText() + button[7].getText();
            tf.setText(buttontext);
          }
        }
      );
    button[8].addActionListener(
        new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            String buttontext = tf.getText() + button[8].getText();
            tf.setText(buttontext);
          }
        }
      );
    button[9].addActionListener(
        new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            String buttontext = tf.getText() + button[9].getText();
            tf.setText(buttontext);
          }
        }
      );
    dec.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          String buttondectext = tf.getText() + dec.getText();
          tf.setText(buttondectext);
        }
      }
    );
    add.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          String buttontext = add.getText();
          getOperator(buttontext);
        }
      }
    );
    sub.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          String buttontext = sub.getText();
          getOperator(buttontext);
        }
      }
    );
    div.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          String buttontext = div.getText();
          getOperator(buttontext);
        }
      }
    );
    mul.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          String buttontext = mul.getText();
          getOperator(buttontext);
        }
      }
    );
    eql.addActionListener(this);
    clr.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          total2 = 0;
          tf.setText("");
        }
      }
    );
    //setting grid layout to panel
    btnpanel.setLayout(new GridLayout(4, 4));
    //adding components to panel
    btnpanel.add(button[1]);btnpanel.add(button[2]);btnpanel.add(button[3]);btnpanel.add(add);
    btnpanel.add(button[4]);btnpanel.add(button[5]);btnpanel.add(button[6]);btnpanel.add(sub);
    btnpanel.add(button[7]);btnpanel.add(button[8]);btnpanel.add(button[9]);btnpanel.add(mul);
    btnpanel.add(button[0]);btnpanel.add(dec);btnpanel.add(eql);btnpanel.add(div);
    //adding components to JFrame with border layout
    add(tf, BorderLayout.NORTH);
    add(btnpanel, BorderLayout.CENTER);
    add(clr, BorderLayout.SOUTH);
    //closing the JFrame
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //setting properties of JFrame
    setVisible(true);
    setSize(250,250);
    setTitle("Calculator");
    //end of constructor
  }

  //math operator method
  public void getOperator(String buttontext) {
    math = buttontext.charAt(0);
    total1 = total1 + Double.parseDouble(tf.getText());
    tf.setText("");
  }

  //equal method
  public void actionPerformed(ActionEvent e) {
    String cmd = e.getActionCommand();
    if (cmd.equals("=")) {
      switch (math) {
        case '+':
          total2 = total1 + (Double.parseDouble(tf.getText()));
          break;
        case '-':
          total2 = total1 - (Double.parseDouble(tf.getText()));
          break;
        case '*':
          total2 = total1 * (Double.parseDouble(tf.getText()));
          break;
        case '/':
          total2 = total1 / (Double.parseDouble(tf.getText()));
          break;
      }
      tf.setText(Double.toString(total2));
      total1 = 0;
    }
  }

  //main method
  public static void main(String[] args) {
    new Calculator();
  }
}
