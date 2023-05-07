package org.sblm.lib.eservice;

import org.sblm.lib.dto.Book;

public interface AdminService {
    public boolean addNewBook(Book newBook);
    public boolean updateBook(Book oldBook);
}
