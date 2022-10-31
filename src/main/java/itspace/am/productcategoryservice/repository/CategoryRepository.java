package itspace.am.productcategoryservice.repository;

import itspace.am.productcategoryservice.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
