package springtest.blogs.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import springtest.blogs.model.Blog;
import springtest.blogs.model.Category;

public interface BlogService {
    Page<Blog> findAll(Pageable pageable);

    Blog findById(Long id);

    void save(Blog blog);

    void remove(Long id);



    Page<Blog> findAllByNameContaining(String name, Pageable pageable);

    Page<Blog> findAllByCategory(Category category, Pageable pageable);
    Page<Blog> findByCategory_Id(Long id , Pageable pageable);

}