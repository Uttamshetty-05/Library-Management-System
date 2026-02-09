package com.example.library;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LibraryController {

    private final BookRepository repo;

    public LibraryController(BookRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("books", repo.findAll());
        return "index";
    }

    @PostMapping("/add")
    public String addBook(@RequestParam String name,
                          @RequestParam String author) {
        repo.save(new Book(name, author));
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        repo.deleteById(id);
        return "redirect:/";
    }
}
