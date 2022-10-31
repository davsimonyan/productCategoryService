package itspace.am.productcategoryservice.mapper;

import itspace.am.productcategoryservice.dto.ProductDto;
import itspace.am.productcategoryservice.entity.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper extends EntityMapper<ProductDto, Product>{

}

