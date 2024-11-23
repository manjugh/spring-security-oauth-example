package com.mgh.resource.message.api;

import jakarta.validation.constraints.NotEmpty;

import java.time.Instant;

public class Message {
    private Long id;
    @NotEmpty
    private String content;
    @NotEmpty
    private String createdBy;
    private Instant createdAt;

    public Message(Long id, String content, String createdBy, Instant createdAt) {
        this.id = id;
        this.content = content;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotEmpty String getContent() {
        return content;
    }

    public void setContent(@NotEmpty String content) {
        this.content = content;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public @NotEmpty String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(@NotEmpty String createdBy) {
        this.createdBy = createdBy;
    }
// constructors
    // setters and getters
}
