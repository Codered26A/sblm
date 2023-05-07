package org.sblm.lib.edao;

import org.sblm.lib.dto.Book;

import java.util.List;

public interface UserDao {
    List<Book> displayBook();
    boolean requestForBook(Book book);
}
