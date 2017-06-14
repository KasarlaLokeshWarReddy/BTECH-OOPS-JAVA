
/* Write a java program that simulates a traffic light. The program lets the user select one of three lights: red, yellow, or green. When a radio button is selected, the light is turned on, and only one light can be on at a time No light is on when the program starts.*/

import java.awt.*;
import java .awt.event.*;
import javax.swing.*;
public class Trafficlight extends JFrame implements ActionListener
{	JTextField tf;
JRadioButton b1,b2,b3;
Container c;
String str;
Trafficlight()
{	c=getContentPane(); 			c.setLayout(new FlowLayout());
b1=new JRadioButton("RED");	b2=new JRadioButton("GREEN");
b3=new JRadioButton("BLUE");
ButtonGroup bg= new ButtonGroup();
bg.add(b1);	bg.add(b2);	bg.add(b3);
c.add(b1);	c.add(b2);	c.add(b3);
b1.addActionListener(this);		b2.addActionListener(this);
b3.addActionListener(this);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent ae)
{
str=ae.getActionCommand();       repaint();
}
public void paint (Graphics g)
{
if(str.equals("RED"))
{	g.drawRect(100,100,100,300);	g.setColor(Color.red);
g.fillOval(110,160,30,30);		g.setColor(Color.black);
g.fillOval(110,220,30,30);		g.setColor(Color.black);
g.fillOval(110,290,30,30);
}
else if(str.equals("GREEN"))
{
g.drawRect(100,100,100,300);	g.setColor(Color.black);
g.fillOval(110,160,30,30);		g.setColor(Color.green);
g.fillOval(110,220,30,30);		g.setColor(Color.black);
g.fillOval(110,290,30,30);	
}
else if(str.equals("BLUE"))
{	g.drawRect(100,100,100,300);	g.setColor(Color.black);
g.fillOval(110,160,30,30);		g.setColor(Color.black);
g.fillOval(110,220,30,30);		g.setColor(Color.blue);
g.fillOval(110,290,30,30);		
}
}
public static void main(String args[])
{	Trafficlight tf=new Trafficlight ();
tf.setTitle("my buttons");
tf.setSize(700,700);	tf.setVisible(true);
}
}
