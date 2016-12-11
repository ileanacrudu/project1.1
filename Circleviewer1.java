import javax.swing.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JPanel;
import javax.swing.JComponent;





public class Circleviewer1 {
	public static void main(String[] args) {
	JFrame frame = new JFrame();
	final int FRAME_WIDTH = 1200;
	final int FRAME_HEIGHT = 8000;
	frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
	frame.setTitle("Boemgekke scherm");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	CircleComponent2 Component = new CircleComponent2();
	frame.add(Component);
	frame.setVisible(true);
	
	}
	
}

