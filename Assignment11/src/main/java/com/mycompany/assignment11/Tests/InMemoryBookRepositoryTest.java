/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment11.Tests;

/**
 *
 * @author Uthimna
 */


import domain.Book;
import repositories.inmemory.InMemoryBookRepository;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InMemoryBookRepositoryTest {

    @Test
    void testSaveAndFindById() {
        InMemoryBookRepository repo = new InMemoryBookRepository();
        Book book = new Book("1", "Test Book", "Test Author");
        repo.save(book);

        assertTrue(repo.findById("1").isPresent());
    }

    @Test
    void testDelete() {
        InMemoryBookRepository repo = new InMemoryBookRepository();
        Book book = new Book("2", "Another Book", "Another Author");
        repo.save(book);
        repo.delete("2");

        assertFalse(repo.findById("2").isPresent());
    }
}
