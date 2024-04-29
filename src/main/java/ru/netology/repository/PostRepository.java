package ru.netology.repository;

import ru.netology.exception.NotFoundException;
import ru.netology.model.Post;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

// Stub
public class PostRepository {
    private static final ConcurrentHashMap<Long, Post> postMap = new ConcurrentHashMap<>();
    public List<Post> all() {
        return Collections.emptyList();
    }

    public Optional<Post> getById(long id) {
        return Optional.empty();
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
