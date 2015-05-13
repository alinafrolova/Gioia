package com.frolova.features.signIn;

import com.frolova.steps.SignInSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

/**
 * Created by иарвар on 05.05.2015.
 */
@RunWith(SerenityRunner.class)
public class SignInStory {
    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "http://gioia-profiterole.rhcloud.com/")
    public Pages pages;

    @Steps
    public SignInSteps signInSteps;

    @Test
    public void correct_signIn(){
        signInSteps.is_the_sign_page();
        signInSteps.sign_in();
    }
    @Test
    public void error_signIn(){
       signInSteps.is_the_sign_page();
       signInSteps.sign_in_error();
       signInSteps.should_see_error("Вы ввели неверный логин и/или пароль");
    }
}
