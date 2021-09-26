/*Develop a program that has a Choice component which contains the names of shapes such
as rectangle, triangle, square and circle. Draw the corresponding shapes for given
parameters as per user’s choice*/

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/* <applet code="Shapes" width=300 height=200>
</applet>
*/
public class Shapes extends Applet implements ActionListener 
{
TextField t;
Button b;
String str;
public void init()
{
t=new TextField(1);
add(t);
b= new Button("ENTER");
add(b);
b.addActionListener(this);

}
public void actionPerformed(ActionEvent a)
{
 str=t.getText();
repaint();

}
public void paint(Graphics g)
{
g.drawString("1.RECTANGLE  2.CIRCLE 3.TRIANGLE 4.SQUARE",10, 10);
if (str.equals("1"))
{
g.drawRect(100, 100, 100, 100);
}
else if(str.equals("2"))
{
g.drawOval(100,100,100,100);
}
else if(str.equals("3"))
{
int xPoints[] ={120, 220,30};
int yPoints[] ={30, 220, 220};
g.drawPolygon(xPoints, yPoints, 3);
}
else
{
g.drawRect(50, 50, 50, 50);
}
}
}
