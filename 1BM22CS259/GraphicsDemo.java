// Draw graphics elements.
import java.awt.*;
import java.awt.event.*;

public class GraphicsDemo extends Frame {
public GraphicsDemo()
{
  addWindowListener(new MyWindowAdapter());
}
public void paint(Graphics g) {
// Draw lines.
g.drawLine(0, 0, 100, 90);
g.drawLine(0, 90, 100, 10);
g.drawLine(40, 25, 250, 80);
// Draw rectangles.- left top width height
g.drawRect(10, 150, 60, 50);
g.fillRect(100, 150, 60, 50);
/*void drawRoundRect(int left, int top, int width, int height,
int xDiam, int yDiam)- diameter of rounding arcs along x axis and y axis*/

g.drawRoundRect(190, 150, 60, 50, 15, 15);
g.fillRoundRect(280, 150, 60, 50, 30, 40);
g.drawRoundRect(365, 150, 60, 50, 90, 90);
// Draw Ellipses and Circles
g.drawOval(10, 250, 50, 50); //drawOval(int left, int top, int width, int height)
g.fillOval(90, 250, 75, 50);
g.drawOval(190, 260, 100, 40);
// Draw Arcs
/*
void drawArc(int left, int top, int width, int height, int startAngle,
int sweepAngle)
void fillArc(int left, int top, int width, int height, int startAngle,
int sweepAngle)
*/
g.drawArc(10, 350, 70, 70, 0, 180);
g.fillArc(60, 350, 70, 70, 0, 75);
g.fillArc(200, 350, 70, 70, 90,270);
// Draw a polygon
int xpoints[] = {100, 200, 100, 200, 100};
int ypoints[] = {350, 350, 550, 550, 350};
int num = 5;
g.drawPolygon(xpoints, ypoints, num);
}
public static void main(String ar[])
 {
	 GraphicsDemo aa=new GraphicsDemo();
	 aa.setSize(new Dimension(600,600));
	 aa.setTitle("Graphics methods Demonstrated");
	 aa.setVisible(true);
 } 
}
class MyWindowAdapter extends WindowAdapter {
public void windowClosing(WindowEvent we) {
 System.exit(0);
}}