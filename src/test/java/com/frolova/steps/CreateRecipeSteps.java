package com.frolova.steps;

import com.frolova.pages.CreateRecipePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by иарвар on 08.05.2015.
 */
public class CreateRecipeSteps extends ScenarioSteps {
    CreateRecipePage createRecipePage;
    /////////////////////////////////////////
    @Step
    public void is_the_create_recipe_page() {
        createRecipePage.open();
    }
    ///////////////////////////////////////////
    @Step
    public void create_recipe(){

    }
}
