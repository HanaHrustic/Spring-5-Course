package ag04.springframework.api.v1.model;

import java.util.List;

public class VendorListDTO {
    List<VendorDTO> vendors;

    public VendorListDTO(List<VendorDTO> vendors) {
        this.vendors = vendors;
    }

    public VendorListDTO() {
    }

    public List<VendorDTO> getVendors() {
        return vendors;
    }

    public void setVendors(List<VendorDTO> vendors) {
        this.vendors = vendors;
    }
}
