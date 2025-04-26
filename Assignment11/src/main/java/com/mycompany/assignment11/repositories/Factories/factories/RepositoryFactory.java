/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment11.repositories.Factories.factories;

/**
 *
 * @author Uthimna
 */

import repositories.BookRepository;
import repositories.inmemory.InMemoryBookRepository;

public class RepositoryFactory {
    public static BookRepository getBookRepository(String storageType) {
        switch (storageType) {
            case "MEMORY":
                return new InMemoryBookRepository();
            // case "DATABASE": return new DatabaseBookRepository(); // Future
            default:
                throw new IllegalArgumentException("Invalid storage type: " + storageType);
        }
    }
}
