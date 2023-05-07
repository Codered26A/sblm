package org.sblm.lib.edao;

import org.sblm.lib.dto.Book;
import org.springframework.stereotype.Repository;


public interface AdminDao {
    public boolean addNewBook(Book newBook);
    public boolean updateBook(Book oldBook);
}
