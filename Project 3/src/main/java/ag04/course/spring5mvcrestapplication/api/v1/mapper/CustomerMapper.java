package ag04.course.spring5mvcrestapplication.api.v1.mapper;

import ag04.course.spring5mvcrestapplication.api.v1.model.CustomerDTO;
import ag04.course.spring5mvcrestapplication.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    CustomerDTO customerToCustomerDTO(Customer customer);

    Customer customerDtoToCustomer(CustomerDTO customerDTO);
}
