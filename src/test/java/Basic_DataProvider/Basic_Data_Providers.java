package Basic_DataProvider;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class Basic_Data_Providers {
//parameterzation -> validating a single Test case with multiple sets of data
//Login()->u1/p1 , u2/p2, u3/p3
	
@Test(dataProvider="getData")                      //Step3->linking the test case with the dataprovider
public void RegisteringNewUser(String username, String browser, int mobile, String email) {  //Step 4-  no of input parameter = no of colums
	
}	
@DataProvider
public Object[][] getData(){                            //Step1->Returns a 2d object array
	Object[][] data = new Object[3][4];            //[rows][cols]
	                                                                   
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
