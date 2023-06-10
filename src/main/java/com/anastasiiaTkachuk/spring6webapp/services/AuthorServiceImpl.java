package com.anastasiiaTkachuk.spring6webapp.services;

import com.anastasiiaTkachuk.spring6webapp.domain.Author;
import com.anastasiiaTkachuk.spring6webapp.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    @Override
    public Iterable<Author> findAll() {
        return authorRepository.findAll();
    }
}
