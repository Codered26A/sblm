package org.sblm.lib.edao;

import org.sblm.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Book, Long> {
}
