// Demonstrate an adapter.
import java.awt.*;
import java.awt.event.*;

public class AdapterDemo extends Frame {
	String msg=""; int mouseX=100,mouseY=100;
 public AdapterDemo() {
	//msg="hi"; mouseX=100;mouseY=100;
 addMouseListener(new MyMouseAdapter(this));
 addMouseMotionListener(new MyMouseMotionAdapter(this));
 addWindowListener(new MyWindowAdapter());

 }
 public void paint(Graphics g) {
 g.drawString(msg, mouseX, mouseY);
 }

  public static void main(String ar[])
 {
	 AdapterDemo awin=new AdapterDemo();
	 awin.setSize(new Dimension(300,300));
	 awin.setTitle("AdapterDemo");
	 awin.setVisible(true);
 }
}

class MyMouseAdapter extends MouseAdapter {
 AdapterDemo adapterDemo1;
 public MyMouseAdapter(AdapterDemo adapterDemo) {
 this.adapterDemo1 = adapterDemo;
 }
 
 // Handle mouse clicked.
 public void mouseClicked(MouseEvent me) {
 adapterDemo1.msg="Mouse clicked"; 
 adapterDemo1.mouseX=100;
 adapterDemo1.mouseY=100;
 adapterDemo1.repaint();
 }
 public void mouseEntered(MouseEvent me) {
 // save coordinates
 adapterDemo1.mouseX = 100;
 adapterDemo1.mouseY = 100;
 adapterDemo1.msg = "Mouse entered.";
 adapterDemo1.repaint();
 }
}
class MyMouseMotionAdapter extends MouseMotionAdapter {
 AdapterDemo adapterDemo1; 

 public MyMouseMotionAdapter(AdapterDemo adapterDemo) {
 this.adapterDemo1 = adapterDemo;
 }
 // Handle mouse dragged.
 public void mouseDragged(MouseEvent me) {
 adapterDemo1.msg="Mouse dragged";
 adapterDemo1.mouseX = 100;
 adapterDemo1.mouseY = 100;
 adapterDemo1.repaint();
 }
 public void mouseMoved(MouseEvent me) {
 // show status
 adapterDemo1.mouseX = 100;
 adapterDemo1.mouseY = 100;
 adapterDemo1.msg ="Moving mouse at " + me.getX() + ", " + me.getY();
 adapterDemo1.repaint();
 }
}
 // Display msg in applet window at current X,Y location.
 
 
class MyWindowAdapter extends WindowAdapter {
public void windowClosing(WindowEvent we) {
 System.exit(0);
}}