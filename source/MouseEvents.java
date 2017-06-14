
/* .Write a java program for handling mouse events*/

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
<applet code="MouseEvents" width=300 height=500>
</applet>
*/
public class MouseEvents extends Applet implements MouseListener,MouseMotionListener
{
	String msg=" ";
	int mouseX=0,mouseY=0;
	public void init()
	{	addMouseListener(this);
		addMouseMotionListener(this);
	}
	public void mouseClicked(MouseEvent me)
	{	mouseX=0;	mouseY=10;
		msg="mouseClicked";
		repaint();
	}
	public void mouseEntered(MouseEvent me)
	{	mouseX=0;	mouseY=10;
		msg="mouse entered";
		repaint();
	}
	public void mouseExited(MouseEvent me)
	{	mouseX=0;	mouseY=10;
		msg="mouse exited";
		repaint();
	}
	public void mousePressed(MouseEvent me) 
	{	mouseX=me.getX();	mouseY=me.getY();
		msg="mouse pressed";
		repaint();
	}
	public void mouseReleased(MouseEvent me)
{	mouseX=me.getX();	mouseY=me.getY();
		msg="Mouse Released";
		repaint();
	}		

	public void mouseDragged(MouseEvent me)
	{
		mouseX=me.getX();	mouseY=me.getY();
		msg="mouse dragged";
		showStatus("Dragging mouse at"+mouseX+","+mouseY);
		repaint();
	}
	public void mouseMoved(MouseEvent me)
	{
		mouseX=me.getX();	mouseY=me.getY();
		showStatus("Moving mouse at"+mouseX+","+mouseY);
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,mouseX,mouseY);
}
}
