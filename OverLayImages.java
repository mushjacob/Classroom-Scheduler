import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.*;

@SuppressWarnings("serial")
public class OverLayImages extends JPanel {
   public static final String BACKGROUND_URL = "http://i68.tinypic.com/2afzh40.png";
   public static final String CELL_URL = "http://i68.tinypic.com/2wm3nuq.jpg";
   private static final int ROWS = 6;
   private static final int COLS = 7;
   private BufferedImage backgroundImage;
   private BufferedImage cellImage;

   public OverLayImages() throws MalformedURLException, IOException {
      backgroundImage = ImageIO.read(new URL(BACKGROUND_URL));
      cellImage = ImageIO.read(new URL(CELL_URL));
      ImageIcon cellIcon = new ImageIcon(cellImage);
      setBackground(Color.white);

      setPreferredSize(new Dimension(1080,720));

      setLayout(new GridLayout(ROWS, COLS));
      for (int i = 0; i < ROWS; i++) {
         for (int j = 0; j < COLS; j++) {
            MonthButton n1= new MonthButton("1", Color.LIGHT_GRAY,Color.WHITE,5,5,10,10,1,1,0,5,2016,"m","m");
            add(n1);
         }
      }
   }

   @Override
   protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      if (backgroundImage != null) {
         g.drawImage(backgroundImage, 0, 0, null);
      }
   }

   private static void createAndShowUI() {
      JFrame frame = new JFrame("OverLayImages");
      JPanel j=new JPanel();
      j.setSize(1,5);
      try {
         j.add(new OverLayImages());
      } catch (MalformedURLException e) {
         e.printStackTrace();
         System.exit(1);
      } catch (IOException e) {
         e.printStackTrace();
         System.exit(1);
      }
      frame.add(j);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setBackground(Color.BLUE);
      frame.pack();
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
   }

   public static void main(String[] args) {
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            createAndShowUI();
         }
      });
   }
}