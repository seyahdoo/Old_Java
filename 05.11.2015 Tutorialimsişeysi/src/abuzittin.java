import java.text.SimpleDateFormat;
import java.util.Calendar;

public class abuzittin {
	
	public int Age;
	public int BirthYear;
	
	
	public void CalculateBirthYear(){
		//Calendar cal = Calendar.getInstance();
		BirthYear = Calendar.YEAR - Age;
		System.out.print(Calendar.YEAR);
	}
	

}
