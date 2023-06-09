package com.anastasiiaTkachuk.spring6webapp.repository;

import com.anastasiiaTkachuk.spring6webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
