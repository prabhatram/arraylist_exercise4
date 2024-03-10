package com.example.arraylist.exercise4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class InventoryTests {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final InputStream originalIn = System.in;
    private Inventory inventory;

    @Before
    public void setUp() {
        inventory = new Inventory();
        System.setOut(new PrintStream(outContent));

    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    @Test
    public void testAddingBooks() {

        inventory.addBooks("010", "Pride and Prejudice", "Jane Austen", 279, "Romance", 4.3, "1813", "Modern Library", 10, 100);
        inventory.addBooks("011", "Wuthering Heights", "Emily Bronte", 464, "Romance", 3.89, "1847", "Penguin", 15, 100);
        inventory.addBooks("012", "Dracula", "Bram Stoker", 488, "Horro", 4.01, "1897", "Norton", 20, 100);
        inventory.addBooks("013", "Robinson Crusoe", "Daniel Defoe", 320, "Adventure", 3.68, "1719", "Modern Library", 10, 100);
        inventory.addBooks("014", "A Clockwork Orange", "Anthony Burgess", 240, "Science Fiction", 4.00, "1962", "W. W. Norton & Company", 22, 100);
        
        assertEquals("Inventory should contain 2 books.", 5, inventory.books.size());
        
    }

    @Test
    public void testRemovingBooks() {

        inventory.addBooks("015", "Pride and Prejudice", "Jane Austen", 279, "Romance", 4.3, "1813", "Modern Library", 10, 100);
        inventory.addBooks("016", "Wuthering Heights", "Emily Bronte", 464, "Romance", 3.89, "1847", "Penguin", 15, 100);
        inventory.addBooks("017", "Dracula", "Bram Stoker", 488, "Horro", 4.01, "1897", "Norton", 20, 100);
        inventory.addBooks("018", "Robinson Crusoe", "Daniel Defoe", 320, "Adventure", 3.68, "1719", "Modern Library", 10, 100);
        inventory.addBooks("019", "A Clockwork Orange", "Anthony Burgess", 240, "Science Fiction", 4.00, "1962", "W. W. Norton & Company", 22, 100);
        
        boolean bookRemoved = true;
        assertEquals("The book was removed.", bookRemoved, inventory.removeBooks("018"));
    }

    @Test
    public void testFindingBooks(){

        boolean bookFound = true;
        inventory.addBooks("010", "Pride and Prejudice", "Jane Austen", 279, "Romance", 4.3, "1813", "Modern Library", 10, 100);
        assertEquals("The book was found.", bookFound, inventory.findBooks("010"));
    }

    @Test
    public void testDisplayBooks(){

        Inventory inventory = new Inventory();
        
        Book book1 = new Book("010", "Pride and Prejudice", "Jane Austen", 279, "Romance", 4.3, "1813", "Modern Library", 10, 100);
        Book book2 = new Book("011", "Wuthering Heights", "Emily Bronte", 464, "Romance", 3.89, "1847", "Penguin", 15, 100);
        inventory.books.add(book1);
        inventory.books.add(book2);

        inventory.displayBooks();

        String expectedOutput = book1.toString() + "\n" + book2.toString() + "\n";
        assertEquals(expectedOutput, outContent.toString());    
    }

    @Test
    public void testUpdatingBooks() {

        Inventory inventory = new Inventory();

        
        Book book = new Book("022", "1984", "George Orwell", 368, "Science Fiction", 4.19, "1949", "Plume", 25, 500);
        inventory.books.add(book);

        
        inventory.updateBooks("022", "Animal Farm", "null", 0, "null", 0.0, "null", "null", 0.0, 0);

        
        assertEquals("Animal Farm", book.getBookName());
        assertEquals("George Orwell", book.getBookAuthor());
        assertEquals(368, book.getBookPages());
        assertEquals("Science Fiction", book.getBookGenre());
        assertEquals(4.19, book.getBookRating(), 0.01);
        assertEquals("1949", book.getBookPublishedYear());
        assertEquals("Plume", book.getBookPublisher());
        assertEquals(25.0, book.getBookPrice(), 0.01);
        assertEquals(500, book.getCopies());
        
    }  
}