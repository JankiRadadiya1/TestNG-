package TestNG_xml_parameterization;

public class Intro_Prameterization_Test_XML {
//1)All testcases Batch run :->with help of testNg xml file we can run all the testcase togather as Batch execution(running tests as group) 
//STEPS->select the class and right click convert into testng->generate xml will open click finish->testng.xml file will be created automatically
//->go to that file and first two line is a header don't touch that( change suite name and test name)	
	
//2)All tc but name Individual test case & run->when we want each in own format with name we can also create each test and give each class name we can also do that:->
//<test name ="testname">
//<classes>
//<class name="class name">
//	</classes>
//</test>
//3)Parameterization using testNG.xml->
	
//1.we have give parmeterized tag in the xml file
//2.->we can parameter Browser, url ,emailId, password in xml file. we can parameterize by human as input parameter (but chromedriver as well)
//3.->after passing name and value in xml file come in code and pass annotation -> @parameters(browser, url, emailid, password) and also pass parameter in method(String browser,String url, String emailid, String password) 
//4.now we can pass paramter which we mentioned in xml file and pass in the code where you want to use that
//5.go in xml file and right click run as TestNG suite :->
	
	/*	<suite name="Parameterization testngxml Suite">
		  <test  name="Parameterize Test">
		          <parameter name="Browser" value="chrome"/>
		         <parameter name ="url" value = "https://www.facebook.com"/>
		   <classes>
		   <class name="packagename.classname">
		   </classes>
	*/
}
