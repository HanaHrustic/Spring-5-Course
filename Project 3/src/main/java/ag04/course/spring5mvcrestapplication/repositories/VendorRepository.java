package ag04.course.spring5mvcrestapplication.repositories;

import ag04.course.spring5mvcrestapplication.domain.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepository extends JpaRepository<Vendor, Long> {
}
