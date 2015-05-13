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
 * Created by иарвар on 07.05.2015.
 */
@RunWith(SerenityRunner.class)
public class CreateMenuWeekStory {
    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "http://gioia-profiterole.rhcloud.com/")
    public Pages pages;

    @Steps
    public CreateMenuSteps createMenuSteps;

    @Test
    public void choose_menu_monday_breakfast_week(){
        createMenuSteps.is_the_menu_page();
        createMenuSteps.open_create_menu_monday_breakfast_week();
    }
    @Test
    public void choose_menu_monday_dinner_week(){
        createMenuSteps.is_the_menu_page();
        createMenuSteps.open_create_menu_monday_dinner_week();
    }
    @Test
    public void choose_menu_monday_super_week(){
        createMenuSteps.is_the_menu_page();
        createMenuSteps.open_create_menu_monday_super_week();
    }
    /////////////////////////////////////////////Tuesday
    @Test
    public void choose_menu_tuesday_breakfast_week(){
        createMenuSteps.is_the_menu_page();
        createMenuSteps.open_create_menu_tuesday_breakfast_week();
    }
    @Test
    public void choose_menu_tuesday_dinner_week(){
        createMenuSteps.is_the_menu_page();
        createMenuSteps.open_create_menu_tuesday_dinner_week();
    }
    @Test
    public void choose_menu_tuesday_super_week(){
        createMenuSteps.is_the_menu_page();
        createMenuSteps.open_create_menu_tuesday_super_week();
    }
    ////////////////////////////////////////////Wednesday
    @Test
    public void choose_menu_wednesday_breakfast_week(){
        createMenuSteps.is_the_menu_page();
        createMenuSteps.open_create_menu_wednesday_breakfast_week();
    }
    @Test
    public void choose_menu_wednesday_dinner_week(){
        createMenuSteps.is_the_menu_page();
        createMenuSteps.open_create_menu_wednesday_dinner_week();
    }
    @Test
    public void choose_menu_wednesday_super_week(){
        createMenuSteps.is_the_menu_page();
        createMenuSteps.open_create_menu_wednesday_super_week();
    }
    //////////////////////////////////////////Thursday
    @Test
    public void choose_menu_thursday_breakfast_week(){
        createMenuSteps.is_the_menu_page();
        createMenuSteps.open_create_menu_thursday_breakfast_week();
    }
    @Test
    public void choose_menu_thursday_dinner_week(){
        createMenuSteps.is_the_menu_page();
        createMenuSteps.open_create_menu_thursday_dinner_week();
    }
    @Test
    public void choose_menu_thursday_super_week(){
        createMenuSteps.is_the_menu_page();
        createMenuSteps.open_create_menu_thursday_super_week();
    }
    //////////////////////////////////////////Friday
    @Test
    public void choose_menu_friday_breakfast_week(){
        createMenuSteps.is_the_menu_page();
        createMenuSteps.open_create_menu_friday_breakfast_week();
    }
    @Test
    public void choose_menu_friday_dinner_week(){
        createMenuSteps.is_the_menu_page();
        createMenuSteps.open_create_menu_friday_dinner_week();
    }
    @Test
    public void choose_menu_friday_super_week(){
        createMenuSteps.is_the_menu_page();
        createMenuSteps.open_create_menu_friday_super_week();
    }
    //////////////////////////////////////////Saturday
    @Test
    public void choose_menu_saturday_breakfast_week(){
        createMenuSteps.is_the_menu_page();
        createMenuSteps.open_create_menu_saturday_breakfast_week();
    }
    @Test
    public void choose_menu_saturday_dinner_week(){
        createMenuSteps.is_the_menu_page();
        createMenuSteps.open_create_menu_saturday_dinner_week();
    }
    @Test
    public void choose_menu_saturday_super_week(){
        createMenuSteps.is_the_menu_page();
        createMenuSteps.open_create_menu_saturday_super_week();
    }
    ////////////////////////////////////////Sunday
    @Test
    public void choose_menu_sunday_breakfast_week(){
        createMenuSteps.is_the_menu_page();
        createMenuSteps.open_create_menu_sunday_breakfast_week();
    }
    @Test
    public void choose_menu_sunday_dinner_week(){
        createMenuSteps.is_the_menu_page();
        createMenuSteps.open_create_menu_sunday_dinner_week();
    }
    @Test
    public void choose_menu_sunday_super_week(){
        createMenuSteps.is_the_menu_page();
        createMenuSteps.open_create_menu_sunday_super_week();
    }
}
