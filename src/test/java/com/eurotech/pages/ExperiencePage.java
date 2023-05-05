package com.eurotech.pages;

import com.eurotech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExperiencePage extends BasePage{


    @FindBy(xpath = "//*[.='Add An Experience']")
    public WebElement header;

    @FindBy(id = "addexperience-form-btn")
    public WebElement submitButton;

    public WebElement experienceTextFields(String experienceTextField){
        return Driver.get().findElement(By.xpath("//*[contains(@placeholder, '" + experienceTextField + "')]"));
    }


}
