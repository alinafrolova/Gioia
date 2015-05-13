package com.frolova.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

/**
 * Created by иарвар on 08.05.2015.
 */
@DefaultUrl("http://gioia-profiterole.rhcloud.com/")
public class CreateRecipePage  extends PageObject {
    @FindBy(linkText = "Рецепты")
    private WebElementFacade recipes;
    /////////////////////////////////////
    @FindBy (linkText = "Создать рецепт")
    private WebElementFacade create_recipe;
    /////////////////////////////////////
    @FindBy (id = "back")
    private WebElementFacade back;
    ////////////////////////////////////
    @FindBy (name = "title")
    private WebElementFacade title_recipe;
    ////////////////////////////////////
    @FindBy (name = "description")
    private WebElementFacade description;
    ///////////////////////////////////
    @FindBy (name = "cookingTimeHours")
    private WebElementFacade timeHours;
    ///////////////////////////////////
    @FindBy (name = "cookingTimeMinutes")
    private WebElementFacade timeMinutes;
    ///////////////////////////////////
    @FindBy (name = "quantityOfDish")
    private WebElementFacade quantityOfDish;
    ///////////////////////////////////
    @FindBy (name = "cuisineId")
    private WebElementFacade cuisineId;
    ///////////////////////////////////
    @FindBy (name = "categoryId")
    private WebElementFacade categoryId;
    ///////////////////////////////////
    @FindBy (name = "markersNames[1]")
    private WebElementFacade markersNames1;
    //////////////////////////////////
    @FindBy (id = "ingredientsNameList[0]")
    private WebElementFacade ingredientsNameList;
    ////////////////////////////////////
    @FindBy (name = "markersNames[1]")
    private WebElementFacade title;
    ////////////////////////////////////
    @FindBy (id = "ingredientsCountList[0]")
    private WebElementFacade ingredientsCountList;
    ////////////////////////////////////
    @FindBy (id = "adding")
    private WebElementFacade adding_ingridient;
    ////////////////////////////////////
    @FindBy (id = "ingredientsNameList[1]")
    private WebElementFacade ingredientsNameList1;
    ////////////////////////////////////
    @FindBy (id = "ingredientsCountList[1]")
    private WebElementFacade ingredientsCountList1;
    ////////////////////////////////////
    @FindBy (id = "add")
    private WebElementFacade addStep;
    ///////////////////////////////////
    @FindBy (name = "complexity")
    private WebElementFacade complexity;
    ///////////////////////////////////
    @FindBy (name = "stepsList[0]")
    private WebElementFacade stepsList;
    ///////////////////////////////////
    @FindBy (id = "OK")
    private WebElementFacade submit;
    ////////////////////////////////////
    public void choose_recipes(){
        recipes.click();
    }
    /////////////////////////////////////

    public void choose_create_recipe(){
        create_recipe.click();
    }
    //////////////////////////////////////
    public void add_title_recipe(String title){
        title_recipe.sendKeys(title);
    }
    ////////////////////////////////////
    public void add_description (String descript){
        description.sendKeys(descript);
    }
    //////////////////////////////////////
    public void add_time_hours(String hours){
        timeHours.sendKeys(hours);
    }
    ////////////////////////////////////
    public void add_time_minutes (String minutes){
        timeMinutes.sendKeys(minutes);
    }
    //////////////////////////////////////
    public void add_quantityOfDish(String quantity){
        quantityOfDish.sendKeys(quantity);
    }
    ////////////////////////////////////
    public void select_cuisineId(String cuisine){
        cuisineId.sendKeys(cuisine);
    }
    //////////////////////////////////////
    public void select_categoryId(String category ){
        categoryId.sendKeys(category);
    }
    ////////////////////////////////////
    public void add_markersNames1 (String markersN1){
        markersNames1.sendKeys(markersN1);
    }
    //////////////////////////////////////
    public void add_ingredientsNameList0(String ingridientsN0){
        ingredientsNameList.sendKeys(ingridientsN0);
    }
    ////////////////////////////////////
    public void add_ingredientsCountList0 (String ingridientsC0){
        ingredientsCountList.sendKeys(ingridientsC0);
    }
    ////////////////////////////////////
    public void adding_ingridient(){
        adding_ingridient.click();
    }
    //////////////////////////////////////
    public void select_complexity(String complex){
        complexity.sendKeys(complex);
    }
    ////////////////////////////////////
    public void add_stepsList (String steps){
        stepsList.sendKeys(steps);
    }
    ////////////////////////////////////
    public void add_step(){
        addStep.click();
    }
    //////////////////////////////////////
    public void submitOK(){
        submit.click();
    }
    //////////////////////////////////////
    public void add_ingredientsNameList1(String ingridientsN1){
        ingredientsNameList1.sendKeys(ingridientsN1);
    }
    ////////////////////////////////////
    public void add_ingredientsCountList1 (String ingridientsC1){
        ingredientsCountList1.sendKeys(ingridientsC1);
    }
    ////////////////////////////////////
}
