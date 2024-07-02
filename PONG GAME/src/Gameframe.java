import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

import javax.swing.JFrame;

public class Gameframe extends JFrame {
	
	Gamepanel panel; 
	
	Gameframe() {
		panel = new Gamepanel();
		this.add(panel);
		this.setTitle("PONG GAME");
		this.setResizable(false);
		this.setBackground(Color.black);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}

}
