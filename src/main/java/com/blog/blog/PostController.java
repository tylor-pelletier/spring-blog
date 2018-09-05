package com.blog.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    @RequestMapping(path = "/posts")
    @ResponseBody
    private String posts() {
        return "<h1>Posts</h1>";
    }

    @RequestMapping(path = "/posts/{id}")
    @ResponseBody
    private String individualPost(
            @PathVariable int id
    ) {
        return "<h1>Posts from user " + id + "</h1>";
    }

    @RequestMapping(path = "/posts/create", method = RequestMethod.GET)
    @ResponseBody
    private String create() {
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
    private String createNewPost() {
        String newPost = "</h1>This is your new post</h1>";
        return newPost;
    }

}
