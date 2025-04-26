/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment11.repositories.repositories.database;

/**
 *
 * @author Uthimna
 */


import domain.Book;
import repositories.BookRepository;

import java.util.List;
import java.util.Optional;

public class DatabaseBookRepository implements BookRepository {

    @Override
    public void save(Book entity) {
        // TODO: Implement database save logic
    }

    @Override
    public Optional<Book> findById(String id) {
        // TODO: Implement database find logic
        return Optional.empty();
    }

    @Override
    public List<Book> findAll() {
        // TODO: Implement database find all logic
        return List.of();
    }

    @Override
    public void delete(String id) {
        // TODO: Implement database delete logic
    }
}
