package com.example.arraylist.exercise4;
public class Book {   
        private String bookID;
        private String bookName;
        private String bookAuthor;
        private int bookPages;
        private String bookGenre;
        private double bookRating;
        private String bookPublishedYear;
        private String bookPublisher;
        private double bookPrice;
        private int copies;

        public Book(String bookID, String bookName, String bookAuthor, int bookPages, String bookGenre,
                    double bookRating, String bookPublishedYear, String bookPublisher, double bookPrice, int copies) {
            this.bookID = bookID;
            this.bookName = bookName;
            this.bookAuthor = bookAuthor;
            this.bookPages = bookPages;
            this.bookGenre = bookGenre;
            this.bookRating = bookRating;
            this.bookPublishedYear = bookPublishedYear;
            this.bookPublisher = bookPublisher;
            this.bookPrice = bookPrice;
            this.copies = copies;
        }

        public String getBookID() {
            return bookID;
        }

        public void setBookID(String bookID) {
            this.bookID = bookID;
        }

        public String getBookName() {
            return bookName;
        }

        public void setBookName(String bookName) {
            this.bookName = bookName;
        }

        public String getBookAuthor() {
            return bookAuthor;
        }

        public void setBookAuthor(String bookAuthor) {
            this.bookAuthor = bookAuthor;
        }

        public int getBookPages() {
            return bookPages;
        }

        public void setBookPages(int bookPages) {
            this.bookPages = bookPages;
        }

        public String getBookGenre() {
            return bookGenre;
        }

        public void setBookGenre(String bookGenre) {
            this.bookGenre = bookGenre;
        }

        public double getBookRating() {
            return bookRating;
        }

        public void setBookRating(double bookRating) {
            this.bookRating = bookRating;
        }

        public String getBookPublishedYear() {
            return bookPublishedYear;
        }

        public void setBookPublishedYear(String bookPublishedYear) {
            this.bookPublishedYear = bookPublishedYear;
        }

        public String getBookPublisher() {
            return bookPublisher;
        }

        public void setBookPublisher(String bookPublisher) {
            this.bookPublisher = bookPublisher;
        }

        public double getBookPrice() {
            return bookPrice;
        }

        public void setBookPrice(double bookPrice) {
            this.bookPrice = bookPrice;
        }

        public int getCopies() {
            return copies;
        }

        public void setCopies(int copies) {
            this.copies = copies;
        }

        @Override
        public String toString() {
            return "Book ID: " + bookID + "\n" +
                    "Book Name: " + bookName + "\n" +
                    "Book Author: " + bookAuthor + "\n" +
                    "Book Pages: " + bookPages + "\n" +
                    "Book Genre: " + bookGenre + "\n" +
                    "Book Rating: " + bookRating + "\n" +
                    "Book Published Year: " + bookPublishedYear + "\n" +
                    "Book Publisher: " + bookPublisher + "\n" +
                    "Book Price: " + bookPrice + "\n" +
                    "Book Copies: " + copies;
        }
    }





