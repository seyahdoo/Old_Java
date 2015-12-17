public class Program {

	public enum YOL{
		Bubble,Quick
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Hello kamil, im the world!");
		YOL myyol;
		myyol = YOL.Quick;
		if(myyol == YOL.Bubble){
			//doit;
		}
		
		Person prs = new Person("rýza");
		
		
		System.out.print(prs.GetName());
		
	}
	
	

}


