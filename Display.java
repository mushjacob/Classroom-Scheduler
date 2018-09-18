import javax.swing.JOptionPane;
import java.awt.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.*;


public class Display extends JPanel  {
	
	public static void main(String[] args){
		
		
//		Period me = new Period(1, "MISHAEL OOMMEN JACOB");
		JFrame frame = new JFrame("Period");
		
		//JButton b1= new JButton(me.getPeriod()+": "+ me.getName());
		
		frame.add(new DisplayPanel());
		
		
//		b1.addActionListener(new ButtonListener());
//		frame.add (b1);
		
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	
		}
	
	
	
