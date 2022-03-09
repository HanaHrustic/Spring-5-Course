package ag04.course.springframework5.bootstrap;

import ag04.course.springframework5.domain.Author;
import ag04.course.springframework5.domain.Book;
import ag04.course.springframework5.domain.Publisher;
import ag04.course.springframework5.repositories.AuthorRepository;
import ag04.course.springframework5.repositories.BookRepository;
import ag04.course.springframework5.repositories.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    @Autowired
    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Started in Bootstrap");

        Author ericEvans = new Author("Eric", "Evans");
        Book domainDrivenDesign = new Book("Domain Driven Design", "123123");
        ericEvans.getBooks().add(domainDrivenDesign);
        domainDrivenDesign.getAuthors().add(ericEvans);

        authorRepository.save(ericEvans);
        bookRepository.save(domainDrivenDesign);

        Author rodJohnson = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "321321");
        rodJohnson.getBooks().add(noEJB);
        noEJB.getAuthors().add(rodJohnson);

        authorRepository.save(rodJohnson);
        bookRepository.save(noEJB);

        System.out.println("Number of Books: " + bookRepository.count());

        Publisher somePublisher = new Publisher("somePublisher", "Some Road 11", "Sim City", "1");
        somePublisher.getBooks().add(domainDrivenDesign);
        somePublisher.getBooks().add(noEJB);

        publisherRepository.save(somePublisher);
        System.out.println("Number of Publishers: " + publisherRepository.count());

        System.out.println(somePublisher.getName() + " has published " + somePublisher.getBooks().size() + " books.");
    }
}
