package ag04.course.cookbook.services;

import ag04.course.cookbook.domain.UnitOfMeasure;
import ag04.course.cookbook.repositories.UnitOfMeasureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UnitOfMeasureServiceImpl implements UnitOfMeasureService {

    private final UnitOfMeasureRepository unitOfMeasureRepository;

    @Autowired
    public UnitOfMeasureServiceImpl(UnitOfMeasureRepository unitOfMeasureRepository) {
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @Override
    public UnitOfMeasure getUnitOfMeasure(String description) {
        return unitOfMeasureRepository
                .findByUom(description)
                .orElseThrow(() -> new RuntimeException("Unit of measure '" + description + "' not found"));
    }
}
