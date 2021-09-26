//Develop a program to handle Key events

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="key" width=400 height=400>
</applet>
*/

public class key extends Applet implements KeyListener{
String msg="key";
int x=10,y=20;
public void init(){
addKeyListener(this);
setBackground(Color.yellow);
setForeground(Color.red);
}

public void keyPressed(KeyEvent ke){
showStatus("key Down");
}
public void keyReleased(KeyEvent ke){
showStatus("key up");
}
public void keyTyped(KeyEvent ke){
msg+=ke.getKeyChar();
repaint();
}
public void paint(Graphics g){
g.drawString(msg,x,y);
}
}


