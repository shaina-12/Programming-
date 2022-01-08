//package awtEvents;
import java.awt.*;
import java.awt.event.*;
public class MouseEventsDemo extends Frame implements MouseListener, MouseMotionListener{
	String msg="";
	int mouseX=0,mouseY=0;
	public MouseEventsDemo() {
		addMouseListener(this);
		addMouseMotionListener(this);
		addWindowListener(new MyWindowAdapter());
	}
	public void mouseClicked(MouseEvent e) {
		msg=msg+"--Click recieved";
		repaint();
	}
    public void mouseEntered(MouseEvent e) {
		mouseX=100;
		mouseY=100;
		msg="Mouse Entered";
		repaint();
	}
	public void mouseExited(MouseEvent e) {
		mouseX=100;
		mouseY=100;
		msg="Mouse Exited.";
		repaint();
	}
    public void mousePressed(MouseEvent e) {
    	mouseX=e.getX();
		mouseY=e.getY();
		msg="Mouse Exited.";
		repaint();
	}
	public void mouseReleased(MouseEvent e) {
		mouseX=e.getX();
		mouseY=e.getY();
		msg="Button Down.";
		repaint();
	}
	public void mouseDragged(MouseEvent e) {
		mouseX=e.getX();
		mouseY=e.getY();
		msg="*"+" mouse at "+mouseX+" and "+mouseY;
		repaint();
	}
	public void mouseMoved(MouseEvent e) {
		msg="Moving mouse at "+e.getX()+" and "+e.getY();
		repaint();
	}
	public void paibt(Graphics g) {
		g.drawString(msg, mouseX, mouseY);
	}
	public static void main(String[] args) {
		MouseEventsDemo appwin = new MouseEventsDemo();
		appwin.setSize(new Dimension(300,300));
		appwin.setTitle("Mouse Event Demo");
		appwin.setVisible(true);
	}
}
class MyWindowAdapter extends WindowAdapter{
	public void windowClosing(WindowEvent we){
		System.exit(0);
	}
}
