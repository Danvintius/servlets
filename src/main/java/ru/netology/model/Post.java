package ru.netology.model;

import java.util.concurrent.atomic.AtomicLong;

public class Post {
    private long id;
    private String content;
    private AtomicLong idCounter = new AtomicLong(0);
    public Post() {
    }

    public Post(long id, String content) {
        this.id = idCounter.getAndIncrement();
        this.content = content;
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
