import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductManagerTest {

    @Test
    public void shouldAddSomeProducts() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);

        Book book1 = new Book(552, "It", 150,"S. King");
        Book book2 = new Book(724, "Harry Potter and the Half-Blood Prince",500, "J. Rowling");
        Book book3 = new Book(351, "Harry Potter and the Deathly Hallows", 200, "J. Rowling");
        Book book4 = new Book(112, "The Little Prince", 350, "A. Exupery");
        Smartphone smartphone1 = new Smartphone(221, "Iphone 11", 53_000, "Apple");
        Smartphone smartphone2 = new Smartphone(429,"Samsung A22", 60_000, "Samsung");
        Smartphone smartphone3 = new Smartphone(534, "Redmi Note 11", 70_000, "Xiaomi");

        manager.add(book2);
        manager.add(book3);
        manager.add(smartphone1);

        Product[] actual = manager.findAll();
        Product[] expected = {book2, book3, smartphone1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddOneProduct() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);

        Book book1 = new Book(552, "It", 150,"S. King");
        Book book2 = new Book(724, "Harry Potter and the Half-Blood Prince",500, "J. Rowling");
        Book book3 = new Book(351, "Harry Potter and the Deathly Hallows", 200, "J. Rowling");
        Book book4 = new Book(112, "The Little Prince", 350, "A. Exupery");
        Smartphone smartphone1 = new Smartphone(221, "Iphone 11", 53_000, "Apple");
        Smartphone smartphone2 = new Smartphone(429,"Samsung A22", 60_000, "Samsung");
        Smartphone smartphone3 = new Smartphone(534, "Redmi Note 11", 70_000, "Xiaomi");

        manager.add(smartphone1);

        Product[] actual = manager.findAll();
        Product[] expected = {smartphone1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNotAddProduct() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);

        Book book1 = new Book(552, "It", 150,"S. King");
        Book book2 = new Book(724, "Harry Potter and the Half-Blood Prince",500, "J. Rowling");
        Book book3 = new Book(351, "Harry Potter and the Deathly Hallows", 200, "J. Rowling");
        Book book4 = new Book(112, "The Little Prince", 350, "A. Exupery");
        Smartphone smartphone1 = new Smartphone(221, "Iphone 11", 53_000, "Apple");
        Smartphone smartphone2 = new Smartphone(429,"Samsung A22", 60_000, "Samsung");
        Smartphone smartphone3 = new Smartphone(534, "Redmi Note 11", 70_000, "Xiaomi");

        Product[] actual = manager.findAll();
        Product[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldRemovedById() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);

        Book book1 = new Book(552, "It", 150,"S. King");
        Book book2 = new Book(724, "Harry Potter and the Half-Blood Prince",500, "J. Rowling");
        Book book3 = new Book(351, "Harry Potter and the Deathly Hallows", 200, "J. Rowling");
        Book book4 = new Book(112, "The Little Prince", 350, "A. Exupery");
        Smartphone smartphone1 = new Smartphone(221, "Iphone 11", 53_000, "Apple");
        Smartphone smartphone2 = new Smartphone(429,"Samsung A22", 60_000, "Samsung");
        Smartphone smartphone3 = new Smartphone(534, "Redmi Note 11", 70_000, "Xiaomi");

        manager.add(book2);
        manager.add(book3);
        manager.add(smartphone1);
        manager.removeById(221);

        Product[] actual = manager.findAll();
        Product[] expected = {book2, book3};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldNotSearchProduct() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);

        Book book1 = new Book(552, "It", 150,"S. King");
        Book book2 = new Book(724, "Harry Potter and the Half-Blood Prince",500, "J. Rowling");
        Book book3 = new Book(351, "Harry Potter and the Deathly Hallows", 200, "J. Rowling");
        Book book4 = new Book(112, "The Little Prince", 350, "A. Exupery");
        Smartphone smartphone1 = new Smartphone(221, "Iphone 11", 53_000, "Apple");
        Smartphone smartphone2 = new Smartphone(429,"Samsung A22", 60_000, "Samsung");
        Smartphone smartphone3 = new Smartphone(534, "Redmi Note 11", 70_000, "Xiaomi");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(book4);
        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);

        Product[] actual = manager.searchBy("This");
        Product[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldSearchOneProduct() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);

        Book book1 = new Book(552, "It", 150,"S. King");
        Book book2 = new Book(724, "Harry Potter and the Half-Blood Prince",500, "J. Rowling");
        Book book3 = new Book(351, "Harry Potter and the Deathly Hallows", 200, "J. Rowling");
        Book book4 = new Book(112, "The Little Prince", 350, "A. Exupery");
        Smartphone smartphone1 = new Smartphone(221, "Iphone 11", 53_000, "Apple");
        Smartphone smartphone2 = new Smartphone(429,"Samsung A22", 60_000, "Samsung");
        Smartphone smartphone3 = new Smartphone(534, "Redmi Note 11", 70_000, "Xiaomi");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(book4);
        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);

        Product[] actual = manager.searchBy("It");
        Product[] expected = {book1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldSearchTwoProducts() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);

        Book book1 = new Book(552, "It", 150,"S. King");
        Book book2 = new Book(724, "Harry Potter and the Half-Blood Prince",500, "J. Rowling");
        Book book3 = new Book(351, "Harry Potter and the Deathly Hallows", 200, "J. Rowling");
        Book book4 = new Book(112, "The Little Prince", 350, "A. Exupery");
        Smartphone smartphone1 = new Smartphone(221, "Iphone 11", 53_000, "Apple");
        Smartphone smartphone2 = new Smartphone(429,"Samsung A22", 60_000, "Samsung");
        Smartphone smartphone3 = new Smartphone(534, "Redmi Note 11", 70_000, "Xiaomi");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(book4);
        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);

        Product[] actual = manager.searchBy("Harry Potter");
        Product[] expected = {book2, book3};

        Assertions.assertArrayEquals(expected, actual);
    }


}
