import java.io.FileReader ;
import java.io.FileNotFoundException ;
import java.io.PrintWriter ;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

//for classes that need to create and delete files
public interface FileGod {
	
	public File createAFile(String fileName )throws IOException;
	
	public void deleteFile(String fileName)throws IOException;
}
