package com.anastasiiaTkachuk.spring6webapp.repository;

import com.anastasiiaTkachuk.spring6webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
