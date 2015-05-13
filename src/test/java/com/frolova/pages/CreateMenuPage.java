package com.frolova.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

/**
 * Created by иарвар on 06.05.2015.
 */
@DefaultUrl("http://gioia-profiterole.rhcloud.com/")
public class CreateMenuPage extends PageObject {
    @FindBy(linkText = "Создать меню")
    private WebElementFacade create_menu;
    /////////////////////////////////////
    @FindBy (linkText = "Меню на день")
    private WebElementFacade menu_for_day;
    /////////////////////////////////////
    @FindBy (xpath = "//button[@value='#breakfast']")
    private WebElementFacade choose_day_breakfast;
    /////////////////////////////////////
    @FindBy (xpath = "//button[@value='#dinner']")
    private WebElementFacade choose_day_dinnery;
    /////////////////////////////////////
    @FindBy (xpath = "//button[@value='#supper']")
    private WebElementFacade choose_day_supper;
    /////////////////////////////////////
    @FindBy (linkText = "Меню на неделю")
    private WebElementFacade menu_for_week;
    /////////////////////////////////////
    @FindBy (xpath = "//button[@value='Mo']")
    private WebElementFacade choose_monday;
    /////////////////////////////////////
    @FindBy (xpath = "//button[@value='Tu']")
    private WebElementFacade choose_tuesday;
    /////////////////////////////////////
    @FindBy (xpath = "//button[@value='We']")
    private WebElementFacade choose_wednesday;
    /////////////////////////////////////
    @FindBy (xpath = "//button[@value='Th']")
    private WebElementFacade choose_thursday;
    /////////////////////////////////////
    @FindBy (xpath = "//button[@value='Fr']")
    private WebElementFacade choose_friday;
    /////////////////////////////////////
    @FindBy (xpath = "//button[@value='Sa']")
    private WebElementFacade choose_saturday;
    /////////////////////////////////////
    @FindBy (xpath = "//button[@value='Su']")
    private WebElementFacade choose_sunday;
    /////////////////////////////////////
    @FindBy (xpath = "//div[2]/button")
    private WebElementFacade choose_breakfast;
    /////////////////////////////////////
    @FindBy (xpath = "//div[2]/button[2]")
    private WebElementFacade choose_dinnery;
    /////////////////////////////////////
    @FindBy (xpath = "//div[2]/button[3]")
    private WebElementFacade choose_supper;
  ////////////////////////////////////
    public void choose_menu(){
        create_menu.click();
    }
    /////////////////////////////////////
    public void choose_menu_day(){
        menu_for_day.click();
    }
    /////////////////////////////////////
    public void choose_menu_week(){
        menu_for_week.click();
    }
    /////////////////////////////////////
    public void choose_breakfast_day(){
        choose_day_breakfast.click();
    }
    /////////////////////////////////////
    public void choose_dinner_day(){
        choose_day_dinnery.click();
    }
    /////////////////////////////////////
    public void choose_super_day(){
        choose_day_supper.click();
    }
    /////////////////////////////////////
    public void choose_monday_week(){        choose_monday.click();    }
    /////////////////////////////////////
    public void choose_tuesday_week(){        choose_tuesday.click();    }
    /////////////////////////////////////
    public void choose_wednesday_week(){
        choose_wednesday.click();
    }
    /////////////////////////////////////
    public void choose_thursday_week(){
        choose_thursday.click();
    }
    /////////////////////////////////////
    public void choose_friday_week(){
        choose_friday.click();
    }
    /////////////////////////////////////
    public void choose_saturday_week(){
        choose_saturday.click();
    }
    /////////////////////////////////////
    public void choose_sunday_week(){
        choose_sunday.click();
    }
    ////////////////////////////////////
    public void choose_breakfast_week(){
        choose_breakfast.click();
    }
    /////////////////////////////////////
    public void choose_dinner_week(){
        choose_dinnery.click();
    }
    /////////////////////////////////////
    public void choose_super_week(){
        choose_supper.click();
    }
    /////////////////////////////////////
}
