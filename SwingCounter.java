import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingCounter extends JFrame implements ActionListener
{
 private JLabel jlbl;
 private JTextField jtf;
 private JButton jbtn;
 
 private int n;
 
 public SwingCounter(){
  super("SwingCounter");
  jlbl = new JLabel("counter");
  jtf = new JTextField(10);
  
  n = 0;
  jtf.setText(n+"");
  
  jbtn = new JButton("Count");
  
  jbtn.addActionListener(this);

  Container c = getContentPane();

  c.setLayout(new FlowLayout(FlowLayout.LEFT,10,20));

  c.add(jlbl);
  c.add(jtf);
  c.add(jbtn);

 }
 
 public void actionPerformed(ActionEvent e)
 {
   if(e.getSource() == jbtn)
   {
     n++;
     jtf.setText(n+"");
   }
 }
 
}