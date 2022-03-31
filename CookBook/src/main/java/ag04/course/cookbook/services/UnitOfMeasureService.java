package ag04.course.cookbook.services;

import ag04.course.cookbook.commands.UnitOfMeasureCommand;
import ag04.course.cookbook.domain.UnitOfMeasure;

import java.util.Set;

public interface UnitOfMeasureService {
    UnitOfMeasure getUnitOfMeasure(String description);
    Set<UnitOfMeasureCommand> listAllUoms();
}
