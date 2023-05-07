package org.sblm.lib.edao;

import org.modelmapper.ModelMapper;
import org.sblm.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private ModelMapper modelMapper;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public boolean demandForDiscount() {
        return false;
    }

    @Override
    public List<org.sblm.lib.dto.Book> displayBook() {
        /*String jpql = "select b from Book b";

        TypedQuery<Book> query = entityManager.createQuery(jpql, Book.class);
        List<Book> resultList = query.getResultList();
        List<org.sblm.lib.dto.Book> collectBooks = resultList.stream().map(book -> {
            return modelMapper.map(book, org.sblm.lib.dto.Book.class);
        }).collect(Collectors.toList());*/

        List<Book> all = studentRepository.findAll();
        List<org.sblm.lib.dto.Book> collectBooks = all.stream().map(book -> {
            return modelMapper.map(book, org.sblm.lib.dto.Book.class);
        }).collect(Collectors.toList());
        return collectBooks;
    }

    @Override
    public boolean requestForBook(org.sblm.lib.dto.Book book) {
        return false;
    }
}
