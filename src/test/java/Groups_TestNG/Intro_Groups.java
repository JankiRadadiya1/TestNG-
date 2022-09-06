package Groups_TestNG;
//what are groups?  -->
//how to create groups? --> (groups= {"smoke"}) 
//how to execute groups? -->
//waht is meta groups?  -->
//how to use regular experssion? -->
//groups at class level? -->
import org.testng.annotations.Test;

public class Intro_Groups {
	
	//There is 1000 test cases but we want to run poarticular test cases than we can use group concept
	
//GROUPS->
	//in xml file create group and inside group run and than include name of test case which is group name&we can also exclude test cases it not run and more prefference is to exclude test case not include testcase
	/*<groups>
	<run>
	<include name = "smoke"></include>
	<include name ="sanity"></include>
	 <exclude name="regression"></exclude>
	</run>
	</groups*/
//META GROUPS->
	//If we want to run meta group test cases :->define test case but inside Group tag
/*	 <define  name="TwilightTestCasesGroup">      
	   <include name="regression"></include>
	   </define>
*/	
	
//REGULAR EXPERSSION->eg->there is 500 test cases some you want to run in Linux and some you want to run in mac
	//pass the @Test(groups= {"windows.sanity"})  and in xml file pass->
	//<include name = "windows.*"></include> 
	//it will only run the windows test cases not of linux
	
//CLASS - level groups->
   //if you want to include to run  all the test cases which is inside class give @Test(groups = "CompleteClassLevelTest") at class level 
	
	

}
