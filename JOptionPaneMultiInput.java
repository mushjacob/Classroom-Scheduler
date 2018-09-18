import javax.swing.*;
import java.awt.Font;


//Class creates JOptionPane that asks user to enter his or her name and chosen password, used to verify in case user chooses to remove a reserved period
public class JOptionPaneMultiInput {
	
	protected  String username;
	protected  String password;
	
	public JOptionPaneMultiInput(){
		this.username="";
		this.password="";
	}
   public void main() {
      JTextField xField = new JTextField(10);
      JTextField yField = new JTextField(10);

      JPanel myPanel = new JPanel();
      myPanel.add(new JLabel("Username: "));
      myPanel.add(xField);
      myPanel.add(Box.createHorizontalStrut(15)); // a spacer
      myPanel.add(new JLabel("Password: "));
      myPanel.add(yField);
      String prompt = "Please enter your name and choose password.";
      
      Font myfont2= new Font("Helvetica CE 35 Thin",Font.PLAIN,20);
		JOptionPane ask= new JOptionPane(prompt);
		ask.setIcon(new ImageIcon("C:\\Users\\Mishael\\Pictures\\Calendar\\cal.png"));
      int result = ask.showConfirmDialog(null, myPanel, 
               prompt, ask.OK_CANCEL_OPTION);
               
               
       
               
      if (result == JOptionPane.OK_OPTION) {
         this.username=xField.getText();
         this.password=yField.getText();
      }
   }
   
   public String getUsername(){
   		return username;
   }
   
   public String getPassword(){
   		return password;
   }
}