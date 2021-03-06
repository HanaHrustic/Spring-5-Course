package ag04.springframework.api.v1.model;

import java.util.List;

public class CustomerListDTO {
    List<CustomerDTO> customers;

    public CustomerListDTO(List<CustomerDTO> customers) {
        this.customers = customers;
    }

    public CustomerListDTO() {
    }

    public List<CustomerDTO> getCustomers() {
        return customers;
    }

    public void setCustomers(List<CustomerDTO> customers) {
        this.customers = customers;
    }
}
