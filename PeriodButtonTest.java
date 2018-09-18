import javax.swing.JOptionPane;
import java.awt.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.io.*;
import javax.imageio.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.border.Border;

public class PeriodButtonTest {
	
	public static void main(String[] args){
	
	
	JFrame frame = new JFrame ("Layout Manager Demo");
      frame.setBounds(0,0,1920,1080);
      
      Period m= new Period(1, "");
      PeriodButton n1= new PeriodButton("1", Color.LIGHT_GRAY,Color.WHITE,frame.getWidth(),frame.getHeight(),10,10, m, 10,3,1999);
      
      frame.add(n1);
      
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setVisible(true);
	}
}
