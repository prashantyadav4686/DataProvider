package com.qait.DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
/**
 * Unit test for simple App.
 */
public class TestClassDp extends ClassBaseTest{
	
	
	@Test()
    public void Test01_launch() {
		key.launchChrome();
	}
	
	@Test(dataProvider="SearchProvider")
    public void testMethod(String author,String searchKey) throws Exception{
        {

            WebElement searchText = driver.findElement(By.name("q"));
            searchText.sendKeys(searchKey);
            System.out.println("Welcome ->"+author+" Your search key is->"+searchKey);

            String testValue = searchText.getAttribute("value");
           // System.out.println(testValue +"::::"+searchKey);
            searchText.clear();

            //Verify if the value in google search box is correct
            Assert.assertTrue(testValue.equalsIgnoreCase(searchKey));
            searchText.submit();
            
        }

    }
	
	 @DataProvider(name="SearchProvider")
   public Object[][] getDataFromDataprovider() throws Exception
     {
		 Object[][] obj;
		 ExcelDataReader h = new ExcelDataReader();
		 return obj = h.readExcelData();
		 
        /* return new Object[][] 
         { 
        	data1
        	 /*
             { "Aman", "About" },

             { "Shivam", "Biography" },

             { "Hello", "TestNg" }
          
         };*/
     }

	
}
