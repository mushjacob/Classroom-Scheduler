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

//Searches for files based on period button's date and if it exists it sets the Period to show the username inside the file
public class FileSearcher {
	private PeriodButton p;
	
	public FileSearcher(PeriodButton p){
		this.p=p;
	}
	
	public void reader()throws FileNotFoundException {
		String date= p.getDate();
		Period per= p.getPeriod();
		FileReader read= new FileReader("G:\\BADASS Calendar\\Dates\\"+date+".txt");
		Scanner in= new Scanner(read);
		String name=in.next();
		String name2=in.next();
		p.setText(per.getPeriod()+": "+name2);
		
		
	}
	
}
