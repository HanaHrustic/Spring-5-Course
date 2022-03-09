package ag04.course.springframework5.repositories;

import ag04.course.springframework5.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
