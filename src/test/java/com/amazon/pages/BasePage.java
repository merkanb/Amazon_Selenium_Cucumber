package com.amazon.pages;


import com.amazon.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public abstract class BasePage {                // it is abstract class !!

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(css = "#nav-link-accountList-nav-line-1")
    public WebElement helloUser;

    @FindBy(xpath = "//span[text()='Create a List']")
    public WebElement createAList;

    @FindBy(css = "#nav-logo-sprites")
    public WebElement amazonHomePage;

}
