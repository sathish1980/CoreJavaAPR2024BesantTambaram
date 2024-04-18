package BasicofJava;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.*;
import java.util.Date;

public class GetDate {
	
	
	public void GetCurrentDate()
	{
		 LocalDateTime now = LocalDateTime.now(); 
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MMM/dd");  
		 System.out.println(dtf.format(now));
	}
	
	public void GetDate()
	{
		 Date d = new Date();
		 System.out.println(d.getDay());
		 LocalDate L = LocalDate.now();
		 System.out.println(L);
		 
		 System.out.println(L.getMonth());
		 System.out.println(L.getDayOfMonth());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetDate g = new GetDate();
		g.GetDate();
	}

}
