package org.sblm.lib.econtroller;

import org.sblm.lib.dto.Book;
import org.sblm.lib.eservice.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/add")
    public ResponseEntity<String> addNewBook(@RequestBody Book newBook){

        boolean response = adminService.addNewBook(newBook);
        if(response) {
            return ResponseEntity.status(HttpStatus.CREATED).body("Book has been added");
        }else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Server Error");
        }

    }

    @PutMapping("/update")
    public ResponseEntity<String> updateBook(@RequestBody Book oldBook){

        boolean response = adminService.updateBook(oldBook);
        if(response) {
            return ResponseEntity.status(HttpStatus.CREATED).body("Book has been updated");
        }else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Server Error");
        }

    }
}
