package com.frolova.features.recipe;

import com.frolova.steps.RecipeSteps;
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
public class AllRecipesStory {
    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "http://gioia-profiterole.rhcloud.com/")
    public Pages pages;

    @Steps
    public RecipeSteps recipeSteps;

    @Test
    public void view_ua_of_courses(){
        recipeSteps.is_the_recipe_page();
        recipeSteps.view_ua_courses();
        recipeSteps.view_all_type_of_courses();
    }


    @Test
    public void view_ru_of_courses(){
        recipeSteps.is_the_recipe_page();
        recipeSteps.view_ru_courses();
        recipeSteps.view_all_type_of_courses();
    }

    @Test
    public void view_it_of_courses(){
        recipeSteps.is_the_recipe_page();
        recipeSteps.view_it_courses();
        recipeSteps.view_all_type_of_courses();
    }

    @Test
    public void view_ua_me_courses(){
        recipeSteps.is_the_recipe_page();
        recipeSteps.view_me_courses();
        recipeSteps.view_all_type_of_courses();
    }

    @Test
    public void view_fr_of_courses(){
        recipeSteps.is_the_recipe_page();
        recipeSteps.view_fr_courses();
        recipeSteps.view_all_type_of_courses();
    }

    @Test
    public void view_ar_of_courses(){
        recipeSteps.is_the_recipe_page();
        recipeSteps.view_ar_courses();
        recipeSteps.view_all_type_of_courses();
    }

    @Test
    public void view_in_of_courses(){
        recipeSteps.is_the_recipe_page();
        recipeSteps.view_in_courses();
        recipeSteps.view_all_type_of_courses();
    }

    @Test
    public void view_gr_of_courses(){
        recipeSteps.is_the_recipe_page();
        recipeSteps.view_gr_courses();
        recipeSteps.view_all_type_of_courses();
    }

    @Test
    public void view_ge_of_courses(){
        recipeSteps.is_the_recipe_page();
        recipeSteps.view_ge_courses();
        recipeSteps.view_all_type_of_courses();
    }
    @Test
    public void view_ja_of_courses(){
        recipeSteps.is_the_recipe_page();
        recipeSteps.view_ja_courses();
        recipeSteps.view_all_type_of_courses();
    }

    @Test
    public void view_ch_of_courses(){
        recipeSteps.is_the_recipe_page();
        recipeSteps.view_ch_courses();
        recipeSteps.view_all_type_of_courses();
    }
    @Test
    public void view_th_of_courses(){
        recipeSteps.is_the_recipe_page();
        recipeSteps.view_th_courses();
        recipeSteps.view_all_type_of_courses();
    }
}
