import javax.swing.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.*;
import javax.swing.JPanel;
import javax.swing.JComponent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.util.Scanner;





public class CircleComponent2 extends JComponent {
	public void paintComponent(Graphics g) {
		Scanner in = new Scanner(System.in);
		System.out.println("How many nodes do you want to display?");
		int nrNodes = in.nextInt();
		double width = 2000/(nrNodes*1.7);
		double height = 2000/(nrNodes*1.7);  //Width and height relative to nrNodes
		Graphics2D g2 = (Graphics2D) g;		
		double x,x1;
		double y,y1;
		double Pi = Math.PI;
		for (double k=0; k<nrNodes*Pi; k=k+Pi) {			
		x = Math.sin(Math.toRadians(2 * k * Math.PI));		//Sine formula of X coordinate of node
		y = Math.cos(Math.toRadians(2 * k * Math.PI));		//Cosine formula of Y coordinate of node
		x1 = 500 + 375*x;									// X1 = Center of circle + radius times x
		y1 = 500 + 375*y;									// Y1 = Center of circle + radius times x
		System.out.println(x1 + "  " + y1);					// Prints out coordinates for reference
		Ellipse2D.Double circle2 = new Ellipse2D.Double(x1,y1,width,height); //Creates a new circle by the coordinates along the circle, with size relative to nrNodes
		g2.draw(circle2); // Prints the circle
		//Line2D.Double line = new Line2D.Double(500,500,x1,y1);
		//g2.draw(line);
		}

		
	}
	
}