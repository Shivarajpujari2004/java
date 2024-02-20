// Demonstrate text field.
import java.awt.*;
import java.awt.event.*;

public class TextFieldDemo extends Frame
 implements ActionListener {
 TextField name, pass;
 public TextFieldDemo() {
setLayout(new FlowLayout());
 Label namep = new Label("Name: ", Label.RIGHT);
 Label passp = new Label("Password: ", Label.RIGHT);
 name = new TextField(12);
 pass = new TextField(8);
 pass.setEchoChar('?');
 add(namep);
 add(name);
 add(passp);
 add(pass);
 // register to receive action events
 name.addActionListener(this);
 pass.addActionListener(this);
 addWindowListener(new MyWindowAdapter());
 }
 // User pressed Enter.
 public void actionPerformed(ActionEvent ae) {
 repaint();
 }
 public void paint(Graphics g) {
 g.drawString("Name: " + name.getText(), 100, 200);
 g.drawString("Selected text in name: "
 + name.getSelectedText(), 100, 220);
 g.drawString("Password: " + pass.getText(), 100, 240);
 }
 public static void main(String ar[])
 {
	 TextFieldDemo awin=new TextFieldDemo();
	 awin.setSize(new Dimension(700,700));
	 awin.setTitle("TF_Label Demo");
	 awin.setVisible(true);
 } 
}

class MyWindowAdapter extends WindowAdapter {
public void windowClosing(WindowEvent we) {
 System.exit(0);
}}