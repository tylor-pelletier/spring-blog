package com.blog.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MathController {

    @RequestMapping(path = "/add/{firstNum}/and/{secondNum}")
    @ResponseBody
    public String sum(@PathVariable int firstNum, @PathVariable int secondNum) {
        int sum = firstNum + secondNum;
        return "<h1>" + sum + "</h1>";
    }

    @RequestMapping(path = "/subtract/{firstNum}/from/{secondNum}")
    @ResponseBody
    public String difference(@PathVariable int firstNum, @PathVariable int secondNum) {
        int difference =  secondNum - firstNum;
        return "<h1>" + difference + "</h1>";
    }

    @RequestMapping(path = "/multiply/{firstNum}/and/{secondNum}")
    @ResponseBody
    public String product(@PathVariable int firstNum, @PathVariable int secondNum) {
        int product = firstNum * secondNum;
        return "<h1>" + product + "</h1>";
    }

    @RequestMapping(path = "/divide/{firstNum}/by/{secondNum}")
    @ResponseBody
    public String dividend(@PathVariable int firstNum, @PathVariable int secondNum) {
        int dividend = firstNum / secondNum;
        return "<h1>" + dividend + "</h1>";
    }

}
