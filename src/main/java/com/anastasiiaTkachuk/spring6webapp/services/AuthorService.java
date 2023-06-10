package com.anastasiiaTkachuk.spring6webapp.services;

import com.anastasiiaTkachuk.spring6webapp.domain.Author;
import com.anastasiiaTkachuk.spring6webapp.domain.Book;

public interface AuthorService {

    Iterable<Author> findAll();
}
