package oraykt.springframework.demoWebApp.repositories;

/*
 *   oraykt.springframework.demoWebApp.repositories
 *   Created by oraykt on 3/16/19
 *
 */

import oraykt.springframework.demoWebApp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
