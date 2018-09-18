import javax.swing.JOptionPane;
import java.awt.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import javax.swing.JComponent;
import java.awt.*;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JComponent;
import java.awt.Font;
import java.io.*;
import java.util.ArrayList;
import java.io.FileReader ;
import java.io.FileNotFoundException ;
import java.io.PrintWriter ;
import java.util.Scanner ;


//Creates 8 PeriodButtons 
public class DisplayPanelDay extends JPanel  {
	
	private Period me1,me2,me3,me4,me5,me6,me7,me8;
	private PeriodButton b1, b2, b3, b4, b5, b6, b7, b8;
	private String username, password, monthName;

	private int day, month, year;
		
		public DisplayPanelDay(int day, int month, int year, String username, String password)
		{
			
			
			Dimension d= new Dimension(500,720);
			setSize(d);
			
			Font myfont= new Font("Helvetica CE 35 Thin",Font.PLAIN,16);
			GridLayout g= new GridLayout(0,1,0,0);
			setLayout(g);
			
			
			me1 = new Period(1, "");
			PeriodButton b1= new PeriodButton("1", Color.LIGHT_GRAY,Color.WHITE,getWidth(),getHeight(),10,10, me1, day,month,year,username,password);
			b1.setFont(myfont);
		 	add (b1);
		 	
		 	me2 = new Period(2, "");
			PeriodButton b2= new PeriodButton("1", Color.LIGHT_GRAY,Color.WHITE,getWidth(),getHeight(),10,10, me2, day,month,year,username,password);
			b2.setFont(myfont);
		 	add (b2);
		 	
		 	me3 = new Period(3, "");
			PeriodButton b3= new PeriodButton("1", Color.LIGHT_GRAY,Color.WHITE,getWidth(),getHeight(),10,10, me3, day,month,year,username,password);
			b3.setFont(myfont);
		 	add (b3);
		 	
		 	me4 = new Period(4, "");
			PeriodButton b4= new PeriodButton("1", Color.LIGHT_GRAY,Color.WHITE,getWidth(),getHeight(),10,10, me4, day,month,year,username,password);
			b4.setFont(myfont);
		 	add (b4);
		 	
		 	me5 = new Period(5, "");
			PeriodButton b5= new PeriodButton("1", Color.LIGHT_GRAY,Color.WHITE,getWidth(),getHeight(),10,10, me5, day,month,year,username,password);
			b5.setFont(myfont);
		 	add (b5);
		 	
		 	me6 = new Period(6, "");
			PeriodButton b6= new PeriodButton("1", Color.LIGHT_GRAY,Color.WHITE,getWidth(),getHeight(),10,10, me6, day,month,year,username,password);
			b6.setFont(myfont);
		 	add (b6);
		 	
		 	me7 = new Period(7, "");
			PeriodButton b7= new PeriodButton("1", Color.LIGHT_GRAY,Color.WHITE,getWidth(),getHeight(),10,10, me7, day,month,year,username,password);
			b7.setFont(myfont);
		 	add (b7);
		 	
		 	me8 = new Period(8, "");
			PeriodButton b8= new PeriodButton("1", Color.LIGHT_GRAY,Color.WHITE,getWidth(),getHeight(),10,10, me8, day,month,year,username,password);
			b8.setFont(myfont);
			add (b8);
			
			ArrayList<PeriodButton> periods=new ArrayList<PeriodButton>();
			periods.add(b1);
			periods.add(b2);
			periods.add(b3);
			periods.add(b4);
			periods.add(b5);
			periods.add(b6);
			periods.add(b7);
			periods.add(b8);
			
			
			//searches for if each PeriodButton has a file and if so, displays the username within the file and sets background to red
			for(int i=0;i<8;i++){
			
			PeriodButton use= periods.get(i);
			Period per= use.getPeriod();
			String number= Integer.toString(per.getPeriod());
			try{
			FileSearcher search= new FileSearcher(use);
			search.reader();
			use.setBackground(Color.RED);
			}
			
			catch(FileNotFoundException e){
				
				use.setText(number);
			}
			
					
		     
			}
		 	

	}
	
	
	
			
	
	

}
