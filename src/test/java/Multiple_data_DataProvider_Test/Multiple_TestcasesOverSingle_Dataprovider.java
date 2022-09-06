package Multiple_data_DataProvider_Test;
//Mapping Multiple testcases over a single @DataProvider
//eg->1 test case - we used 1 @DataProvider 
//what if there is 100 test cases ? will use 100 @Dataprovider ans-> no 
//Steps1->create a separate pacakge which only have the @Dataprovider 
//Step2->Create a class which have the test cases(multiple testcases)
//Step3->Make the method inside the @Dataprovider as static
//Step4->map the testcase with the name of the class which has @DataProvider
//Step5->map the test case which has name of the method in @DataProvider
//Step6->pass the input parameters(in the method)== number of parameter in cols
//Step7->pass method as an input parameter inside the method of @DataProvider
//Note->when we practically work in a framwork , we use data from excel sheet(.xlsx or .xls) - 
public class Multiple_TestcasesOverSingle_Dataprovider {

	public static void main(String[] args) {
		

		
		

	}

}
