package net.local.poc.posts.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.local.poc.posts.model.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
}
