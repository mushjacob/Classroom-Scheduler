import java.awt.*;
import javax.swing.*;


	public class MyButton extends JButton implements ActionListener{

     
    MyButton(String text) {
        super(text);
        addActionListener(this);
    }
     
    public void actionPerformed(ActionEvent e) {
        // button as beeen clicked I change it's color
        setBackground(Color.RED);
    }
    
    
    public void paintComponent(Graphics g) {
        Rectangle r = getBounds();
        int x = r.x + 20;
        int y = r.y + 20;
        int width = r.width - 40;
        int height = r.height- 40;
        g.setColor(Color.BLACK);
        g.fillOval(x, y, width, height);
        x += 2;
        y += 2;
        width -= 4;
        height -= 4;
        g.setColor(getBackground());
        g.fillOval(x, y, width, height);
        g.setColor(getForeground());
        y += (height / 2) - 10;
        g.drawString(getText(), x, y);
    }
}

