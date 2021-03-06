package com.codegym.blog.service.category;

import com.codegym.blog.model.Category;
import com.codegym.blog.model.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CategoryService {
    Iterable<Category> findAll();

    Category findById(Long id);

    Category save(Category category);

    void delete(Long id);

    Page<Post> findPosts(Category category, Pageable pageable);
}
