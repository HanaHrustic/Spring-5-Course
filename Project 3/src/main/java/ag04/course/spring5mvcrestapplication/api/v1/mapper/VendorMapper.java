package ag04.course.spring5mvcrestapplication.api.v1.mapper;

import ag04.course.spring5mvcrestapplication.api.v1.model.VendorDTO;
import ag04.course.spring5mvcrestapplication.domain.Vendor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface VendorMapper {
    VendorMapper INSTANCE = Mappers.getMapper(VendorMapper.class);

    VendorDTO vendorToVendorDTO(Vendor vendor);

    Vendor vendorDTOtoVendor(VendorDTO vendorDTO);
}
