package Multiple_data_DataProvider_Test;
//This is for connection:->
//to get all the @dataprovider data in this class follow->
//we have to pass class name and method name in the (dataProviderClass=classname .class , dataProvider="methodname") 
import org.testng.annotations.*;

public class TestCase_Dataprovider{
	
	@Test(dataProviderClass=data.class, dataProvider="getData")
	public void adduser(String username, String browser, int mobile, String email){
		System.out.println(username + " -------------- "+browser+ "------------"+ mobile +"--------------"+email+"--------------------");
	}
	@Test(dataProviderClass=data.class,dataProvider="getData")
	public void RegisterUser(String username, String browser, int mobile, String email){
		System.out.println(username + " -------------- "+browser+ "------------"+ mobile +"--------------"+email+"--------------------");
	}
	@Test(dataProviderClass=data.class,dataProvider="getData")
	public void deleteUser(String username, String browser, int mobile, String email){
		System.out.println(username + " -------------- "+browser+ "------------"+ mobile +"--------------"+email+"--------------------");
	}

}
