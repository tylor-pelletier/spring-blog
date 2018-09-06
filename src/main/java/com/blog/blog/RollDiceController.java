package com.blog.blog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@Controller
public class RollDiceController {

    @GetMapping("/roll-dice")
    public String diceRoll() {
        return "roll-dice";
    }

    @GetMapping("/roll-dice/{guess}")
    public String guessOne(@PathVariable int guess, Model viewModel) {
        Random random = new Random();
        int diceNumber = random.nextInt((6 - 1) + 1) + 1;
        viewModel.addAttribute("guess", guess);
        viewModel.addAttribute("diceNumber", diceNumber);

        return "guess";
    }

}
