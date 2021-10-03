package com.demo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/springmvc")
public class HelloController {
    @RequestMapping("/showForm")
    public String showForm() {
        return "hello-form";
    }

    @RequestMapping("handleForm")
    public String handleForm() {
        return "handleForm";
    }

    @RequestMapping("/testSpringModel")
    public String testSpringModel(@RequestParam("nameTest") String nameTest, Model model) {
        String nameParam = nameTest.toUpperCase();
        String resultName = "Hello " + nameParam;
        model.addAttribute("result", resultName);
        return "handleForm";
    }
}
