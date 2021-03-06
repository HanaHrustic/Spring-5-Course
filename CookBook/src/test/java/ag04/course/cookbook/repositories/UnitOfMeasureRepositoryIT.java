package ag04.course.cookbook.repositories;

import ag04.course.cookbook.bootstrap.RecipeBootstrap;
import ag04.course.cookbook.domain.UnitOfMeasure;
import ag04.course.cookbook.services.CategoryService;
import ag04.course.cookbook.services.RecipeService;
import ag04.course.cookbook.services.UnitOfMeasureService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataMongoTest
public class UnitOfMeasureRepositoryIT {

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    RecipeRepository recipeRepository;

    @Autowired
    CategoryService categoryService;

    @Autowired
    RecipeService recipeService;

    @Autowired
    UnitOfMeasureService unitOfMeasureService;

    @Autowired
    UnitOfMeasureRepository unitOfMeasureRepository;

    @Before
    public void setUp() throws Exception {

        recipeRepository.deleteAll();
        unitOfMeasureRepository.deleteAll();
        categoryRepository.deleteAll();


        RecipeBootstrap recipeBootstrap = new RecipeBootstrap( categoryRepository,  recipeRepository,  unitOfMeasureRepository,  categoryService,  recipeService,  unitOfMeasureService);

        recipeBootstrap.onApplicationEvent(null);
    }

    @Test
    public void findByDescription() throws Exception {

        Optional<UnitOfMeasure> uomOptional = unitOfMeasureRepository.findByUom("TeaSpoon");

        assertEquals("TeaSpoon", uomOptional.get().getUom());
    }

    @Test
    public void findByDescriptionCup() throws Exception {

        Optional<UnitOfMeasure> uomOptional = unitOfMeasureRepository.findByUom("Cup");

        assertEquals("Cup", uomOptional.get().getUom());
    }
}