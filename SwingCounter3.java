import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingCounter3 extends JFrame
{
 private JLabel jlbl;
 private JTextField jtf;
 private JButton jbtn;
 
 private int n;
 
 public SwingCounter3(){
  super("SwingCounter");
  jlbl = new JLabel("counter");
  jtf = new JTextField(10);
  
  n = 0;
  jtf.setText(n+"");
  
  jbtn = new JButton("Count");
  
  jbtn.addActionListener(new ActionListener()
  {
    public void actionPerformed(ActionEvent e)
    {
      n++;
      jtf.setText(n+"");
    }
  });

  Container c = getContentPane();

  c.setLayout(new FlowLayout(FlowLayout.LEFT,10,20));

  c.add(jlbl);
  c.add(jtf);
  c.add(jbtn);

 }
 
}