package ag04.course.cookbook.services;

import ag04.course.cookbook.domain.UnitOfMeasure;
import ag04.course.cookbook.repositories.UnitOfMeasureRepository;

public interface UnitOfMeasureService {
    UnitOfMeasure getUnitOfMeasure(String description);
}
