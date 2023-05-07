package org.sblm.lib.eservice;

import org.sblm.lib.dto.Book;
import org.sblm.lib.edao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public boolean demandForDiscount() {
        return false;
    }

    @Override
    public List<Book> displayBook() {
        return studentDao.displayBook();
    }

    @Override
    public boolean requestForBook(Book book) {
        return false;
    }
}
