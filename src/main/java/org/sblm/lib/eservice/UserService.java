package org.sblm.lib.eservice;

import org.sblm.lib.dto.Book;

import java.util.List;

public interface UserService {

    List<Book> displayBook();
    boolean requestForBook(Book book);
}
