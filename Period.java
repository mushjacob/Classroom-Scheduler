
//Basic period class that holds a period number and period name 
public class Period {
    
    private int per;
    private String name;
    
   public Period(int per, String name){
   	
   	this.per=per;
   	this.name=name;
   	
   }
   
   public int getPeriod(){
   	return per;
   }
   
   public String getName(){
   	return name;
   }
   
   public void enterName(String newName){
   	name=newName;
   }
}
