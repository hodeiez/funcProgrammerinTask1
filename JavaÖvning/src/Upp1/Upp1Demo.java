package Upp1;

import java.text.Collator;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Hodei Eceiza
 * Date: 12/28/2020
 * Time: 21:29
 * Project: JavaÖvning
 * Copyright: MIT
 */
public class Upp1Demo {
    public List<Book> booksByAuthor(String author, List<Book> books){
       return books.stream().filter(book ->book.getAuthor().equalsIgnoreCase(author)).collect(Collectors.toList());
    }
    public List<Book> booksByColor(String color, List<Book> books){
        return books.stream().filter(book->book.getColor().equalsIgnoreCase(color)).collect(Collectors.toList());
    }
    public int myBookAmount(String myName,List<Book> books){
        return books.stream().filter(book->book.getOwner().equalsIgnoreCase(myName)).collect(Collectors.toList()).size();
    }
    //1b
    //I it should be only a map of all the books, not the ones I won, but whatever....
    public List<String> myBooksTitles(String myName,List<Book> books){
        return books.stream().filter(book->book.getOwner().equalsIgnoreCase(myName)).map(Book::getTitle).collect(Collectors.toList());
    }
    public List<String> myBooksAuthors(String myName,List<Book> books){
        return books.stream().filter(book->book.getOwner().equalsIgnoreCase(myName)).map(Book::getAuthor).distinct().collect(Collectors.toList());
    }
    //1c
    public List<String> allTheTitles(List<List<Book>>books){
        return books.stream().flatMap(Collection::stream).map(Book::getTitle).collect(Collectors.toList());
    }
    //1d
    public int getQualificationAverage(List<Book>books){
        return books.stream().map(Book::getQualification).reduce(0,(f, s)->f+s/books.size());
    }
    public String allTitleInString(List<Book> books){
        return books.stream().map(Book::getTitle).reduce("",(f, s)->f+s+", ");
    }
    //1e
    public int myQualificationsAverage(String myName,List<Book> books){
        return books.stream().filter(book->book.getOwner().equalsIgnoreCase(myName)).collect(Collectors.toList())
                .stream().mapToInt(q->q.getQualification()).sum()/books.size();
    }
    public int amountOfMyBooksWithColor(String myName,String color,List<Book> books){
        return (int)books.stream().filter(book->book.getOwner().equalsIgnoreCase(myName)).collect(Collectors.toList())
                .stream().filter(book->book.getColor().equalsIgnoreCase(color)).count();
    }
    public boolean isTimFerrissBook(List<Book> books){
        return books.stream().anyMatch(book->book.getAuthor().equalsIgnoreCase("Tim Ferriss"));
    }
    //1f
    public List<Book> sortByRate(List<Book> books){
        return books.stream().sorted((b1,b2)-> ((Integer)b1.getQualification()).compareTo(b2.getQualification())).collect(Collectors.toList());
    }
    public List<String> sortByTitle(List<Book>books){
        return books.stream().map(Book::getTitle).sorted(Collator.getInstance(new Locale("sv","SE"))).collect(Collectors.toList());
    }
//1g
    public String getTitlesString(List<Book>books){
        return books.stream().map(Book::getTitle).collect(Collectors.joining(",","",""));
    }
    //1h
    public Map<Boolean,List<Book>> partitionByFact(List<Book>books){
        return books.stream().collect(Collectors.partitioningBy(book->book.isFactOrFiction()==true));
    }
    public void factBooks(){
        partitionByFact(BookUtils.getList()).forEach((k, v)-> System.out.println(k+" "+v.stream().collect(Collectors.toList())));
    }
    public Map<String,List<Book>> partitionByAuthor(List<Book> books){
        return books.stream().collect(Collectors.groupingBy(book->book.getAuthor()));
    }
    public void byAuthor(){
        partitionByAuthor(BookUtils.getList()).forEach((k, v)-> System.out.println(k + " "+ v.stream().collect(Collectors.toList())));
    }
    //by color its same as byAuthor...
    public static void main(String[] args) {
       Upp1Demo test=new Upp1Demo();
        System.out.println(test.booksByAuthor("hodei", BookUtils.getList()));
        System.out.println(test.myBooksTitles("hodei", BookUtils.getList()));
        System.out.println(test.myBooksAuthors("hodei", BookUtils.getList()));
        System.out.println(test.getQualificationAverage(BookUtils.getList()));
        System.out.println(test.allTitleInString(BookUtils.getList()));
        System.out.println(test.myQualificationsAverage("hodei", BookUtils.getList()));
        System.out.println(test.amountOfMyBooksWithColor("hodei","red", BookUtils.getList()));
        System.out.println(test.sortByTitle(BookUtils.getList()));
        System.out.println(test.sortByRate(BookUtils.getList()));
        System.out.println(test.getTitlesString(BookUtils.getList()));
        test.factBooks();
        test.byAuthor();
    }
}
