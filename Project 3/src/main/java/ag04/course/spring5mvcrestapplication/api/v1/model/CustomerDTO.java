package ag04.course.spring5mvcrestapplication.api.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

public class CustomerDTO {

    @ApiModelProperty(value = "This is the first name", required = true)
    private String firstname;
    private String lastname;

    @JsonProperty("customer_url")
    private String customerUrl;

    public CustomerDTO() {
    }

    public CustomerDTO(String firstname, String lastname, String customerUrl) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.customerUrl = customerUrl;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCustomerUrl() {
        return customerUrl;
    }

    public void setCustomerUrl(String customerUrl) {
        this.customerUrl = customerUrl;
    }
}
