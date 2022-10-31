package itspace.am.productcategoryservice.service;

import itspace.am.productcategoryservice.dto.ProductDto;
import itspace.am.productcategoryservice.entity.Product;
import itspace.am.productcategoryservice.mapper.ProductMapper;
import itspace.am.productcategoryservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    private final ProductMapper productMapper;

    @Autowired
    public ProductService(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    public List<ProductDto> findAll() {
        List<ProductDto> productDtos = productMapper.toDto(productRepository.findAll());
        System.out.println(productDtos);
        return productDtos;
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public void removeById(int id) {
        productRepository.deleteById(id);
    }

    public Product update(Product product) {
        return productRepository.save(product);
    }

}
