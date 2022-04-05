package ag04.course.spring5mvcrestapplication.api.v1.mapper;

import ag04.course.spring5mvcrestapplication.api.v1.model.CategoryDTO;
import ag04.course.spring5mvcrestapplication.domain.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    CategoryDTO categoryToCategoryDTO(Category category);
}
