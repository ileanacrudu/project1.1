
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


public class Buttons {

public static void main (String[] args){    
  JFrame frame = new JFrame("Graph coloring game");
  //frame.getContentPane().add(new JPanelWithBackground("background.jpg"));

  frame.setVisible(true);
  frame.setSize(1200,800);
  //frame.setBackground(Color.GRAY);


  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



  JPanel panel = new JPanel(new GridBagLayout());
  frame.add(panel);
//image background
  
  
  panel.setBackground(new Color(0,120,66,64));
  JPanel menu = new JPanel();
  menu.setBackground(new Color(0,0,0,65));
  menu.setSize(140, 300); 
  menu.setVisible(true);
  

  //first game
  JButton button = new JButton("To the bitter end");
  JButton button2 = new JButton("Best upper bound in a fixed time frame");
  JButton button3 = new JButton("Random order");
  

  GridBagConstraints c = new GridBagConstraints();

  c.insets = new Insets(10,10,10,10);
  c.gridx = 0;
  c.gridy = 1;




  panel.add(button,c);
  button.addActionListener (new Action1());

  //second game
  c.gridx = 0;
  c.gridy = 2;
  
  panel.add(button2,c);
  button.addActionListener (new Action2()); 

  c.gridx = 0;
  c.gridy = 3;
  //3rd game
  
  panel.add(button3,c);
  button.addActionListener (new Action3()); 

  c.gridx = 0;
  c.gridy = 4;

 

}
//first game window
static class Action1 implements ActionListener {        
  public void actionPerformed (ActionEvent game1) {     
      

    JFrame frame1 = new JFrame(); // Create a new frame
    frame1.setVisible(true); // Makes it visible     
    frame1.setSize(1200, 800); // Sets size         
    frame1.setTitle(""); // Sets title
    frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame1.setLocationRelativeTo(null);
    

    
    JPanel game_panel = new JPanel(new BorderLayout(1,2)); // Creates new JPanel
    
    
    //graph_panel.setBackground(Color.decode("#2ecc71")); // Sets color
    //graph_panel.setSize(400,800);

    game_panel.setBackground(Color.decode("#3498db")); // Sets color
    game_panel.setSize(1200,800);

    JPanel btnPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));

    
    

    game_panel.setLayout(new BorderLayout());
    game_panel.add(new JButton("Next graph"), BorderLayout.WEST);
    game_panel.add(new JButton("Hint"),BorderLayout.EAST);
    game_panel.setVisible(true);
    // Add labels on panel
    frame1.add(game_panel);

    
    frame1.add(btnPnl);
    //graph_panel.add();
    

   
  }
}  
//2nd game window 
static class Action2 implements ActionListener {        
  public void actionPerformed (ActionEvent game2) {     
    JFrame frame3 = new JFrame("Start game");
    frame3.setVisible(true);
    frame3.setSize(1200,800);

    JLabel label = new JLabel("Lets play");
    JPanel panel = new JPanel();
    frame3.add(panel);
    panel.add(label);
  }
}  
//3rd game window 
static class Action3 implements ActionListener {        
  public void actionPerformed (ActionEvent game3) {     
    JFrame frame4 = new JFrame("Start game");
    frame4.setVisible(true);
    frame4.setSize(1200,800);

    JLabel label = new JLabel("Lets play");
    JPanel panel = new JPanel();
    frame4.add(panel);
    panel.add(label);
  }
} 

//high scores
static class Action5 implements ActionListener {        
  public void actionPerformed (ActionEvent score) {     
    JFrame frame6 = new JFrame("High scores");
    frame6.setVisible(true);
    frame6.setSize(1200,800);

    JLabel label = new JLabel("1....");
    JPanel panel = new JPanel();
    frame6.add(panel);
    panel.add(label);
  }
}   


}