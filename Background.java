import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.net.MalformedURLException;
import java.net.URL;
import java.awt.GridLayout;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Background {

    private static final String BACKHGROUND_IMAGE_URL = "http://oi66.tinypic.com/5b4rcl.jpg";

    protected void initUI() throws MalformedURLException {
        JFrame frame = new JFrame(Background.class.getSimpleName());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final ImageIcon backgroundImage = new ImageIcon(new URL(BACKHGROUND_IMAGE_URL));
        JLabel mainPanel = new JLabel(backgroundImage) {
            @Override
            public Dimension getPreferredSize() {
                Dimension size = super.getPreferredSize();
                Dimension lmPrefSize = getLayout().preferredLayoutSize(this);
                size.width = Math.max(size.width, lmPrefSize.width);
                size.height = Math.max(size.height, lmPrefSize.height);
                return size;
            }
        };
        mainPanel.setLayout(new GridLayout(6,7,5,5));
        ;
        JButton m= new JButton();
        
       
        for (int i = 0; i <31; i++) {
            mainPanel.add(new JButton("Button " + (i + 1)));
        }
        // Let's put a filler bottom component that will push the rest to the top
        
       
        frame.add(mainPanel);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                try {
                    new Background().initUI();
                } catch (MalformedURLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
    }
}
