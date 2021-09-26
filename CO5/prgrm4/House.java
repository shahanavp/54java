/*Using 2D graphics commands in an Applet, construct a house. On mouse click event,
change the color of the door from blue to red.*/

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/* <applet code="House" width=300 height=200>
</applet>
*/

public class House extends Applet implements MouseListener
{
public void init()
{
 addMouseListener(this);

}
public void mouseClicked(MouseEvent e)
            {
		Graphics g=getGraphics();
		g.setColor(Color.red);
		g.fillRect(90,300,60,120);
              
            }
                public void mousePressed(MouseEvent e){}
                public void mouseEntered(MouseEvent e){}
                public void mouseExited(MouseEvent e){}
                public void mouseReleased(MouseEvent e){}
public void paint(Graphics g)
{
int xPoints[] ={120, 220,30};
int yPoints[] ={30, 220, 220};
g.drawPolygon(xPoints, yPoints, 3);
g.drawRect(30,220,190,200);
g.setColor(Color.blue);
g.fillRect(90,300,60,120);
}
}
