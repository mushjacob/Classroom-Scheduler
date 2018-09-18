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
import java.awt.event.WindowEvent;

//MonthButton Class used for creating design of each day in a Month Class

public class MonthButton extends JButton implements ActionListener {
	private int wait;
	private String buttonText="";
	private Color backC, frontC;
	private int bX, bY, bWidth, bHeight, xGrid, yGrid, day, month, year, meh;
	private String username, password;
	
	MonthButton(int x, int y, int width, int height){
		this.bX=x;
		this.bY=y;
		this.bWidth=width;
		this.bHeight=height;
		this.setBounds(bX,bY,bWidth,bHeight);
		this.setActionListener();
		
	}
	
	MonthButton(String buttonTextI, int width, int height, int x, int y){
		this.buttonText= buttonTextI;
		this.setText(buttonText);
		this.bX = x;
		this.bY= y;
		this.bWidth=width;
		this.bHeight=height;
		this.setBounds(bX, bY, bWidth, bHeight);
		this.setActionListener(); 
	}
	
	
	MonthButton(String buttonTextI,  Color foregroundColor, Color backgroundColor, int width, int height, int x, int y, int xGrid, int yGrid, int day, int month, int year, String username, String password){
		this.buttonText = buttonTextI;
		this.setText(buttonText);
		this.backC= backgroundColor;
		this.frontC= foregroundColor;
		this.setColor(frontC, backC);
		this.bX=x;
		this.bY=y;
		this.bWidth=width;
		this.bHeight=height;
		this.setBounds(bX, bY, bWidth, bHeight);
		this.setActionListener();
		this.xGrid=xGrid;
		this.yGrid=yGrid;
		this.day=day;
		this.month=month;
		this.year=year;
		this.username=username;
		this.password=password;
		meh=0;
	}
	
	private void setActionListener() {
		this.addActionListener(this);
	}
	
	
	//displays text entered in parameter
	public void setText(String text) {
		super.setText(text);
		this.buttonText=text;
		Font myfont= new Font("basic title font",Font.PLAIN,72);
		this.setFont(myfont);
	}
	
	//sets the day
	public void setDay(int d){
		day=d;
	}
	//returns the date with day, month, and year integers with no spaces
	public String getTheDate(){
		String d=Integer.toString(day);
		String m=Integer.toString(month);
		String y=Integer.toString(year);
		return d+m+y;
	}
	
	
	//sets restrictions of button
	public void setBounds(int x, int y, int width, int height){
		super.setBounds(x, y, width, height);
		this.bX=x;
		this.bY=y;
		this.bWidth=width;
		this.bHeight=height;
	}
	//sets foreground and background of color
	public void setColor(Color foreground, Color background){
		this.setBackground(background);
		this.setForeground(foreground);
		this.backC=background;
		this.frontC= foreground;
	}
	//sets border of MonthButton
	public void setBorder(Border tobeSet){
		super.setBorder(tobeSet);
	}
	
	//returns location x and y of MonthButton
	public String getPlace(){
		String x= Integer.toString(xGrid);
		String y= Integer.toString(yGrid);
		return "("+ x +", " + y +")";
	}
	
	
	
	
	//Method for when each MonthButton is clicked, if clicked creates and displays new JFrame and adds the DisplayPanelDay class
	@Override
		public void actionPerformed(ActionEvent event){
			
			
			
			String[] months= new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
			
			
			
			if(!buttonText.equals("")){
			
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			JFrame frame = new JFrame("");
			Dimension d= new Dimension(screenSize.width/7,screenSize.height/3);
			frame.setPreferredSize(d);
			frame.setTitle(months[month-1]+" "+day+", "+year);
			
			frame.setLocation(screenSize.width/2-this.getSize().width/2, screenSize.height/2-this.getSize().height/2);
			
		
	
		
		
		frame.add(new DisplayPanelDay(day,month,year, username, password));
		
//		b1.addActionListener(new ButtonListener());
//		frame.add (b1);

		
		
		
		
		
		
		
		
		
		
		frame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		frame.setResizable(true);
		frame.pack();
		
		frame.setVisible(true);
		
		
			}
			
			
			
			
			
		}
		
		
}
