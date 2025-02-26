package thinh_java;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.JFrame;


public class GameFrame extends JFrame{
	GamePanel panal;
	GameFrame(){
		panal = new GamePanel();
		this.add(panal);
		this.setTitle("Pong Game");
		this.setResizable(false);
		this.setBackground(Color.black);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
	
}
