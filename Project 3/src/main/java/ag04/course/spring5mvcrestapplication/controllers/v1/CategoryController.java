package ag04.course.spring5mvcrestapplication.controllers.v1;

import ag04.course.spring5mvcrestapplication.api.v1.model.CategoryDTO;
import ag04.course.spring5mvcrestapplication.api.v1.model.CategoryListDTO;
import ag04.course.spring5mvcrestapplication.services.CategoryService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Api(tags = {"categories"})
@RestController
@RequestMapping("/api/v1/categories")
public class CategoryController {
    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public CategoryListDTO getAllCategories(){
        return new CategoryListDTO(categoryService.getAllCategories());
    }

    @GetMapping("{name}")
    @ResponseStatus(HttpStatus.OK)
    public CategoryDTO getCategoryByName( @PathVariable String name){
        return categoryService.getCategoryByName(name);
    }
}
