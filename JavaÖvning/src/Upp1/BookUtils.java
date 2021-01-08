package Upp1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hodei Eceiza
 * Date: 12/28/2020
 * Time: 21:21
 * Project: JavaÖvning
 * Copyright: MIT
 */
public class BookUtils {
    public static List<Book> getList(){
        ArrayList<Book> books = new ArrayList();
        books.add(new Book("Titel1","hodei","essay","red",10,"hodei",true));
        books.add(new Book("Titel5","hodei","essay","red",1,"hodei",true));
        books.add(new Book("Titel2","hodei","essay","blue",4,"juan",true));
        books.add(new Book("Titel3","billie","drama","red",10,"jane",false));
        books.add(new Book("Titel4","jon","essay","green",10,"hodei",true));
        return books;
    }
}
