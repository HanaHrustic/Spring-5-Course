package ag04.course.cookbook.domain;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.lang.annotation.Documented;
import java.util.Set;

@Getter
@Setter
@Document
public class UnitOfMeasure {
    @Id
    private String id;
    private String uom;
}
