
/* Write an applet that displays a simple message */

import java.awt.*;
import java.applet.*;
/*
<applet code="SimpleApplet" width=300 height=300>
</applet>
*/
public class SimpleApplet extends Applet
{
	public void paint(Graphics g) 
	{
		g.drawString("A sample applet",20,20);
	}
}
