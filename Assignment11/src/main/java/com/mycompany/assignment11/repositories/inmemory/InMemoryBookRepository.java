/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment11.repositories.inmemory;

/**
 *
 * @author Uthimna
 */


import domain.Book;
import repositories.BookRepository;

import java.util.*;

public class InMemoryBookRepository implements BookRepository {
    private Map<String, Book> storage = new HashMap<>();

    @Override
    public void save(Book book) {
        storage.put(book.getId(), book);
    }

    @Override
    public Optional<Book> findById(String id) {
        return Optional.ofNullable(storage.get(id));
    }

    @Override
    public List<Book> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public void delete(String id) {
        storage.remove(id);
    }
}

