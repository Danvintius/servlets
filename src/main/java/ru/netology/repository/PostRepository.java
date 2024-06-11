package ru.netology.repository;

import ru.netology.exception.NotFoundException;
import ru.netology.model.Post;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

// Stub
public class PostRepository {
    private final ConcurrentHashMap<Long, Post> postMap = new ConcurrentHashMap<>();
    public List<Post> all() {
        if (postMap.isEmpty()) {
            throw new NotFoundException("Список постов пуст");
        }
        List<Post> data = new ArrayList<>();
        for (Map.Entry<Long, Post> entry : postMap.entrySet()) {
            data.add(entry.getValue());
        }
        return data;
    }

    public Optional<Post> getById(long id) {
        if (postMap.containsKey(id)) {
            return Optional.ofNullable(postMap.get(id));
        }
        throw new NotFoundException("Неверный ID поста");
    }

    public Post save(Post post) {
        if (postMap.containsKey(post.getId())) {
            postMap.put(post.getId(), post);
        } else {
            Post newPost = new Post(post.getContent());
            postMap.put(newPost.getId(), newPost);
            return newPost;
        }
        return post;
    }

    public void removeById(long id) {
        if (posts.containsKey(id)) {
            posts.remove(id);
        } else {
            throw new NotFoundException("Не найден элемент с id - " + id);
        }
    }
}
