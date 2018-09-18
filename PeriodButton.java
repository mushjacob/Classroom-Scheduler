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
import java.io.FileReader ;
import java.io.FileNotFoundException ;
import java.io.PrintWriter ;
import java.util.Scanner;
import java.io.*;
import java.nio.file.*;
import java.io.File;
import java.io.IOException;


//PeriodButton is a custom JButton meant to represent each period within a day
public class PeriodButton extends JButton implements ActionListener {
	
	private PrintWriter writer;
	private String buttonText="";
	private Color backC, frontC;
	private int bX, bY, bWidth, bHeight, xGrid, yGrid, day, month, year;
	private Period period;
	private String password, username;
	
	PeriodButton(int x, int y, int width, int height){
		this.bX=x;
		this.bY=y;
		this.bWidth=width;
		this.bHeight=height;
		this.setBounds(bX,bY,bWidth,bHeight);
		this.setActionListener();
		
	}
	
	PeriodButton(String buttonTextI, int width, int height, int x, int y){
		this.buttonText= buttonTextI;
		this.setText(buttonText);
		this.bX = x;
		this.bY= y;
		this.bWidth=width;
		this.bHeight=height;
		this.setBounds(bX, bY, bWidth, bHeight);
		this.setActionListener(); 
	}
	
	
	PeriodButton(String buttonTextI, Color backgroundColor, Color foregroundColor, int width, int height, int x, int y, Period period, int day, int month, int year,String username, String password){
		this.buttonText = buttonTextI;
		this.setText(period.getPeriod()+": "+period.getName());
		this.backC= backgroundColor;
		this.frontC= foregroundColor;
		this.setColor(frontC, backC);
		this.bX=x;
		this.bY=y;
		this.bWidth=width;
		this.bHeight=height;
		this.setBounds(bX, bY, bWidth, bHeight);
		this.setActionListener();
		this.period=period;
		this.day=day;
		this.month=month;
		this.year=year;
		this.password=password;
		this.username=username;
		
		
	}
	
	private void setActionListener() {
		this.addActionListener(this);
	}
	
	
	//displays and sets String in parameter
	public void setText(String text) {
		super.setText(text);
		Font myfont= new Font("Helvetica CE 35 Thin",Font.PLAIN,40);
		this.buttonText=text;
		this.setFont(myfont);
	}
	
	//sets day based on user input
	public void setDay(int d){
		day=d;
	}
	
	//sets size of PeriodButton
	public void setBounds(int x, int y, int width, int height){
		super.setBounds(x, y, width, height);
		this.bX=x;
		this.bY=y;
		this.bWidth=width;
		this.bHeight=height;
	}
	//sets the foreground and background colors of PeriodButton
	public void setColor(Color foreground, Color background){
		this.setBackground(background);
		this.setForeground(foreground);
		this.backC=background;
		this.frontC= foreground;
	}
	
	//Sets border of button
	public void setBorder(Border tobeSet){
		super.setBorder(tobeSet);
	}
	//gets location of button
	public String getPlace(){
		String x= Integer.toString(xGrid);
		String y= Integer.toString(yGrid);
		return "("+ x +", " + y +")";
	}
	
	//gets date of button with period day month and year with no spaces
	public String getDate(){
		String p=Integer.toString(period.getPeriod());
		String m= Integer.toString(month);
		String d= Integer.toString(day);
		String y= Integer.toString(year);
		return p+d+m+y;
	}
	
	//returns Period class within PeriodButton
	public Period getPeriod(){
		return period;
	}
	
	//returns password of user
	public String getPassword(){
		return password;
	}
	
	
	
	//sets PeriodButton to display name of user if empty, or if PeriodButton already has a name within then user must enter specific period's password to delete the name
	@Override
		public void actionPerformed(ActionEvent event)  {
			
			
			
			PrintWriter reservation=null;
			ReservationWriter write=null;
			ReservationPanel reservee=null;
			PrintWriter reserveWriter=null;
			String date= this.getDate();
			String fileName="G:\\BADASS Calendar\\Dates\\"+date+".txt";
			int g=0;


			while(g==0){
			
			if(this.getBackground()==Color.LIGHT_GRAY){
			
				try{
				
					
					write= new ReservationWriter(username, this.getDate());
					reservation=write.writeReservation(fileName);
					
					
					
						 
						
						}
						catch(FileNotFoundException e){
							
							e.printStackTrace();
							g++;
						}
						
						//creates new file based on date and enters password then username within text file
						if(reservation!=null){
						
						reservation.println(password);
						reservation.println(username);
						
						
						reservation.close();
						}
						else {
							
							try{
							
							File newFile=write.createAFile(fileName);
							
							}
							
							catch(IOException e){
								e.printStackTrace();
								g++;
							}
							
							
						}
						
						//sets displayed name
							period.enterName(username);
							this.setText(period.getPeriod()+": "+username);
							this.setBackground(Color.RED);
						g++;
			}
					

					
					
			//if file is Red and already has a name within Period then the user will be asked to enter specific password to delete the reservation 
				if(this.getBackground()==Color.RED&&g==0){
				
					String enteredPassword = JOptionPane.showInputDialog("Please enter password: ");
				
				
				
				
					if(enteredPassword.equals(this.password)){
						
					
							try{
									Path p=FileSystems.getDefault().getPath(fileName);
									Files.deleteIfExists(p);
							}
							catch(IOException e){
								e.printStackTrace();
								g++;
							}
							this.setBackground(Color.LIGHT_GRAY);
							this.setText(Integer.toString(period.getPeriod()));
							g++;
							try{
								reservee.reader();
							}
							catch(FileNotFoundException e){
								e.printStackTrace();
							}
							
				}
				
				
				
			}
					
					
				}
		}
				
			}
			
			
			
	



