package com.library;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {

    // [Exercise 2]: Derived Query Methods
    List<Book> findByTitle(String title);
    List<Book> findByAuthor(String author);

    // [Exercise 4]: Custom JPQL Query
    @Query("SELECT b FROM Book b WHERE b.price > :minPrice")
    List<Book> findPremiumBooks(@Param("minPrice") double minPrice);

    // [Exercise 4]: Native SQL Query
    @Query(value = "SELECT * FROM books WHERE LOWER(title) LIKE LOWER(CONCAT('%', :keyword, '%'))", nativeQuery = true)
    List<Book> searchByTitleKeyword(@Param("keyword") String keyword);
}