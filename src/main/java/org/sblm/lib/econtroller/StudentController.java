package org.sblm.lib.econtroller;

import org.sblm.lib.dto.Book;
import org.sblm.lib.eservice.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/stu")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    @RequestMapping("/user")
    public String hello() {
        return "Hello UserService";
    }

    @GetMapping("/display")
    public ResponseEntity displayBooks() {
        List<Book> books = studentService.displayBook();
        return ResponseEntity.ok().body(books);
    }


}
