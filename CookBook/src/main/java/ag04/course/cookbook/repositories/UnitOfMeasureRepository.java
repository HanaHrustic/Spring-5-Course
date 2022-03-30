package ag04.course.cookbook.repositories;

import ag04.course.cookbook.domain.Category;
import ag04.course.cookbook.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, String> {

    Optional<UnitOfMeasure> findByUom(String uom);
}
