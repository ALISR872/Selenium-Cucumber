package com.eurotech.step_definitions;

import com.eurotech.pages.DashboardPage;
import com.eurotech.pages.ExperiencePage;
import com.eurotech.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ExperienceStepDef {

    DashboardPage dashboardPage = new DashboardPage();
    ExperiencePage experiencePage = new ExperiencePage();

    @Then("The user should land on Add An Experience page")
    public void theUserShouldLandOnAddAnExperiencePage() {

        String expectedHeader = "Add An Experience";
        String actualHeader = experiencePage.header.getText();

        Assert.assertEquals(expectedHeader, actualHeader);
    }

    @And("The user fills {string} field as {string}")
    public void theUserFillsFieldAs(String experienceTextField, String experienceTextFieldValue) {
   //     Driver.get().findElement(By.xpath("//*[contains(@placeholder, '" + experienceTextField + "')]")).
   //             sendKeys(experienceTextFieldValue);

        experiencePage.experienceTextFields(experienceTextField).sendKeys(experienceTextFieldValue);;

    }

    @And("The user picks {string} as {string}")
    public void theUserPicksAs(String experienceDateField, String experienceDateFieldValue) {

        Driver.get().findElement(By.xpath("//h4[.='"+experienceDateField+"']/../input"))
                .sendKeys(experienceDateFieldValue);

    }

    @And("The user click the submit button")
    public void theUserClickTheSubmitButton() {

        experiencePage.submitButton.click();

    }

    @Then("The user should see the experince added message")
    public void theUserShouldSeeTheExperinceAddedMessage() {
        String expectedAlertMessage = "Experience Added";
        String actualAlertMessage = dashboardPage.alertMessage.getText();

        Assert.assertEquals(expectedAlertMessage,actualAlertMessage);

        Assert.assertTrue(dashboardPage.alertMessage.isDisplayed());


    }

    @When("The user fills experience form and submit")
    public void theUserFillsExperienceFormAndSubmit() {

    }
}
