package ag04.course.cookbook.services;

import ag04.course.cookbook.domain.Recipe;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
    void saveAll(List<Recipe> recipes);
}
