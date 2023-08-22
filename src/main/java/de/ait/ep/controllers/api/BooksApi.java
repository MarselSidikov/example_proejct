package de.ait.ep.controllers.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 8/22/2023
 * example_proejct
 *
 * @author Marsel Sidikov (AIT TR)
 */
@RequestMapping("/api/books")
public interface BooksApi {

    @PostMapping
    void addBook();
}
