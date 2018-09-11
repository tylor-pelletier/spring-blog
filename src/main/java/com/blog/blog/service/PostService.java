package com.blog.blog.service;

import com.blog.blog.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    private List<Post> posts;

    public PostService() {
        posts = new ArrayList<>();
        createStarterPosts();
    }

    public Post findOne(long id) {
        return posts.get((int) id - 1);
    }

    public List<Post> findAll() {
        return posts;
    }

    public void save(Post post) {
        post.setId(posts.size() + 1);
        posts.add(post);
    }

    private void createStarterPosts() {
        posts.add(new Post("Vacation","Went on a cruise to the Bahamas."));
        posts.add(new Post("Family","Going home for my sister's wedding."));
        posts.add(new Post("Friends","Floated the river with my friends."));
    }
}
