import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Tésté!");
		System.out.println("Tésté!");
		String str1 = "a jkkari";
		String str2 = "a djdjd";
		
//		foo f1 = new foo();
//		f1.qwe = 123;
//		System.out.println(f1.qwe);
		
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		System.out.println("  ...  " + name);
		in.close();
		
		
		System.out.println(str1.compareTo(str2));
		
	}
	
	public class foo{
		
		public int qwe = 23;
		
		foo(){
			qwe=23;
		}
		
		void setqwe(int qwe){
			this.qwe = qwe;
		}
		
	}

}

