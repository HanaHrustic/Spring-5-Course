package ag04.course.spring5mvcrestapplication.api.v1.mapper;

import ag04.springframework.api.v1.mapper.CustomerMapper;
import ag04.springframework.domain.Customer;
import ag04.springframework.model.CustomerDTO;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerMapperTest {
    public static final String FIRSTNAME = "Jimmy";
    public static final String LASTNAME = "Fallon";
    CustomerMapper customerMapper = CustomerMapper.INSTANCE;

    @Test
    public void customerToCustomerDTO() throws Exception {
        //given
        Customer customer = new Customer();
        customer.setFirstname(FIRSTNAME);
        customer.setLastname(LASTNAME);

        //when
        CustomerDTO customerDTO = customerMapper.customerToCustomerDTO(customer);

        //then
        assertEquals(FIRSTNAME, customerDTO.getFirstname());
        assertEquals(LASTNAME, customerDTO.getLastname());
    }
}