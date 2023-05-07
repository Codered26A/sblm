package org.sblm.lib.eservice;

import org.sblm.lib.dto.Book;
import org.sblm.lib.edao.AdminDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService{

    @Autowired
    private AdminDao adminDao;

    @Override
    public boolean addNewBook(Book newBook) {
        return adminDao.addNewBook(newBook);
    }

    @Override
    public boolean updateBook(Book oldBook) {
        return adminDao.updateBook(oldBook);
    }
}
