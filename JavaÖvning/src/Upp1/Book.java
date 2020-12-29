package Upp1;

/**
 * Created by Hodei Eceiza
 * Date: 12/28/2020
 * Time: 21:16
 * Project: JavaÖvning
 * Copyright: MIT
 */
public class Book {
    private String title;
    private String author;
    private String genre;
    private String color;
    private int qualification;
    private String owner;
    private boolean isFactOrFiction;

    public Book(String title, String author, String genre, String color, int qualification, String owner, boolean isFactOrFiction) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.color = color;
        this.qualification = qualification;
        this.owner = owner;
        this.isFactOrFiction = isFactOrFiction;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getQualification() {
        return qualification;
    }

    public void setQualification(int qualification) {
        this.qualification = qualification;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public boolean isFactOrFiction() {
        return isFactOrFiction;
    }

    public void setFactOrFiction(boolean factOrFiction) {
        isFactOrFiction = factOrFiction;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", color='" + color + '\'' +
                ", qualification=" + qualification +
                ", owner='" + owner + '\'' +
                ", isFactOrFiction=" + isFactOrFiction +
                "}\n";
    }
}
