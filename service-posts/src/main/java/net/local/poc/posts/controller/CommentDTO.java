package net.local.poc.posts.controller;

import com.fasterxml.jackson.annotation.JsonProperty;

public record CommentDTO (Long id, String text, @JsonProperty("post_id") Long postId) {
}
