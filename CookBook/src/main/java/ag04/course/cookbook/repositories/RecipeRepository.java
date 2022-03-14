package ag04.course.cookbook.repositories;


import ag04.course.cookbook.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
