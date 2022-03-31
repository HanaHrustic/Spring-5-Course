package ag04.course.spring5mvcrestapplication.repositories;

import ag04.course.spring5mvcrestapplication.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
