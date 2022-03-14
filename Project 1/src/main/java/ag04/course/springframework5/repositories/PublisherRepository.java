package ag04.course.springframework5.repositories;

import ag04.course.springframework5.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
