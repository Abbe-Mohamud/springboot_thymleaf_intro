package se.lexicon.abbe.springboot_thymleaf_intro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @GetMapping(value = {"-","/"})
    public String home(
            @RequestParam(name = "message", defaultValue = "HELLO FROM INSIDE THE CONTROLLER") String message, Model model){

        model.addAttribute("message", message);


        return "home";
    }

    @RequestMapping(value = "secondpage", method = RequestMethod.GET)
    public String second(){

        return "second";

    }


}
