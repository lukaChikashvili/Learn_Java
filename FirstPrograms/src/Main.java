import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.ImageIcon;



public class Main {

	public static void main(String[] args) {
	
       JFrame frame = new JFrame();  // create a frame
       
       frame.setTitle("my first program");  // give title
       frame.setSize(400,400);  //  size - x and y
	   frame.setVisible(true);  // make frame visible
	   
	   ImageIcon image = new ImageIcon("image1_0.jpg"); // create image icon
	   frame.setIconImage(image.getImage());  // change icon to image
	   frame.getContentPane().setBackground(new Color(67, 255, 123)); // change background color
	   
	   
      
	}

}




