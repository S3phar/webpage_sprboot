package com.springwebfirstmaven.webpage.controllers;

import com.springwebfirstmaven.webpage.models.Post;
import com.springwebfirstmaven.webpage.repo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @Autowired
    private PostRepository postRepository;

    @GetMapping("/news")
    public String newsMain(Model model) {
        Iterable<Post> posts = postRepository.findAll();
        model.addAttribute("post",posts);
        return "newsmain";
    }
}
