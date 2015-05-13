package com.frolova.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

/**
 * Created by иарвар on 07.05.2015.
 */
@DefaultUrl("http://gioia-profiterole.rhcloud.com/")
public class RecipePage extends PageObject {
    @FindBy(linkText = "Рецепты")
    private WebElementFacade recipes;
    /////////////////////////////////////
    @FindBy (linkText = "Все рецепты")
    private WebElementFacade all_recipes;
    ////////////////////////////////////
    @FindBy (id = "back")
    private WebElementFacade back;
    ////////////////////////////////////
    @FindBy (css = "img.img-cuisine")
    private WebElementFacade ukr_kitchen;
    /////////////////////////////////////
    @FindBy (xpath = "//div[2]/img")
    private WebElementFacade ru_kitchen;
    /////////////////////////////////////
    @FindBy (xpath = "//div[3]/img")
    private WebElementFacade ja_kitchen;
    /////////////////////////////////////
    @FindBy (xpath = "//div[4]/img")
    private WebElementFacade ch_kitchen;
    /////////////////////////////////////
    @FindBy (xpath = "//div[5]/img")
    private WebElementFacade th_kitchen;
    /////////////////////////////////////
    @FindBy (xpath = "//div[6]/img")
    private WebElementFacade it_kitchen;
    /////////////////////////////////////
    @FindBy (xpath = "//div[7]/img")
    private WebElementFacade me_kitchen;
    /////////////////////////////////////
    @FindBy (xpath = "//div[8]/img")
    private WebElementFacade fr_kitchen;
    /////////////////////////////////////
    @FindBy (xpath = "//div[9]/img")
    private WebElementFacade ar_kitchen;
    /////////////////////////////////////
    @FindBy (xpath = "//div[10]/img")
    private WebElementFacade in_kitchen;
    /////////////////////////////////////
    @FindBy (xpath = "//div[11]/img")
    private WebElementFacade gr_kitchen;
    /////////////////////////////////////
    @FindBy (xpath = "//div[12]/img")
    private WebElementFacade ge_kitchen;
    /////////////////////////////////////
    @FindBy(linkText = "Закуски")
    private WebElementFacade snacks;
    /////////////////////////////////////
    @FindBy (linkText = "Первое")
    private WebElementFacade first;
    /////////////////////////////////////
    @FindBy (linkText = "Второе")
    private WebElementFacade twice;
    /////////////////////////////////////
    @FindBy (linkText = "Десерты")
    private WebElementFacade desserts;
    ///////////////////////////////////
    @FindBy (linkText = "Напитки")
    private WebElementFacade drinks;
///////////////////////////////////

    public void choose_recipes(){
        recipes.click();
    }
    /////////////////////////////////////
    public void choose_all_recipes(){
        all_recipes.click();
    }
    ////////////////////////////////////

    public void choose_ua_kitchen(){
        ukr_kitchen.click();
    }
    /////////////////////////////////////
    public void choose_ru_kitchen(){
        ru_kitchen.click();
    }
    /////////////////////////////////////
    public void choose_ja_kitchen(){
        ja_kitchen.click();
    }
    /////////////////////////////////////
    public void choose_ch_kitchen(){
        ch_kitchen.click();
    }
    //////////////////////////////////////
    public void choose_th_kitchen(){
        th_kitchen.click();
    }
    /////////////////////////////////////
    public void choose_it_kitchen(){
        it_kitchen.click();
    }
    /////////////////////////////////////
    public void choose_me_kitchen(){
        me_kitchen.click();
    }
    //////////////////////////////////////
    public void choose_fr_kitchen(){
        fr_kitchen.click();
    }
    /////////////////////////////////////
    public void choose_ar_kitchen(){
        ar_kitchen.click();
    }
    /////////////////////////////////////
    public void choose_in_kitchen(){
        in_kitchen.click();
    }
    //////////////////////////////////////
    public void choose_gr_kitchen(){
        gr_kitchen.click();
    }
    /////////////////////////////////////
    public void choose_ge_kitchen(){
        ge_kitchen.click();
    }
   /////////////////////////////////////
    public void choose_type_of_cuisine_snacks(){
        snacks.click();
    }
    /////////////////////////////////////
    public void choose_type_of_cuisine_first(){
        first.click();
    }
    /////////////////////////////////////
    public void choose_type_of_cuisine_twice(){
        twice.click();
    }
    /////////////////////////////////////
    public void choose_type_of_cuisine_desserts(){
        desserts.click();
    }
    /////////////////////////////////////
    public void choose_type_of_cuisine_drinks(){
        drinks.click();
    }

}
