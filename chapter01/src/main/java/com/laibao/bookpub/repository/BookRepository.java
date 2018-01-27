package com.laibao.bookpub.repository;

import com.laibao.bookpub.entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long>{
    Book findBookByIsbn(String isbn);
}
