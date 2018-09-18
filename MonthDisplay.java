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

public class MonthDisplay extends JPanel {
	
	
	
	public static void main(String[] args){
		
		JFrame frame= new JFrame();
		Container container = new Container();
		frame.setTitle("Month");
		frame.setDefaultCloseOperation(3);
		
		frame.setBounds(0,0,1920,1080);
		container.setBounds(0,0,1920,1080);
		GridLayout g= new GridLayout(6,7,5,5);
		container.setLayout(g);
		ArrayList<MonthButton> array= new ArrayList<MonthButton>();
		
		MonthButton n1= new MonthButton("1", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,1,1);
		MonthButton n2= new MonthButton("2", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,1,2);
		MonthButton n3= new MonthButton("3", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,1,3);
		MonthButton n4= new MonthButton("4", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,1,4);
		MonthButton n5= new MonthButton("5", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,1,5);
		MonthButton n6= new MonthButton("6", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,1,6);
		MonthButton n7= new MonthButton("7", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,1,7);
		MonthButton n8= new MonthButton("8", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,2,1);
		MonthButton n9= new MonthButton("9", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,2,2);
		MonthButton n10= new MonthButton("10", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,2,3);
		MonthButton n11= new MonthButton("11", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,2,4);
		MonthButton n12= new MonthButton("12", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,2,5);
		MonthButton n13= new MonthButton("13", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,2,6);
		MonthButton n14= new MonthButton("14", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,2,7);
		MonthButton n15= new MonthButton("15", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,3,1);
		MonthButton n16= new MonthButton("16", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,3,2);
		MonthButton n17= new MonthButton("17", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,3,3);
		MonthButton n18= new MonthButton("18", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,3,4);
		MonthButton n19= new MonthButton("19", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,3,5);
		MonthButton n20= new MonthButton("20", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,3,6);
		MonthButton n21= new MonthButton("21", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,3,7);
		MonthButton n22= new MonthButton("22", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,4,1);
		MonthButton n23= new MonthButton("23", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,4,2);
		MonthButton n24= new MonthButton("24", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,4,3);
		MonthButton n25= new MonthButton("25", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,4,4);
		MonthButton n26= new MonthButton("26", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,4,5);
		MonthButton n27= new MonthButton("27", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,4,6);
		MonthButton n28= new MonthButton("28", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,4,7);
		MonthButton n29= new MonthButton("29", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,5,1);
		MonthButton n30= new MonthButton("30", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,5,2);
		MonthButton n31= new MonthButton("31", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,5,3);
		MonthButton n32= new MonthButton("32", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,5,4);
		MonthButton n33= new MonthButton("33", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,5,5);
		MonthButton n34= new MonthButton("34", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,5,6);
		MonthButton n35= new MonthButton("35", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,5,7);
		MonthButton n36= new MonthButton("36", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,6,1);
		MonthButton n37= new MonthButton("37", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,6,2);
		MonthButton n38= new MonthButton("38", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,6,3);
		MonthButton n39= new MonthButton("39", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,6,4);
		MonthButton n40= new MonthButton("40", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,6,5);
		MonthButton n41= new MonthButton("41", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,6,6);
		MonthButton n42= new MonthButton("42", Color.LIGHT_GRAY,Color.WHITE,container.getWidth(),container.getHeight(),10,10,6,7);
		
		
		
		
		
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
		
		
		
		Font myfont= new Font("Kenzo",Font.PLAIN,50);
		
		for(int i=0; i<42;i++){
			array.get(i).setFont(myfont);
		}
		
		for(int i=0; i<42;i++){
			container.add(array.get(i));
		}
		
		
		
		frame.add(container);
		
		
		
		frame.setVisible(true);
		container.setVisible(true);
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	}
	
	
}
