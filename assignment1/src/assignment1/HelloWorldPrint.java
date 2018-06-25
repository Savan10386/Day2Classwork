package assignment1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author rajan
 *
 */
public class HelloWorldPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date=new Date();
		System.out.println(formatter.format(date));
		
		//Code checkin savan
		
		System.out.println("Test Savan");

	}

}
