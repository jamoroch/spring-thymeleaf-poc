package com.example.uidemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
@RequestMapping("/ui")
public class SimpleController {

@Value("${spring.application.name}")
    private String appName;

@RequestMapping("/")
    public String homePage(Model model) {
    model.addAttribute("appName", appName);
    model.addAttribute("content",  new Content());
    return "home";
}

@RequestMapping(value = "/start", params = "start")
public String start(@Valid Content content,  BindingResult bindingResult, ModelMap model) {

    if (bindingResult.hasErrors()) {
        return "home";
    }
    model.clear();
    System.out.println("Started reached! content: " + content);
    return "redirect:/ui";
}

@RequestMapping(value = "/download")
public void json(HttpServletRequest request, HttpServletResponse response) throws IOException {
    response.setContentType("application/json");
    response.addHeader("Content-Disposition", "attachment; filename=download.json");
    String report = "{\"download\": 42}";
    PrintWriter out = response.getWriter();
    out.write(report);
}

@RequestMapping("/throwMe")
    public String throwMe(Model model) {
        model.addAttribute("appName", appName);
        throwException();
        return "home";
    }

    private String throwException() {
        throw new RuntimeException("this is a test");
    }

}
