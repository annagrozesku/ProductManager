package ru.netology.productManager.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.productManager.domain.*;

public class ProductRepositoryTest {

    ProductRepository repo = new ProductRepository();

    Book book1 = new Book(221, "It", 150, "S. King");
    Book book2 = new Book(724, "Harry Potter and the Half-Blood Prince", 500, "J. Rowling");
    Book book3 = new Book(351, "Harry Potter and the Deathly Hallows", 200, "J. Rowling");
    Smartphone smartphone1 = new Smartphone(221, "Iphone 11", 53_000, "Apple");

    @Test
    public void shouldAddProducts() {

        repo.save(book2);
        repo.save(book3);
        repo.save(smartphone1);

        Product[] actual = repo.findAll();
        Product[] expected = {book2, book3, smartphone1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldShowAnErrorMessage() {

        repo.save(book1);
        repo.save(book2);
        repo.save(book3);

        Assertions.assertThrows(AlreadyExistException.class, () -> {
            repo.save(smartphone1);
        });
    }

}
