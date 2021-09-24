import java.awt.*;
import java.applet.*;
/*
<applet code="Maximum3" width=500 height=500>
<param name="a" value="10">
<param name="b" value="20">
<param name="c" value="30">
</applet>
*/
public class Maximum3 extends Applet {
  int a;
  int b;
  int c;
  int d;
  String str;

  public void start() {
    String s1;

    s1 = getParameter("a");
    a = Integer.parseInt(s1);

    s1 = getParameter("b");
    b = Integer.parseInt(s1);

    s1 = getParameter("c");
    c = Integer.parseInt(s1);
  }

  public void paint(Graphics g) {
    if (a > b) {
      if (a > c) {
        d = a;
      } else {
        d = c;
      }
    } else {
      if (b > c) {
        d = b;
      } else {
        d = c;
      }

    }

    g.drawString("a is   " + a, 10, 50);
    g.drawString("b is   " + b, 10, 100);
    g.drawString("c is   " + c, 10, 150);
    g.drawString("max of three numbers is " + d, 10, 200);
  }
}