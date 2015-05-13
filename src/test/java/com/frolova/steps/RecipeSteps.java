package com.frolova.steps;

import com.frolova.pages.RecipePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by иарвар on 07.05.2015.
 */
public class RecipeSteps extends ScenarioSteps {
    RecipePage recipePage;
    /////////////////////////////////////////
    @Step
    public void is_the_recipe_page() {
        recipePage.open();
    }
    ///////////////////////////////////////////
    @Step
    public void view_all_type_of_courses(){
        recipePage.choose_type_of_cuisine_snacks();
        recipePage.choose_type_of_cuisine_snacks();
        recipePage.choose_type_of_cuisine_first();
        recipePage.choose_type_of_cuisine_twice();
        recipePage.choose_type_of_cuisine_desserts();
        recipePage.choose_type_of_cuisine_drinks();
    }
    //////////////////////////////////////////
    @Step
    public void view_ua_courses(){
        recipePage.choose_recipes();
        recipePage.choose_all_recipes();
        recipePage.choose_ua_kitchen();
    }
    //////////////////////////////////////////
    @Step
    public void view_ru_courses(){
        recipePage.choose_recipes();
        recipePage.choose_all_recipes();
        recipePage.choose_ru_kitchen();
    }
    @Step
    public void view_ja_courses(){
        recipePage.choose_recipes();
        recipePage.choose_all_recipes();
        recipePage.choose_ja_kitchen();
    }
    @Step
    public void view_ch_courses(){
        recipePage.choose_recipes();
        recipePage.choose_all_recipes();
        recipePage.choose_ch_kitchen();
    }
    @Step
    public void view_th_courses(){
        recipePage.choose_recipes();
        recipePage.choose_all_recipes();
        recipePage.choose_th_kitchen();
    }
    @Step
    public void view_it_courses(){
        recipePage.choose_recipes();
        recipePage.choose_all_recipes();
        recipePage.choose_it_kitchen();
    }
    @Step
    public void view_me_courses(){
        recipePage.choose_recipes();
        recipePage.choose_all_recipes();
        recipePage.choose_me_kitchen();
    }
    @Step
    public void view_ar_courses(){
        recipePage.choose_recipes();
        recipePage.choose_all_recipes();
        recipePage.choose_ar_kitchen();
    }
    @Step
    public void view_in_courses(){
        recipePage.choose_recipes();
        recipePage.choose_all_recipes();
        recipePage.choose_in_kitchen();
    }
    @Step
    public void view_fr_courses(){
        recipePage.choose_recipes();
        recipePage.choose_all_recipes();
        recipePage.choose_fr_kitchen();
    }
    @Step
    public void view_gr_courses(){
        recipePage.choose_recipes();
        recipePage.choose_all_recipes();
        recipePage.choose_gr_kitchen();
    }
    @Step
    public void view_ge_courses(){
        recipePage.choose_recipes();
        recipePage.choose_all_recipes();
        recipePage.choose_ge_kitchen();
    }

}
