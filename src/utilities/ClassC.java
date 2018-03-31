package utilities;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ClassC {
	
	ClassA methodA = new ClassA();
	ClassB methodB = new ClassB();
	
	 	@DataProvider
	    public Object[][] dataMethod() {
	        Object[][] arrayObjects = getExcelData("C:/logininfo.xlsx");
	        return arrayObjects;    
	    }
	
	    @Test(dataProvider = "dataMethod")
	    public void testMethod(String email, String password) throws InterruptedException {
	        methodA.methodA1();
	        methodA.methodA2();
	        methodB.methodB1();
	        methodB.methodB2();
 
	    }
	    
	    public String[][] getExcelData(String fileName){
	    	String[][] arrayExcelData = null;
	    	return arrayExcelData;
	    }
}

