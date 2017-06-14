/* Develop an applet that receives an integer in one text field, and computes its factorial value and returns it in another text field, when the button named “Compute” is clicked.*/

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
//<applet code="SApplet" width=300 height=240></applet>
public class SApplet extends Applet implements ActionListener
{
String msg=" ";
TextField f1,f2;
Button b;
Label l,l1,l2;
public void init()
{
f1=new TextField("",5);	f2=new TextField("",10);
b=new Button("compute");
l= new Label("enter value of A:");
l2=new Label("fact of A");
l1=new Label("week six prgm B");
setLayout(null);
l1.setBounds(10,10,120,30);		l.setBounds(10,35,120,30);
f1.setBounds(10,60,120,30);		l2.setBounds(10,85,120,30);
f2.setBounds(10,110,120,30);		b.setBounds(10,140,120,30);
add(l1);	add(l);
add(f1);	add(l2);
add(f2);	f2.setEnabled(false);
add(b);		b.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
if(e.getActionCommand().equals("compute"))
{
int n=Integer.parseInt(f1.getText());
int i=1,f=1;
while(i<=n)
{
f=f*i;
i=i+1;
}
f2.setText(""+f);
}
}

public void paint(Graphics g)
{
g.drawString("simple applet with events",10,200);
}
}
