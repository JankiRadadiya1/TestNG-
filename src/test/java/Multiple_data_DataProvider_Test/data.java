package Multiple_data_DataProvider_Test;
//This is for storing data :->
import java.lang.reflect.Method;  //import this pacakge and method of data provider give Mthod name in ()

import org.testng.annotations.DataProvider;

public class data {
	@DataProvider 
	public static Object[][] getData(Method name){                       //Step1->Returns a 2d object array(make it static class level linking)
		   System.out.println("TestCase which has the method is  :" + name.getName() );                                                                                   
		Object[][] data = new Object[3][4];                                       //[rows][cols]
		                                                                   
		data[0][0]= "User1";                                    //Step2 - enter the data as per the row and cols
		data[0][1]="Chrome";
		data[0][2]=987456345;
		data[0][3]="Seleniumpanda@rediffmail.com";
		
		data[1][0]= "User2";
		data[1][1]="Firefox";
		data[1][2]=987346345;
		data[1][3]="Seleniumpanda1@rediffmail.com";
		
		data[2][0]= "User3";
		data[2][1]="IE";
		data[2][2]=987236345;
		data[2][3]="Seleniumpanda2@rediffmail.com";
		
		return data;
	}
}
