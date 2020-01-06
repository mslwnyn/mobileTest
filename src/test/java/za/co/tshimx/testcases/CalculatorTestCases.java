package za.co.tshimx.testcases;




import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import za.co.tshimx.pageobjects.CalculatorObjects;


public class CalculatorTestCases extends BaseClass {
	
        final static Logger logger = Logger.getLogger(CalculatorTestCases.class);
        CalculatorObjects calc;
        @Test
	public void addtwonumbers() {
	        try 
                {       logger.info("Driver is:" + driver);    
                        //calc = PageFactory..initElements(new AppiumFieldDecorator(driver), CalculatorObjects.class);
                        //calc = PageFactory.initElements(driver, CalculatorObjects.class);
                        calc = new CalculatorObjects(driver);
                        calc.setButton_three();
                        calc.setButton_plus();
                        calc.setButton_eight();
                        calc.setButton_equals();
                        String result = calc.getResult();
                        logger.info("Result is:" + result);
                        Assert.assertEquals(Integer.parseInt(result), 11);
                } catch (Exception e) {
                         logger.error(e.getMessage());
                         logger.error(e.getCause());
                         e.printStackTrace();
                }
    }

       
        
   

          
}
