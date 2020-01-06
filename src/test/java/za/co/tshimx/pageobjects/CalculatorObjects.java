/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.tshimx.pageobjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author Tshimologo
 */
public class CalculatorObjects {
    
    AndroidDriver<MobileElement> driver;
    @AndroidFindBy(id="com.sec.android.app.popupcalculator:id/bt_03")
    MobileElement button_three; 
        
    @AndroidFindBy(id="com.sec.android.app.popupcalculator:id/bt_add")
    MobileElement button_plus; 
    
    @AndroidFindBy(id="com.sec.android.app.popupcalculator:id/bt_08")
    MobileElement button_eight; 
    
    @AndroidFindBy(id="com.sec.android.app.popupcalculator:id/bt_equal")
    MobileElement button_equals;
    
    @AndroidFindBy(className ="android.widget.EditText")
    MobileElement result;
    
    public CalculatorObjects(AndroidDriver<MobileElement> driver){
       //this.driver = driver;
       PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void setButton_three() {
        this.button_three.click();
    }

    public void setButton_eight() {
        this.button_eight.click();
    }

   

    public void setButton_plus() {
        this.button_plus.click();
    }

    

    public void setButton_equals() {
        this.button_equals.click();
    }

    public String getResult() {
        return this.result.getText();
    }
    
  
    
}
