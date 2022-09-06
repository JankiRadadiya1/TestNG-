package ExtendedReports;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

//extentreport is a class
public class Extent_Reports_Basic {
	
	//What is ExtenetReport ->it is a logger(it is kind if an object ti lig certain messages for an app) style reporting Library for Automated Tests
	
//Extent Report(What does?)->it adds info about Test cases, screenshot, tags, series of steps(sequential order)
//All the methods insides ExtentedReports are Thread safe - recommended to make one instance of extentreport
	
@Test
public void login() {
	//Step1- Mkae an objectn of ExtentReport class(internal class which is responsible for generation of extent Reports) it is subject
	ExtentReports  extent = new ExtentReports();
	
	//Step2-> Make the Object of ExtentReports(observer) - attached to Subject(ExtentReports)
	
	ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
	spark.config().setReportName("TestNg Playlist");
	spark.config().setDocumentTitle("Project_JIRAstory_QA/UAT/Prod Extent Reports");
	spark.config().setTheme(Theme.DARK);
	spark.config().setEncoding("utf-8");
	
	//Step3->we need to attach a reporter(used to format the reports )
	extent.attachReporter(spark);
	
	//Step4->We need to create the test cases and add test info:->
	ExtentTest   test = extent.createTest("Login Test");     //this will return Object of class extentTest
	test.log(Status.INFO,"Starting Login Test Case");
	test.log(Status.INFO,"Open Browser");
	test.log(Status.INFO,"Validating presence of sigin link");
	test.log(Status.INFO,"Entering Credentials");
	test.log(Status.INFO,"Login Test Case PASS");
	
	//Step5->flush()  - instructs ExtentReports to write the test info in a cretain destination(IMP)
	
	    extent.flush();
	
	
	
	
	
	
	
	
}
	
	
	

}
