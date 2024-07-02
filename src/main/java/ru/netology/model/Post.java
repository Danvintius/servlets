package ru.netology.model;

import java.util.concurrent.atomic.AtomicLong;

public class Post {
    private AtomicLong id;
    private String content;

    public Post() {
    }


    public Post(String content) {

    }

    public Long getId() {
        return id;
    }

    public void setId(AtomicLong id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
