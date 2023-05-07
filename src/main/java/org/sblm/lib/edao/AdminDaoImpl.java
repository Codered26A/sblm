package org.sblm.lib.edao;

import org.modelmapper.ModelMapper;
import org.sblm.lib.dto.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Repository
public class AdminDaoImpl implements AdminDao{

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private EntityManager entityManager;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    @Transactional
    public boolean addNewBook(Book newBook) {
        org.sblm.lib.entity.Book book = modelMapper.map(newBook, org.sblm.lib.entity.Book.class);
        org.sblm.lib.entity.Book save = bookRepository.save(book);
        if(null != save) {
            return true;
        }
        return false;
    }

    @Override
    @javax.transaction.Transactional
    public boolean updateBook(Book oldBook) {
        org.sblm.lib.entity.Book book = modelMapper.map(oldBook, org.sblm.lib.entity.Book.class);
        org.sblm.lib.entity.Book merge = entityManager.merge(book);
        if(null != merge) {
            return true;
        }
        return false;
    }
}
