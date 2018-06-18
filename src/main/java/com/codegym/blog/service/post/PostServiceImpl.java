package com.codegym.blog.service.post;

import com.codegym.blog.model.Post;
import com.codegym.blog.repository.CategoryRepository;
import com.codegym.blog.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class PostServiceImpl implements PostService {
    @Autowired
    private PostRepository postRepository;

    @Override
    public Page<Post> findAll(Pageable pageable) {
        System.out.println(postRepository.findAll().toString());
        return postRepository.findAll(pageable);
    }

    @Override
    public Page<Post> findAllSummary(Pageable pageable) {
        return postRepository.findAllSummary(pageable);
    }

    @Override
    public Post findById(Long id) {
        return postRepository.findOne(id);
    }

    @Override
    public Post save(Post post) {
        return postRepository.save(post);
    }

    @Override
    public void delete(Long id) {
        postRepository.delete(id);
    }
}
