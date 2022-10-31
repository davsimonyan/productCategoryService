package itspace.am.productcategoryservice.endpoint;

import itspace.am.productcategoryservice.dto.CategoryDto;
import itspace.am.productcategoryservice.entity.Category;
import itspace.am.productcategoryservice.mapper.CategoryMapper;
import itspace.am.productcategoryservice.repository.CategoryRepository;
import itspace.am.productcategoryservice.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryEndpoint {
    @Autowired
    private CategoryService categoryService;

    @Autowired
    private CategoryMapper categoryMapper;

    @GetMapping("/category")
    public ResponseEntity<List<CategoryDto>> getAllCategory() {
        return ResponseEntity.ok(categoryService.findAll());
    }

    @PutMapping("/category")
    public ResponseEntity<?> createUpdate(@RequestBody CategoryDto categoryDto) {
        Category updateCategory = categoryService.update(categoryMapper.toEntity(categoryDto));
        return ResponseEntity.ok(updateCategory);
    }
    

        @PostMapping("/category")
    public ResponseEntity<?> createCategory(@RequestBody CategoryDto categoryDto) {
        Category saveCategory = categoryService.save(categoryMapper.toEntity(categoryDto));
        return ResponseEntity.ok(saveCategory);
    }


    @DeleteMapping("/category/{id}")
    public void deleteCategory(@PathVariable("id") int id) {
        categoryService.removeById(id);

    }


}
