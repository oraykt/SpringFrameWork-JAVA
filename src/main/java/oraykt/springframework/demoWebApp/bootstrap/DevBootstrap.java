package oraykt.springframework.demoWebApp.bootstrap;

/*
 *   oraykt.springframework.demoWebApp.bootstrap
 *   Created by oraykt on 3/16/19
 *
 */

import oraykt.springframework.demoWebApp.model.Author;
import oraykt.springframework.demoWebApp.model.Book;
import oraykt.springframework.demoWebApp.repositories.AuthorRepository;
import oraykt.springframework.demoWebApp.repositories.BookRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData(){

        Author eric = new Author("Eric", "Evans");
        Book book1 = new Book("Domain Driven Design", "1234", "Harper Collins");
        eric.getBooks().add(book1);
        book1.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(book1);

        Author rod = new Author("Rod", "Johnson");
        Book book2 = new Book("J2EE Development without EJB", "223344", "Worx");
        rod.getBooks().add(book2);

        authorRepository.save(rod);
        bookRepository.save(book2);
    }
}
