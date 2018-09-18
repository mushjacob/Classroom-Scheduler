import javax.swing.JOptionPane;
import java.awt.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.*;


public class DisplayPanel extends JPanel  {
	
		private JButton b1, b2; 
		private Period me;
		
		
		public DisplayPanel()
		{
			
			me = new Period(1, "");
			b1= new JButton(me.getPeriod()+": "+ me.getName());
			b1.addActionListener(new ButtonListener(me.getPeriod(),me.getName()));
		 	add (b1);
		 
		 	b2= new JButton(me.getPeriod()+": "+ me.getName());
			b2.addActionListener(new ButtonListener(me.getPeriod(),me.getName()));
			add (b2);
		 	
			//frame.add (b1);
			
			//frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
			//frame.setVisible(true);
	}
	
	public class ButtonListener extends Period implements ActionListener {
		
			
		public ButtonListener(int per, String name){
			super(per, name);
		
		}
		
			public void actionPerformed(ActionEvent e){
			
			int g=-1;
			while (g<0){
				
				String input = JOptionPane.showInputDialog("Please enter you name: ");
				if (input.length()>0){
					g++;
					
					this.enterName(input);
					if (e.getSource() == b1) {
					 	b1.setText(this.getPeriod()+": "+input);
					 }
						if (e.getSource() == b2) {
					 	b2.setText(this.getPeriod()+": "+input);
					 }
					
					
				}
				else System.out.println("Enter your name: ");
			}
			
			}
		}
	
			
	
	

}