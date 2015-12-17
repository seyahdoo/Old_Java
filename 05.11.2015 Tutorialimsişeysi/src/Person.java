
public class Person {

	private String Name;
	private String Surname;
	private int Age;
	
	
	Person(){
		//harddiskten Ram e kopyala name için yer ayýr, surna...
		
		Name = "abuzittin";
		
		
		//return this;
	}
	

	
	Person(String Name){
		this.Name = Name;
	}
	
	
	
	
	public String GetName(){
		return Name;
	}
	public void SetName(String Name){
		this.Name = Name;
	}
	
	
	
	
}
