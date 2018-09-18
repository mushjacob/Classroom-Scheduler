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
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.FileReader ;
import java.io.FileNotFoundException ;
import java.io.PrintWriter ;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.io.FileReader ;
import java.io.FileNotFoundException ;
import java.io.PrintWriter ;
import java.util.Scanner ;

public class ReservationPanel extends JPanel implements FileGod {
	
	private ArrayList<String> reservationz=new ArrayList<String>();
	private String user;
	
	public ReservationPanel( String user){
		
		
		this.user=user;
		
		
		
		
		
	}
	
	
	public PrintWriter writeReservation(String fileName)throws FileNotFoundException{
 
	
		
		
		PrintWriter reservation= new PrintWriter(fileName);
		
		
		return reservation;
		
		
		
		
	
	
}
	
	public File createAFile(String fileName)throws IOException{
		File n= new File(fileName); 
		n.createNewFile();
		return n;
		
		
	}
	
	public void deleteFile(String fileName) throws IOException{
		
		File m= new File(fileName);
	
		Files.delete(m.toPath());
	}
	
	public void reader()throws FileNotFoundException {
		
		FileReader read= new FileReader("C:\\Users\\Mishael\\Documents\\Reservations\\"+user+".txt");
		Scanner in= new Scanner(read);
		String line= in.nextLine();
		String[] parts = line.split("-");
		String period=parts[0];
		String day=parts[1];
		String month=parts[2];
		String year=parts[3];
		reservationz.add(day+"//"+month+"//"+year+": "+period);
		add(new JLabel(day+"//"+month+"//"+year+": "+period));
		
		
		
	}
	
	public void run(){
		
		Container container = new Container();
		Dimension size= new Dimension(1880,967);
		container.setPreferredSize(size);
		GridLayout grid= new GridLayout(0,1,5,5);
		container.setLayout(grid);
		JLabel title=new JLabel(user+"'s Reservations: ");
		container.add(title);
		for(int i=0;i<reservationz.size();i++){
			container.add(new JLabel(reservationz.get(i)));
		}
		
		
      
      
      
      add(container);
		
		
	}
	
	
	
}
