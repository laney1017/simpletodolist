package com.example.todolist.todo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class TodoController {

    private ArrayList<String> todoList = new ArrayList<>();
    // 1. GET방식의 /list  요청으로 할 일의 ArrayList<String> 을 JSON Ajax방식으로 화면으로 가져 갑니다.
    @GetMapping("/list")
    public ArrayList<String> list() {
        return todoList;
    }
    // 2. GET방식의 /receiveList 요청으로 할 일을 등록합니다.
    // 파라미터의 이름은 todo(String)입니다. 등록이 완료된 후에 1번과 같은 응답을 주세요.
    // 중복이 안되게 처리해주세요.
    @GetMapping("/receiveList")
    public ArrayList<String> receiveList(String todo) {
        todoList.add(todo);
        return todoList;
    }
    // 3. GET방식의 /deleteList 요청으로 할 일을 삭제 합니다.
    // 파라미터의 이름은 todo(Integer) 입니다. 리스트의 순번입니다. 삭제가 완료된 후에 1번과 같은 응답을 주세요.
    @GetMapping("/deleteList")
    public ArrayList<String> deleteList(int todo) {
        todoList.remove(todo);
        return todoList;
    }
}
