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


 public class TestDocument {
 	public static void main(String[] args){
 		
 	
 	Dimension d= new Dimension(1600,900);
 	
 	JFrame frame= new JFrame();
 	frame.setPreferredSize(d);
 	frame.setLayout(new FlowLayout());
	
	Period p= new Period(5,"Period");
	p.getName();
	//expected Period
	p.getPeriod();
	//expected 5
	p.enterName("Zeph");
	p.getName();
	//expected Zeph
	
	
	PeriodButton b1= new PeriodButton("Zeph", Color.LIGHT_GRAY,Color.WHITE,10,10,10,10, p, 03,03,1999,"1","3");
	PeriodButton b2= new PeriodButton("1", Color.LIGHT_GRAY,Color.WHITE,10,10,10,10, p, 03,03,1999,"1","3");
	frame.add(b1);
	b2.setText("Mishael");
	//expected b1 to display 1 and b2 to display green button and "Mishael";
	
	b2.setColor(Color.WHITE,Color.GREEN);
	frame.add(b2);
	
	System.out.println(b1.getDate());
	
	JFrame two= new JFrame();
	January j= new January(2016,"Mishael", "Jacob");
	February f= new February(2016, "Mishael", "Jacob");
	NormalMonths m= new NormalMonths("March", 31, 1, 3, 2016,"Mishael","Jacob");
	JTabbedPane tp = new JTabbedPane();
	tp.addTab("January",j);
	tp.addTab("February",f);
	tp.addTab("March",m);
	two.add(tp);
	
	frame.pack();
			      
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	two.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	two.pack();
	two.setVisible(true);
			      
			      
	
	//check if months line up with microsoft's calendar and if you're able to click and open new period window and click and Mishael should be displayed then enter Jacob and original period number should display
	//when clicking on empty period and "Mishael" is shown go to drive "G:\\BADASS Calendar\\Dates\\"+date+".txt" and you should find correct file inside that says Jacob then on new line Mishael
	
	
	
	
	
 	}
	
}
