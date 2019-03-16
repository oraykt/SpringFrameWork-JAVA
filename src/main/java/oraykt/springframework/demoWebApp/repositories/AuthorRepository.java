package oraykt.springframework.demoWebApp.repositories;

/*
 *   oraykt.springframework.demoWebApp.repositories
 *   Created by oraykt on 3/16/19
 *
 */

import oraykt.springframework.demoWebApp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
