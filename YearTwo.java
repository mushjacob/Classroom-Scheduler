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
import java.awt.Container;
import java.awt.TextArea;
import javax.swing.JComponent;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Calendar;
import java.awt.Dimension;

public class YearTwo {
	
	public static void main(String[] args){
		
			int currentYear= Calendar.getInstance().get(Calendar.YEAR);
   		JOptionPaneMultiInput m= new JOptionPaneMultiInput();
   		m.main();
	
	     JFrame frame = new JFrame ("Calendar");
      frame.setBounds(0,0,1920,1080);
      JPanel panel= new JPanel();
      panel.setBackground(Color.BLUE);
      Dimension size= new Dimension(1920,1080);
      panel.setPreferredSize(size);
      panel.setBackground(Color.GRAY);
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      frame.setBackground(Color.GRAY);
      
      
      January jan= new January(currentYear+1,m.getUsername(),m.getPassword());
      February feb= new February(currentYear+1,m.getUsername(),m.getPassword());
      NormalMonths march= new NormalMonths("March", 31, 1, 3, currentYear+1,m.getUsername(),m.getPassword());
      NormalMonths april= new NormalMonths("April", 30, 4, 4,currentYear+1,m.getUsername(),m.getPassword());
      NormalMonths may= new NormalMonths("May", 31, 6,5,currentYear+1,m.getUsername(),m.getPassword());
      NormalMonths june= new NormalMonths("June", 30, 2,6,currentYear+1,m.getUsername(),m.getPassword());
      NormalMonths july= new NormalMonths("July", 31, 4,7,currentYear+1,m.getUsername(),m.getPassword());
      NormalMonths august= new NormalMonths("August", 31, 7,8,currentYear,m.getUsername(),m.getPassword());
      NormalMonths september= new NormalMonths("September", 30, 3,9,currentYear,m.getUsername(),m.getPassword());
      NormalMonths october= new NormalMonths("October", 31, 5,10,currentYear,m.getUsername(),m.getPassword());
      NormalMonths november= new NormalMonths("November", 30, 1,11,currentYear,m.getUsername(),m.getPassword());
      NormalMonths december= new NormalMonths("December", 30, 3,12,currentYear,m.getUsername(),m.getPassword());
      	
      String nowYear=Integer.toString(currentYear);
      String nowYearminus=Integer.toString(currentYear-1);
      String nowYearPlus=Integer.toString(currentYear+1);
      JTabbedPane tp = new JTabbedPane();
      tp.addTab("August"+nowYear, august);
      tp.addTab("September"+nowYear, september);
      tp.addTab("October"+nowYear, october);
      tp.addTab("November"+nowYear, november);
      tp.addTab("December"+nowYear, december);
      tp.addTab ("January"+nowYearPlus, jan);
      tp.addTab ("February"+nowYearPlus, feb);
      tp.addTab ("March"+nowYearPlus, march);
      tp.addTab ("April"+nowYearPlus, april);
      tp.addTab ("May"+nowYearPlus, may);
      tp.addTab("June"+nowYearPlus, june);
      tp.addTab("July"+nowYearPlus, july);
      
      tp.setPreferredSize(size);
      tp.setBackgroundAt(1,Color.WHITE);
      tp.setBackgroundAt(2,Color.WHITE);
      tp.setBackgroundAt(3,Color.WHITE);
      tp.setBackgroundAt(4,Color.WHITE);
      tp.setBackgroundAt(5,Color.WHITE);
      tp.setBackgroundAt(6,Color.WHITE);
      tp.setBackgroundAt(7,Color.WHITE);
      tp.setBackgroundAt(8,Color.WHITE);
      tp.setBackgroundAt(9,Color.WHITE);
      tp.setBackgroundAt(10,Color.WHITE);
      tp.setBackgroundAt(11,Color.WHITE);
      tp.setBackgroundAt(0,Color.WHITE);
      panel.setOpaque(false);
      Font myfont= new Font("Helvetica CE 35 Thin",Font.PLAIN,40);
      
      int monthh=Calendar.getInstance().get(Calendar.MONTH);
      System.out.println(monthh);
      
      if (monthh>=7){
      	monthh=monthh-7;
      }
      	
      if(monthh<7){
      
      	monthh=monthh+5;
      	
      }
      System.out.println(monthh);
      
      tp.setSelectedIndex(monthh);
      
      panel.setFont(myfont);
		
      panel.add(tp);
      frame.add(panel);
      frame.pack();
      
      frame.setVisible(true);
      	
      }
}

