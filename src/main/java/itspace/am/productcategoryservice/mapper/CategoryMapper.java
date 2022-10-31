package itspace.am.productcategoryservice.mapper;

import itspace.am.productcategoryservice.dto.CategoryDto;
import itspace.am.productcategoryservice.entity.Category;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper extends EntityMapper<CategoryDto, Category>{

}

