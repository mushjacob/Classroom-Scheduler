import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.net.MalformedURLException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class ImagePanel extends JPanel{

    

    public ImagePanel() {
       try {                
          ImageIcon image = new ImageIcon(new File("C:\\Users\\Mishael\\Pictures\\Calendar\\Period.JPG"));
       } catch (IOException ex) {
            System.out.println("Image does not exist!");
       }
       
       JLabel background= new JLabel(image);
       
       add (image);
    }

    


}