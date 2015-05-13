package com.frolova.pages;

import ch.lambdaj.function.convert.Converter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static ch.lambdaj.Lambda.convert;



/**
 * Created by иарвар on 05.05.2015.
 */
@DefaultUrl("http://gioia-profiterole.rhcloud.com/")
public class MainPage extends PageObject {
   @FindBy (linkText = "Регистрация")
   private WebElementFacade registration;
    /////////////////////////////////////
    @FindBy (id = "login")
    private WebElementFacade login;
    /////////////////////////////////////
    @FindBy (id = "password")
    private WebElementFacade password;
    /////////////////////////////////////
    @FindBy (id = "confirmPassword")
    private WebElementFacade confirmPassword;
    /////////////////////////////////////
    @FindBy (id = "email")
    private WebElementFacade email;
    /////////////////////////////////////
    @FindBy (id = "datepicker")
    private WebElementFacade datepicker;
    /////////////////////////////////////
    @FindBy (linkText = "1")
    private WebElementFacade date;
    /////////////////////////////////////
    @FindBy (id = "maleOrFemale0")
    private WebElementFacade maleOrFemale0;
    /////////////////////////////////////
    @FindBy (id = "country")
    private Select country;
    /////////////////////////////////////
    @FindBy (id = "iAmAgree")
    private WebElementFacade iAmAgree;
    /////////////////////////////////////
    @FindBy (css = "button.btn")
    private WebElementFacade buttonReg;

    /////////////////////////////////////
    public void click_button_reg(){
        registration.click();
    }
    ///////////////////////////////////
    public void fill_login(String name){
        login.sendKeys(name);
    }
    ///////////////////////////////////
    public void fill_pass(String add_pass){
         password.sendKeys(add_pass);
    }
    ///////////////////////////////////
    public void fill_confpass(String add_confpass){
        confirmPassword.sendKeys(add_confpass);
    }
    ///////////////////////////////////
    public void fill_email(String add_email){
        email.sendKeys(add_email);
    }
    ///////////////////////////////////
    public void fill_date(){
        datepicker.click();
        date.click();
    }
    //////////////////////////////////
    public void choose_sex(){
        maleOrFemale0.click();
    }
    public void select_country(String country){
       // country.deselectAll();
       // country.selectByVisibleText();
    }
    public void fill_iAmAgree(){
        iAmAgree.click();
    }
    ////////////////////////////////////////////
    public void submit(){
        buttonReg.click();
    }
    ///////////////////////////////////////////login
    public List<String> getErrorLogin() {
        WebElementFacade errorList = find(By.id("loginError"));
        List<WebElement> results = errorList.findElements(By.tagName("span"));
        return convert(results, toStrings());
    }
    ////////////////////////////////////////////////////
    ///////////////////////////////////////////pass
    public List<String> getErrorPassword() {
        WebElementFacade errorList = find(By.id("passwordError"));
        List<WebElement> results = errorList.findElements(By.tagName("span"));
        return convert(results, toStrings());
    }
    ///////////////////////////////////////////////////mail
    public List<String> getErrorMail() {
        WebElementFacade errorList = find(By.id("emailError"));
        List<WebElement> results = errorList.findElements(By.tagName("span"));
        return convert(results, toStrings());
    }
    ///////////////////////////////////////////////////
    private Converter<WebElement, String> toStrings() {
        return new Converter<WebElement, String>() {
            public String convert(WebElement from) {
                return from.getText();
            }
        };
    }
}
