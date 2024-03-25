package net.local.poc.comments.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.local.poc.comments.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
