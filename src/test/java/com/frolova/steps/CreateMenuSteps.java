package com.frolova.steps;

import com.frolova.pages.CreateMenuPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by иарвар on 06.05.2015.
 */
public class CreateMenuSteps extends ScenarioSteps {
    CreateMenuPage createMenuPage;
    /////////////////////////////////////////
    @Step
    public void is_the_menu_page() {
        createMenuPage.open();
    }
    ///////////////////////////////////////////
    @Step
    public void open_create_menu_breakfast_day(){
        createMenuPage.choose_menu();
        createMenuPage.choose_menu_day();
        createMenuPage.choose_breakfast_day();
    }
    ///////////////////////////////////////////
    @Step
    public void open_create_menu_dinner_day(){
        createMenuPage.choose_menu();
        createMenuPage.choose_menu_day();
        createMenuPage.choose_dinner_day();
    }
    ///////////////////////////////////////////
    @Step
    public void open_create_menu_super_day(){
        createMenuPage.choose_menu();
        createMenuPage.choose_menu_day();
        createMenuPage.choose_super_day();
    }
    ///////////////////////////////////////////
    @Step
    public void open_create_menu_monday_breakfast_week(){
        createMenuPage.choose_menu();
        createMenuPage.choose_menu_week();
        createMenuPage.choose_monday_week();
        createMenuPage.choose_breakfast_week();
    }
    ///////////////////////////////////////////
    @Step
    public void open_create_menu_monday_dinner_week(){
        createMenuPage.choose_menu();
        createMenuPage.choose_menu_week();
        createMenuPage.choose_monday_week();
        createMenuPage.choose_dinner_week();
    }
    ///////////////////////////////////////////
    @Step
    public void open_create_menu_monday_super_week(){
        createMenuPage.choose_menu();
        createMenuPage.choose_menu_week();
        createMenuPage.choose_monday_week();
        createMenuPage.choose_super_week();
    }
    ///////////////////////////////////////////Tuesday//////////////////////////////
    ///////////////////////////////////////////
    @Step
    public void open_create_menu_tuesday_breakfast_week(){
        createMenuPage.choose_menu();
        createMenuPage.choose_menu_week();
        createMenuPage.choose_tuesday_week();
        createMenuPage.choose_breakfast_week();
    }
    ///////////////////////////////////////////
    @Step
    public void open_create_menu_tuesday_dinner_week(){
        createMenuPage.choose_menu();
        createMenuPage.choose_menu_week();
        createMenuPage.choose_tuesday_week();
        createMenuPage.choose_dinner_week();
    }
    ///////////////////////////////////////////
    @Step
    public void open_create_menu_tuesday_super_week(){
        createMenuPage.choose_menu();
        createMenuPage.choose_menu_week();
        createMenuPage.choose_tuesday_week();
        createMenuPage.choose_super_week();
    }
    ///////////////////////////////////////////Wednesday//////////////////////////////
    ///////////////////////////////////////////
    @Step
    public void open_create_menu_wednesday_breakfast_week(){
        createMenuPage.choose_menu();
        createMenuPage.choose_menu_week();
        createMenuPage.choose_wednesday_week();
        createMenuPage.choose_breakfast_week();
    }
    ///////////////////////////////////////////
    @Step
    public void open_create_menu_wednesday_dinner_week(){
        createMenuPage.choose_menu();
        createMenuPage.choose_menu_week();
        createMenuPage.choose_wednesday_week();
        createMenuPage.choose_dinner_week();
    }
    ///////////////////////////////////////////
    @Step
    public void open_create_menu_wednesday_super_week(){
        createMenuPage.choose_menu();
        createMenuPage.choose_menu_week();
        createMenuPage.choose_wednesday_week();
        createMenuPage.choose_super_week();
    }
    /////////////////////////////////////////////Thuasday////////////////////////////////
    ///////////////////////////////////////////
    @Step
    public void open_create_menu_thursday_breakfast_week(){
        createMenuPage.choose_menu();
        createMenuPage.choose_menu_week();
        createMenuPage.choose_thursday_week();
        createMenuPage.choose_breakfast_week();
    }
    ///////////////////////////////////////////
    @Step
    public void open_create_menu_thursday_dinner_week(){
        createMenuPage.choose_menu();
        createMenuPage.choose_menu_week();
        createMenuPage.choose_thursday_week();
        createMenuPage.choose_dinner_week();
    }
    ///////////////////////////////////////////
    @Step
    public void open_create_menu_thursday_super_week(){
        createMenuPage.choose_menu();
        createMenuPage.choose_menu_week();
        createMenuPage.choose_thursday_week();
        createMenuPage.choose_super_week();
    }
    ///////////////////////////////////////////Friday//////////////////////////////////////
    ///////////////////////////////////////////
    @Step
    public void open_create_menu_friday_breakfast_week(){
        createMenuPage.choose_menu();
        createMenuPage.choose_menu_week();
        createMenuPage.choose_friday_week();
        createMenuPage.choose_breakfast_week();
    }
    ///////////////////////////////////////////
    @Step
    public void open_create_menu_friday_dinner_week(){
        createMenuPage.choose_menu();
        createMenuPage.choose_menu_week();
        createMenuPage.choose_friday_week();
        createMenuPage.choose_dinner_week();
    }
    ///////////////////////////////////////////
    @Step
    public void open_create_menu_friday_super_week(){
        createMenuPage.choose_menu();
        createMenuPage.choose_menu_week();
        createMenuPage.choose_friday_week();
        createMenuPage.choose_super_week();
    }
    ////////////////////////////////////////Saturday/////////////////////////////////////
    ///////////////////////////////////////////
    @Step
    public void open_create_menu_saturday_breakfast_week(){
        createMenuPage.choose_menu();
        createMenuPage.choose_menu_week();
        createMenuPage.choose_saturday_week();
        createMenuPage.choose_breakfast_week();
    }
    ///////////////////////////////////////////
    @Step
    public void open_create_menu_saturday_dinner_week(){
        createMenuPage.choose_menu();
        createMenuPage.choose_menu_week();
        createMenuPage.choose_saturday_week();
        createMenuPage.choose_dinner_week();
    }
    ///////////////////////////////////////////
    @Step
    public void open_create_menu_saturday_super_week(){
        createMenuPage.choose_menu();
        createMenuPage.choose_menu_week();
        createMenuPage.choose_saturday_week();
        createMenuPage.choose_super_week();
    }
    ////////////////////////////////////////Sunday//////////////////////////////////////
    @Step
    public void open_create_menu_sunday_breakfast_week(){
        createMenuPage.choose_menu();
        createMenuPage.choose_menu_week();
        createMenuPage.choose_sunday_week();
        createMenuPage.choose_breakfast_week();
    }
    ///////////////////////////////////////////
    @Step
    public void open_create_menu_sunday_dinner_week(){
        createMenuPage.choose_menu();
        createMenuPage.choose_menu_week();
        createMenuPage.choose_sunday_week();
        createMenuPage.choose_dinner_week();
    }
    ///////////////////////////////////////////
    @Step
    public void open_create_menu_sunday_super_week(){
        createMenuPage.choose_menu();
        createMenuPage.choose_menu_week();
        createMenuPage.choose_sunday_week();
        createMenuPage.choose_super_week();
    }
}
