package net.local.poc.comments.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;

import jakarta.transaction.Transactional;
import net.local.poc.comments.model.Comment;
import net.local.poc.comments.model.CommentOutbox;
import net.local.poc.comments.repository.CommentOutboxRepository;
import net.local.poc.comments.repository.CommentRepository;

@Service
public class CommentService {
    
    private final CommentRepository commentRepository;
    private final CommentOutboxRepository commentOutboxRepository;

    public CommentService(CommentRepository commentRepository, CommentOutboxRepository commentOutboxRepository) {
        this.commentRepository = commentRepository;
        this.commentOutboxRepository = commentOutboxRepository;
    }

    public List<Comment> findAll() {
        return commentRepository.findAll();
    }

    @Transactional
    public Comment createComment(Comment comment) throws JsonProcessingException {
        var newComment = commentRepository.save(comment);
        var commentOutbox = new CommentOutbox().fromComment(newComment);
        commentOutboxRepository.save(commentOutbox);

        return newComment;
    }
}
