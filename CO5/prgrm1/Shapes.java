import java.awt.*;
import java.applet.*;
/*
<applet code="Shapes" width=800 height=800>
</applet>
*/
public class Shapes extends Applet {
  public void paint(Graphics g) {
    g.drawLine(10, 10, 100, 100);
    g.drawRect(100, 150, 100, 150);
    g.drawOval(300, 300, 300, 300);
  }
}