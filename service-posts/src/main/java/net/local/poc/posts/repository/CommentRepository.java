package net.local.poc.posts.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.local.poc.posts.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
