package ag04.course.spring5mvcrestapplication.repositories;

import ag04.course.spring5mvcrestapplication.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByName(String name);
}
