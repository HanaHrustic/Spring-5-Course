package ag04.course.cookbook.services;

import ag04.course.cookbook.commands.RecipeCommand;
import ag04.course.cookbook.domain.Recipe;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
    void saveAll(List<Recipe> recipes);
    Recipe findById(String l);
    RecipeCommand findCommandById(String l);
    RecipeCommand saveRecipeCommand(RecipeCommand command);
    void deleteById(String idToDelete);
}
