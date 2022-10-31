package itspace.am.productcategoryservice.dto;

import itspace.am.productcategoryservice.entity.Category;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDto {

    private int id;
    private String title;
    private int count;
    private double price;
    private Category category;


}
