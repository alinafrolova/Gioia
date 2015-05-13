package com.frolova.pages;

import ch.lambdaj.function.convert.Converter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static ch.lambdaj.Lambda.convert;

/**
 * Created by иарвар on 06.05.2015.
 */
 @DefaultUrl("http://gioia-profiterole.rhcloud.com/")
public class SignInPage extends PageObject {
    @FindBy(linkText = "Вход")
    private WebElementFacade signIn;
    ///////////////////////////////////////
    @FindBy (id= "j_username")
    private WebElementFacade sign_username;
    //////////////////////////////////////
    @FindBy (id = "j_password")
    private WebElementFacade sign_password;
    //////////////////////////////////////
    @FindBy (css = "button.btn")
    private WebElementFacade buttonSign;
    /////////////////////////////////////
    public void click_button_sign(){
        signIn.click();
    }
    ///////////////////////////////////
    public void fill_sign_username(String name){
        sign_username.sendKeys(name);
    }
    ///////////////////////////////////
    public void fill_sign_password(String add_pass){
        sign_password.sendKeys(add_pass);
    }
    ///////////////////////////////////
    public void submit(){
        buttonSign.click();
    }
    ///////////////////////////////////////////////////
    public List<String> getError() {
        WebElementFacade errorList = find(By.tagName("div"));
        List<WebElement> results = errorList.findElements(By.id("passwordOrLoginError"));
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
