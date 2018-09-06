package com.blog.blog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController {
    List<Post> posts = new ArrayList<>();

    public PostController() {
        posts.add(new Post("Vacation", "Went on a cruise to the Bahamas."));
        posts.add(new Post("Family", "Going home for my sister's wedding."));
        posts.add(new Post("Friends", "I floated the river with my friends."));
    }

    @GetMapping("/posts")
    public String allPosts(Model viewModel) {
        viewModel.addAttribute("posts", posts);
        return "posts/index";
    }

    @GetMapping("posts/{id}")
    public String individualPost(@PathVariable int id, Model viewModel) {
        Post post = posts.get(id - 1);
        viewModel.addAttribute("post", post);
        return "posts/show";
    }

    @RequestMapping(path = "/posts/create", method = RequestMethod.GET)
    @ResponseBody
    public String create() {
        String createPost = "";
        createPost += "<form action='/posts/create' method='post>";
        createPost += "<div class='form-group'";
        createPost += "<label for='newBlog'><h1>Create A Post</h1></label>";
        createPost += "<textarea id='postInput' rows='4' cols='50'></textarea>";
        createPost += "</div><br><br>";
        createPost += "<input type='submit' class='btn btn-primary'>";
        createPost += "</form>";
        return createPost;
    }

    @RequestMapping(path = "/posts/create", method = RequestMethod.POST)
    @ResponseBody
    public String createNewPost() {
        String newPost = "</h1>This is your new post</h1>";
        return newPost;
    }

}
