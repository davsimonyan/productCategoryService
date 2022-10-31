package itspace.am.productcategoryservice.endpoint;

import itspace.am.productcategoryservice.dto.ProductDto;
import itspace.am.productcategoryservice.entity.Product;
import itspace.am.productcategoryservice.mapper.ProductMapper;
import itspace.am.productcategoryservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductEndpoint {
    @Autowired
    private ProductService productService;

    @Autowired
    private ProductMapper productMapper;

    @GetMapping("/product")
    public ResponseEntity<List<ProductDto>> getAllProduct() {
        return ResponseEntity.ok(productService.findAll());
    }
    @PutMapping("/product")
    public ResponseEntity<?> createUpdate(@RequestBody ProductDto productDto) {
        Product updateProduct = productService.update(productMapper.toEntity(productDto));
        return ResponseEntity.ok(updateProduct);
    }


    @PostMapping("/product")
    public ResponseEntity<?> createProduct(@RequestBody ProductDto productDto) {
        Product saveProduct = productService.save(productMapper.toEntity(productDto));
        return ResponseEntity.ok(saveProduct);
    }


    @DeleteMapping("/product/{id}")
    public void deleteProduct(@PathVariable("id") int id) {
        productService.removeById(id);

    }



}
