import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;





public class Main {

	public static void main(String[] args) {
		
	   JLabel label = new JLabel();	
	   label.setText("what the hell is this?");
	   label.setForeground(new Color(0x00FF00)); // text color
	   label.setBackground(Color.black);
	   
	   
	
       JFrame frame = new JFrame();
       
       frame.setSize(500, 500);
       frame.setVisible(true);
       frame.add(label);
	   
      
	}

}




