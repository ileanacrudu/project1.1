
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.*;
import java.awt.Image;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JPanel;
import javax.swing.JComponent;
class Tothebitterend{
	public static void main (String[] args){    
		JFrame frame = new JFrame(); // Create a new frame
		frame.setVisible(true); // Makes it visible     
		frame.setSize(1200, 800); // Sets size         
		frame.setTitle(""); // Sets title
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		

		
		JPanel game_panel = new JPanel(new BorderLayout(1,2)); // Creates new JPanel
		
		
		//graph_panel.setBackground(Color.decode("#2ecc71")); // Sets color
		//graph_panel.setSize(400,800);

		//game_panel.setBackground(Color.decode("#3498db")); // Sets color
		game_panel.setSize(1200,800);
		game_panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CircleComponent2 Component = new CircleComponent2();
		game_panel.add(Component);
		game_panel.setVisible(true);

		JPanel btnPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));

		
		

		game_panel.setLayout(new BorderLayout());
		game_panel.add(new JButton("Next graph"), BorderLayout.WEST);
		game_panel.add(new JButton("Hint"),BorderLayout.EAST);
		game_panel.setVisible(true);
		// Add labels on panel
		frame.add(game_panel);

		
		frame.add(btnPnl);
		//graph_panel.add();
		



}
}