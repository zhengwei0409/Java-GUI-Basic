package JavaGUI;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
        
    MyFrame() {
        this.setTitle("GTA 6"); // sets title of this
        this.setSize(420,420); // set the x-dimension and y-dimension of frame
        this.setVisible(true); // make frame visible
        this.setResizable(false); // prevent frame from being resized

        // this work only for windows not mac
        ImageIcon image1 = new ImageIcon("gta6.png"); // create an imageIcon
        this.setIconImage(image1.getImage()); // set the  application icon

        // set the bacground color of the frame
        this.getContentPane().setBackground(new Color(0,0,0)); 

        /*  
        Specify when the frame is closed , stop running the program
        DO_NOTHING_ON_CLOSE - the frame will not close
        HIDE_ON_CLOSE - default 
        */ 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    }
}
