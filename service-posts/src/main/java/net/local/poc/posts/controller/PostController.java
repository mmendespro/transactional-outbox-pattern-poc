package net.local.poc.posts.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.local.poc.posts.model.Post;
import net.local.poc.posts.repository.PostRepository;

@RestController
@RequestMapping("posts")
public class PostController {
    
    private final PostRepository repository;

    public PostController(PostRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Post> getPostsWithComments() {
        return repository.findAll();
    }

    @PostMapping
    public Post createPost(@RequestBody Post post) {
        return repository.save(post);
    }
}
