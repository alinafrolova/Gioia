package com.frolova.steps;

import com.frolova.additional.Temp;
import com.frolova.pages.SignInPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

/**
 * Created by иарвар on 06.05.2015.
 */
public class SignInSteps  extends ScenarioSteps {
    SignInPage signInPage;
    ////////////////////////////////
    String name = "giola" + Temp.randomtxt(4);
    /////////////////////////////////////////
    @Step
    public void is_the_sign_page() {
        signInPage.open();
    }
    ////////////////////////////////////////
    ////////////////////////////////////////
    @Step
    public void should_see_error(String error) {
        assertThat(signInPage.getError(), hasItem(containsString(error)));
    }
    ////////////////////////////////////////
    @Step
    public void sign_in(){
        signInPage.click_button_sign();
        signInPage.fill_sign_username(name);
        signInPage.fill_sign_password("qwerty");
        signInPage.submit();
    }
    ////////////////////////////////////////
    @Step
    public void sign_in_error(){
        signInPage.click_button_sign();
        signInPage.fill_sign_username("1");
        signInPage.fill_sign_password("qwerty");
        signInPage.submit();
    }
}
