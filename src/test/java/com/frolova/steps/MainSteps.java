package com.frolova.steps;

import com.frolova.additional.Temp;
import com.frolova.pages.MainPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import java.util.Random;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

/**
 * Created by иарвар on 05.05.2015.
 */
public class MainSteps extends ScenarioSteps {
    MainPage mainPage;
    //////////////////////////////////////////
    ///////////////////////////////////////////////////////////
    String name = "giola" + Temp.randomtxt(4);
    String mail = "giola" + Temp.randomtxt(4) +new Random().nextInt(999)+ "@max.com";
    /////////////////////////////////////////
    @Step
    public void is_the_home_page() {
        mainPage.open();
    }
    ////////////////////////////////////////
    @Step
    public void should_see_error_login(String error) {
        assertThat(mainPage.getErrorLogin(), hasItem(containsString(error)));
    }
    ////////////////////////////////////////
    @Step
    public void should_see_error_pass(String error) {
        assertThat(mainPage.getErrorPassword(), hasItem(containsString(error)));
    }
    ////////////////////////////////////////
    @Step
    public void should_see_error_mail(String error) {
        assertThat(mainPage.getErrorMail(), hasItem(containsString(error)));
    }
    ////////////////////////////////////////
    @Step
    public void fill_reg_page()
    {
    mainPage.click_button_reg();
    mainPage.fill_login(name);
    mainPage.fill_pass("qwerty");
    mainPage.fill_confpass("qwerty");
    mainPage.fill_email(mail);
    mainPage.fill_date();
    mainPage.choose_sex();
    mainPage.select_country("Украина");
    mainPage.fill_iAmAgree();
    mainPage.submit();
    }
    //////////////////////////////////////////
    @Step
    public void fill_reg_error_login()
    {
        mainPage.click_button_reg();
        mainPage.fill_login(" ");
        mainPage.fill_pass("qwerty");
        mainPage.fill_confpass("qwerty");
        mainPage.fill_email(mail);
        mainPage.fill_date();
        mainPage.choose_sex();
        mainPage.select_country("Украина");
        mainPage.fill_iAmAgree();
        mainPage.submit();
    }
    //////////////////////////////////////////
    @Step
    public void fill_reg_error_pass()
    {
        mainPage.click_button_reg();
        mainPage.fill_login(name);
        mainPage.fill_pass("");
        mainPage.fill_confpass("qwerty");
        mainPage.fill_email(mail);
        mainPage.fill_date();
        mainPage.choose_sex();
        mainPage.select_country("Украина");
        mainPage.fill_iAmAgree();
        mainPage.submit();
    }
    //////////////////////////////////////////
    @Step
    public void fill_reg_error_mail()
    {
        mainPage.click_button_reg();
        mainPage.fill_login(name);
        mainPage.fill_pass("");
        mainPage.fill_confpass("qwerty");
        mainPage.fill_email("1");
        mainPage.fill_date();
        mainPage.choose_sex();
        mainPage.select_country("Украина");
        mainPage.fill_iAmAgree();
        mainPage.submit();
    }
    //////////////////////////////////////////
}
