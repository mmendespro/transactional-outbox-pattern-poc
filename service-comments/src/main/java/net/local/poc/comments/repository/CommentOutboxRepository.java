package net.local.poc.comments.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.local.poc.comments.model.CommentOutbox;

public interface CommentOutboxRepository extends JpaRepository<CommentOutbox, Long> {
}
