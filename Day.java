import javax.swing.JButton;
public class Day {
	private Period[] periods;
	private JButton[] buttons;
	
	public Day (Period[] periods, JButton[] buttons){
		this.periods=periods;	
		this.buttons=buttons;
	}
	
	public Period getPeriodIndex(int index){
		return periods[index];
	}
	
	public Period[] getPeriodsArray(){
		return periods;
	}
	
	public JButton getButtonIndex(int index){
		return buttons[index];
	}
	
	public JButton[] getButtonsArray(){
		return buttons;
	}
}
