/*
package com.banjan.llyfr.controller;

import com.banjan.llyfr.model.EBook;
import com.banjan.llyfr.service.EBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    private final EBookService eBookService;

    @Autowired
    public RestController(EBookService eBookService) {
        this.eBookService = eBookService;
    }

    @GetMapping("/api/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("The server is up and running!");
    }

    @PostMapping("/api/ebooks/new")
    public ResponseEntity<EBook> createEBook(@RequestBody EBook newEBook) {
        eBookService.save(newEBook);
        return ResponseEntity.ok(newEBook);
    }

    @GetMapping("/api/ebooks/{id}")
    public ResponseEntity<EBook> getEBook(@PathVariable UUID id) {
        Optional<EBook> eBook = eBookService.findById(id);
        return eBook.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/api/ebooks")
    public ResponseEntity<Page<EBook>> getAllEBooks(@RequestParam(defaultValue = "0") Integer pageNumber) {
        Page<EBook> eBooks = eBookService.findAll(pageNumber, 6);
        return ResponseEntity.ok(eBooks);
    }
}
*/