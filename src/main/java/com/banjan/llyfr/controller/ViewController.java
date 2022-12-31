package com.banjan.llyfr.controller;

import com.banjan.llyfr.model.EBook;
import com.banjan.llyfr.service.EBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.UUID;

@Controller
public class ViewController {

    private final EBookService eBookService;

    @Autowired
    public ViewController(EBookService eBookService) {
        this.eBookService = eBookService;
    }

    @GetMapping({"/", "/index"})
    public String index() {
        return "index";
    }

    @GetMapping("/ebooks")
    public String ebooks(@RequestParam(defaultValue = "0") Integer pageNumber, Model model) {

        Page<EBook> eBooks = eBookService.findAll(pageNumber, 6);


        model.addAttribute("ebooks", eBooks.getContent()); // pass the list of ebooks to the template
        model.addAttribute("page", eBooks);

        return "eBooks";
    }

    @GetMapping("/ebook")
    public String ebook(@RequestParam UUID id, Model model) {
        EBook eBook = eBookService.findById(id).orElseThrow();
        model.addAttribute("ebook", eBook);
        return "eBook";
    }

}
