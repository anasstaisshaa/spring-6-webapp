package com.anastasiiaTkachuk.spring6webapp.services;

import com.anastasiiaTkachuk.spring6webapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();
}
