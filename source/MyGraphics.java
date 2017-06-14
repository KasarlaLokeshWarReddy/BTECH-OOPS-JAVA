/* Write a java program that allows the user to draw lines, rectangle and ovals.*/

import java.awt.*;
import java.applet.*;
/* <applet code="MyGraphics" width=300 height=300>
   </applet>
*/
public class MyGraphics extends Applet
{
	int x[]={10,20,30,20,10};	
int y[]={20,5,20,25,20};
	public void init() 
	{
		setForeground(Color.black);
		setBackground(Color.white);
	}
	public void paint(Graphics g)
	{
		g.drawLine(10,20,40,20);
		g.drawLine(60,20,60,80);
		g.drawLine(120,20,90,80);
		g.drawLine(170,20,200,80);
		g.drawRect(10,100,30,10);
		g.fillRect(10,130,30,10);
		g.drawRoundRect(100,100,30,10,5,5);
		g.fillRoundRect(100,130,30,10,5,5);
		g.drawOval(10,160,30,40);
		g.fillOval(100,160,30,40);
	}
}
