package itspace.am.productcategoryservice.service;

import itspace.am.productcategoryservice.dto.CategoryDto;
import itspace.am.productcategoryservice.entity.Category;
import itspace.am.productcategoryservice.mapper.CategoryMapper;
import itspace.am.productcategoryservice.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    private final CategoryMapper categoryMapper;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository, CategoryMapper categoryMapper) {
        this.categoryRepository = categoryRepository;
        this.categoryMapper = categoryMapper;
    }

    public List<CategoryDto> findAll() {
        List<CategoryDto> categoryDtos = categoryMapper.toDto(categoryRepository.findAll());
        System.out.println(categoryDtos);
        return categoryDtos;
    }

    public Category save(Category category) {
        return categoryRepository.save(category);

    }
    public Category update(Category category) {
        return categoryRepository.save(category);
    }

    public void removeById(int id) {
        categoryRepository.deleteById(id);
    }

}
