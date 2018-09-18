import java.io.FileReader ;
import java.io.FileNotFoundException ;
import java.io.PrintWriter ;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

//Class implements file God and writes new text files named by date of PeriodButton and enters username and password within file
public class ReservationWriter implements FileGod {
	
	private String in;
	private String date;
	private File f;
	
	
	public ReservationWriter(String in, String date ){
		
		
		this.in=in;
		this.date=date;
		this.f=null;
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
}
