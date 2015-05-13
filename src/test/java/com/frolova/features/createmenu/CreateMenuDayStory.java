package com.frolova.features.createmenu;

import com.frolova.steps.CreateMenuSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

/**
 * Created by иарвар on 06.05.2015.
 */
@RunWith(SerenityRunner.class)
public class CreateMenuDayStory {
    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "http://gioia-profiterole.rhcloud.com/")
    public Pages pages;

    @Steps
    public CreateMenuSteps createMenuSteps;

    @Test
    public void choose_menu_breakfast_day(){
       createMenuSteps.is_the_menu_page();
       createMenuSteps.open_create_menu_breakfast_day();
    }
    @Test
    public void choose_menu_dinner_day(){
        createMenuSteps.is_the_menu_page();
        createMenuSteps.open_create_menu_dinner_day();
    }
    @Test
    public void choose_menu_super_day(){
        createMenuSteps.is_the_menu_page();
        createMenuSteps.open_create_menu_super_day();
    }
}
