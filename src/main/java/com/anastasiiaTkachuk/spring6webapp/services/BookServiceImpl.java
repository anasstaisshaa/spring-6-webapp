package com.anastasiiaTkachuk.spring6webapp.services;

import com.anastasiiaTkachuk.spring6webapp.domain.Book;
import com.anastasiiaTkachuk.spring6webapp.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
}
