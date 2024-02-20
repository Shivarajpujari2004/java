import java.awt.event.*;
import java.awt.*;


class SampleDialog extends Dialog implements ActionListener {
	ButtonListD bld;
  SampleDialog(Frame parent, String title) {
 /*String msg=title;
 title="Dialog window";*/
 //modal(child dominates parent(true) / modalless (both the windows can be accessed)false)
 super(parent, title, false); 
  bld=(ButtonListD)parent;
 setLayout(new FlowLayout());
 setSize(300, 200);
 add(new Label(bld.msg));
 Button b;
 add(b = new Button("OK"));
 b.addActionListener(this);
 }
  public void actionPerformed(ActionEvent ae) {
 dispose();
 }
 /*
 public void paint(Graphics g) {
 g.drawString(bld.msg, 10, 70);
 }
 */
}

public class ButtonListD extends Frame implements ActionListener {
 String msg = "";
 Button bList[]=new Button[3];
 public ButtonListD() {
 setLayout(new FlowLayout());
 Button yes = new Button("Yes");
 Button no = new Button("No");
 Button maybe = new Button("Undecided");
 
 
 //Syntax- Component add(Component compRef)

 bList[0]=(Button) add(yes);
 bList[1]=(Button) add(no);
 bList[2]=(Button)add(maybe);
 for(int i=0;i<3;i++)
 {
 bList[i].addActionListener(this);
 }
 
 addWindowListener(new MyWindowAdapter());
 
 }
 
 
 
 public void actionPerformed(ActionEvent ae) {
 for(int i=0;i<3;i++){
 if(ae.getSource()==bList[i])
	 {
 msg = "You pressed "+bList[i].getLabel();
 }
 }
  //repaint();
  SampleDialog d = new
 SampleDialog(this, "Dialog");
  d.setVisible(true);
 }
 
 /*
 public void paint(Graphics g) {
 g.drawString(msg, 20, 100);
 }
 */
 public static void main(String ar[])
 {
	 ButtonListD aa=new ButtonListD();
	 aa.setSize(new Dimension(230,150));
	 aa.setTitle("ButtonListD");
	 aa.setVisible(true);
 } 
}
 
 
 

class MyWindowAdapter extends WindowAdapter {
public void windowClosing(WindowEvent we) {
 System.exit(0);
}}
