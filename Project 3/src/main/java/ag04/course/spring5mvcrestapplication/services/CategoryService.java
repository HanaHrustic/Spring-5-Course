package ag04.course.spring5mvcrestapplication.services;

import ag04.course.spring5mvcrestapplication.api.v1.model.CategoryDTO;

import java.util.List;

public interface CategoryService {
    List<CategoryDTO> getAllCategories();
    CategoryDTO getCategoryByName(String name);
}
