package ag04.course.springframework5.repositories;

import ag04.course.springframework5.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
