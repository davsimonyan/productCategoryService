package itspace.am.productcategoryservice.repository;

import itspace.am.productcategoryservice.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
