import javax.swing.JOptionPane;
import java.awt.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.io.*;
import javax.imageio.*;



public class DisplayDay extends JPanel  {
	
	public static void main(String[] args){
		
		
//		Period me = new Period(1, "MISHAEL OOMMEN JACOB");
		
		JFrame frame = new JFrame("Day");
		
		
		
		
		frame.add(new DisplayPanelDay());
		
//		b1.addActionListener(new ButtonListener());
//		frame.add (b1);
		
		frame.setResizable(true);
		frame.pack();
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	
		}
	
	
	
