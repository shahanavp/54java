import java.awt.*;
import java.applet.*;
/*
<applet code="Percentage" width=500 height=500>
<param name="a" value="40">
<param name="b" value="40">
<param name="c" value="40">
<param name="d" value="40">
<param name="e" value="40">
</applet>
*/
public class Percentage extends Applet {
  int a;
  int b;
  int c;
  int d;
  int e;
  float sum;
  float perce;
  String str;

  public void start() {
    String s1;

    s1 = getParameter("a");
    a = Integer.parseInt(s1);

    s1 = getParameter("b");
    b = Integer.parseInt(s1);

    s1 = getParameter("c");
    c = Integer.parseInt(s1);

    s1 = getParameter("d");
    d = Integer.parseInt(s1);

    s1 = getParameter("e");
    e = Integer.parseInt(s1);
  }

  public void paint(Graphics g) {
    sum = a + b + c + d + e;
    perce = sum / 500 * 100;
    if (perce >= 50) {
      g.drawOval(80, 70, 150, 150);

      g.setColor(Color.BLACK);
      g.fillOval(120, 120, 15, 15);
      g.fillOval(170, 120, 15, 15);

      g.drawArc(130, 180, 50, 20, 180, 180);
    } else {
      g.drawOval(80, 70, 150, 150);
      g.setColor(Color.BLACK);
      g.fillOval(120, 120, 15, 15);
      g.fillOval(170, 120, 15, 15);

      g.drawArc(130, 180, 50, 20, 180, -180);
    }

    g.drawString("Mark in Maths out of 100   " + a, 10, 300);
    g.drawString("Mark in English out of 100   " + b, 10, 350);
    g.drawString("Mark in Chemistry out of 100   " + c, 10, 400);
    g.drawString("Mark in Physics out of 100   " + d, 10, 450);
    g.drawString("Mark in Biology out of 100   " + e, 10, 500);
    g.drawString("Percentage " + perce, 10, 550);

  }
}