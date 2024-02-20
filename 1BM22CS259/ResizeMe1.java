import java.awt.*;
import java.awt.event.*;

public class ResizeMe1 extends Frame {
 final int inc = 100;
 int max = 700;
 int min = 250;
 static String msg="";
 Dimension d;

 public ResizeMe1() {
 addMouseListener(new MouseAdapter() {
 public void mouseReleased(MouseEvent me) {
 int w = (d.width + inc) > max?min :(d.width + inc);
 int h = (d.height + inc) > max?min :(d.height + inc);
 setSize(new Dimension(w, h));
 }
 });
 addWindowListener(new MyWindowAdapter());
 }
 public void paint(Graphics g) {
 Insets i = getInsets();
 d=getSize();
 g.drawLine(i.left, i.top, d.width-i.right, d.height-i.bottom);
 g.drawLine(i.left, d.height-i.bottom, d.width-i.right, i.top);
 /*Color c1 = new Color(255, 0, 0);
 g.setColor(c1);*/
 g.drawRect(i.left, i.top, d.width-i.right-10, d.height-i.bottom-30);
 g.drawString(msg,100,20);
 }
public static void main(String ar[])
 {   msg="In main method";
	 ResizeMe1 awin=new ResizeMe1();
	 awin.setSize(new Dimension(250,250));
	 awin.setTitle("Resize Demo");
	 awin.setVisible(true);
}
 }
 
class MyWindowAdapter extends WindowAdapter {
public void windowClosing(WindowEvent we) {
 System.exit(0);
}}