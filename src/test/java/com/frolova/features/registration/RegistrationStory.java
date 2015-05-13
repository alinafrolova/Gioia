package com.frolova.features.registration;

import com.frolova.steps.MainSteps;
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
public class RegistrationStory {
    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "http://gioia-profiterole.rhcloud.com/")
    public Pages pages;

    @Steps
    public MainSteps mainSteps;

    @Test
    public void correct_registration(){
        mainSteps.is_the_home_page();
        mainSteps.fill_reg_page();
    }
    @Test
    public void error_login_reg(){
        mainSteps.is_the_home_page();
        mainSteps.fill_reg_error_login();
        mainSteps.should_see_error_login("Корректными значениями являются большие и маленькие буквы (Английский), цифры, символы (. + - () : ; _ ).");
    }
    ///////////////////////////////////////
    @Test
    public void error_pass_reg(){
        mainSteps.is_the_home_page();
        mainSteps.fill_reg_error_pass();
        mainSteps.should_see_error_pass("Поле не должно быть пустым. Корректными значениями являются большие и маленькие буквы (Русский, Украинский, Английский), цифры, символы (, . + - * / () [] = : ; _ ).");
    }
    ///////////////////////////////////////
    @Test
    public void error_mail_reg(){
        mainSteps.is_the_home_page();
        mainSteps.fill_reg_error_mail();
        mainSteps.should_see_error_mail("Введите корректный e-mail.");
    }
}
