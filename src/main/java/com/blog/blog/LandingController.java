package com.blog.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LandingController {

    @RequestMapping(path = "/", method = RequestMethod.GET)
    @ResponseBody
    private String landingPage() {
        return "<h1>This is the landing page!</h1>";
    }

}
