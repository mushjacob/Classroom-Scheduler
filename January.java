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


//Creates a January class with reference point of 2015 and increments months and dates by current year
public class January extends JPanel {
	
	private int year;
	private String username, password;
	
	//requires current year, username, and password
	public January(int year, String username, String password){
		
		this.year=year;
		this.username=username;
		this.password=password;
		
		 
		final int num=31;
		final int useyear=2015;
		final int firstday=5;
		
		
		
		Container container = new Container();
		
		Dimension size= new Dimension(1566,850);
		container.setPreferredSize(size);
		GridLayout g= new GridLayout(7,7,1,1);
		container.setLayout(g);
		ArrayList<MonthButton> array= new ArrayList<MonthButton>();
		int currentYear= Calendar.getInstance().get(Calendar.YEAR);
		container.setBackground(Color.GRAY);
		Font myfont2= new Font("Lucida Console",Font.PLAIN,27);
		Color b= new Color(16,78,139);
		
		
		//Labels for day of week
		JLabel sun= new JLabel("     SUNDAY");
		sun.setForeground(b);
		sun.setFont(myfont2);
		container.add(sun);
		
		JLabel mon= new JLabel("     MONDAY");
		mon.setForeground(b);
		mon.setFont(myfont2);
		container.add(mon);
		
		JLabel tues= new JLabel("    TUESDAY");
		tues.setForeground(b);
		tues.setFont(myfont2);
		container.add(tues);
		
		JLabel wed= new JLabel("    WEDNESDAY");
		wed.setForeground(b);
		wed.setFont(myfont2);
		container.add(wed);
		
		JLabel thurs= new JLabel("    THURSDAY");
		thurs.setForeground(b);
		thurs.setFont(myfont2);
		container.add(thurs);
		
		JLabel fri= new JLabel("     FRIDAY");
		fri.setForeground(b);
		fri.setFont(myfont2);
		container.add(fri);
		
		JLabel sat= new JLabel("     SATURDAY");
		sat.setForeground(b);
		sat.setFont(myfont2);
		container.add(sat);
		
		
		//MonthButtons that are set blank and fill rest of screen in gridlayout
		MonthButton n1= new MonthButton("", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,1,1,0,1,year,username,password);
		MonthButton n2= new MonthButton("", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,1,2,0,1,year,username,password);
		MonthButton n3= new MonthButton("", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,1,3,0,1,year,username,password);
		MonthButton n4= new MonthButton("", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,1,4,0,1,year,username,password);
		MonthButton n5= new MonthButton("", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,1,5,0,1,year,username,password);
		MonthButton n6= new MonthButton("", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,1,6,0,1,year,username,password);
		MonthButton n7= new MonthButton("", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,1,7,0,1,year,username,password);
		MonthButton n8= new MonthButton("", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,2,1,0,1,year,username,password);
		MonthButton n9= new MonthButton("", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,2,2,0,1,year,username,password);
		MonthButton n10= new MonthButton("", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,2,3,0,1,year,username,password);
		MonthButton n11= new MonthButton("", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,2,4,0,1,year,username,password);
		MonthButton n12= new MonthButton("", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,2,5,0,1,year,username,password);
		MonthButton n13= new MonthButton("", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,2,6,0,1,year,username,password);
		MonthButton n14= new MonthButton("", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,2,7,0,1,year,username,password);
		MonthButton n15= new MonthButton("", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,3,1,0,1,year,username,password);
		MonthButton n16= new MonthButton("", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,3,2,0,1,year,username,password);
		MonthButton n17= new MonthButton("", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,3,3,0,1,year,username,password);
		MonthButton n18= new MonthButton("", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,3,4,0,1,year,username,password);
		MonthButton n19= new MonthButton("", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,3,5,0,1,year,username,password);
		MonthButton n20= new MonthButton("", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,3,6,0,1,year,username,password);
		MonthButton n21= new MonthButton("", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,3,7,0,1,year,username,password);
		MonthButton n22= new MonthButton("", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,4,1,0,1,year,username,password);
		MonthButton n23= new MonthButton("", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,4,2,0,1,year,username,password);
		MonthButton n24= new MonthButton("", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,4,3,0,1,year,username,password);
		MonthButton n25= new MonthButton("", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,4,4,0,1,year,username,password);
		MonthButton n26= new MonthButton("", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,4,5,0,1,year,username,password);
		MonthButton n27= new MonthButton("", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,4,6,0,1,year,username,password);
		MonthButton n28= new MonthButton("", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,4,7,0,1,year,username,password);
		MonthButton n29= new MonthButton("", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,5,1,0,1,year,username,password);
		MonthButton n30= new MonthButton("", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,5,2,0,1,year,username,password);
		MonthButton n31= new MonthButton("", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,5,3,0,1,year,username,password);
		MonthButton n32= new MonthButton("", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,5,4,0,1,year,username,password);
		MonthButton n33= new MonthButton("", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,5,5,0,1,year,username,password);
		MonthButton n34= new MonthButton("", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,5,6,0,1,year,username,password);
		MonthButton n35= new MonthButton("", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,5,7,0,1,year,username,password);
		MonthButton n36= new MonthButton("", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,6,1,0,1,year,username,password);
		MonthButton n37= new MonthButton("", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,6,2,0,1,year,username,password);
		MonthButton n38= new MonthButton("", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,6,3,0,1,year,username,password);
		MonthButton n39= new MonthButton("", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,6,4,0,1,year,username,password);
		MonthButton n40= new MonthButton("", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,6,5,0,1,year,username,password);
		MonthButton n41= new MonthButton("", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,6,6,0,1,year,username,password);
		MonthButton n42= new MonthButton("", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,6,7,0,1,year,username,password);
		
		
		
		
		
		array.add(n1);
		array.add(n2);
		array.add(n3);
		array.add(n4);
		array.add(n5);
		array.add(n6);
		array.add(n7);
		array.add(n8);
		array.add(n9);
		array.add(n10);
		array.add(n11);
		array.add(n12);
		array.add(n13);
		array.add(n14);
		array.add(n15);
		array.add(n16);
		array.add(n17);
		array.add(n18);
		array.add(n19);
		array.add(n20);
		array.add(n21);
		array.add(n22);
		array.add(n23);
		array.add(n24);
		array.add(n25);
		array.add(n26);
		array.add(n27);
		array.add(n28);
		array.add(n29);
		array.add(n30);
		array.add(n31);
		array.add(n32);
		array.add(n33);
		array.add(n34);
		array.add(n35);
		array.add(n36);
		array.add(n37);
		array.add(n38);
		array.add(n39);
		array.add(n40);
		array.add(n41);
		array.add(n42);
		
		
		
		int start=currentYear-useyear;
		int extrayears=0;
		//every year months shift one day, every year after a leap year january shifts an extra day
		for (int i=useyear;i<=currentYear;i++){
			if((i-1)%4==0)
				extrayears++;
		}
		int fixdays= firstday+start+extrayears;
		if(fixdays>7){
			int s= fixdays/7;
			fixdays=fixdays-(s*7);
		}
		
		for(int j=fixdays,k=1; k<=num; j++,k++)
			{
			
				String number= Integer.toString(k);
				MonthButton m=array.get(j-1);
				m.setText(number);
				m.setDay(k);
			}
		
		
		Font myfont= new Font("Helvetica CE 35 Thin",Font.PLAIN,72);
		
		for(int i=0; i<42;i++){
			array.get(i).setFont(myfont);
		}
		
		for(int i=0; i<42;i++){
			container.add(array.get(i));
		}
		
		Color today= new Color(79,148,205);
		
		if(Calendar.getInstance().get(Calendar.MONTH)+1==1){
		
		int day=Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
		int month=Calendar.getInstance().get(Calendar.MONTH)+1;
		int years=Calendar.getInstance().get(Calendar.YEAR);
		String days=Integer.toString(day);
		String monthss=Integer.toString(month);
		String yearss=Integer.toString(year);
		String theDate=days+monthss+yearss;
		for(int i=0;i<42;i++){
			if(array.get(i).getTheDate().equals(theDate))
				array.get(i).setColor(Color.WHITE,today);
		}
		}
		
		
		add(container);
		
		
		
		
		
		container.setVisible(true);
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	}
	
	
}
