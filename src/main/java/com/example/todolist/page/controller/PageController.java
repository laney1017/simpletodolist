package com.example.todolist.page.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//4. html의 이름은 main.html 이고, 주소 입력 시, 바로 나와야 합니다.
@Controller
public class PageController {

    @GetMapping("/")
    public String index() {
        return "main";
    }
}
