package com.example.Bookstoremanagement.Repository;

import com.example.Bookstoremanagement.Entity.MyBookList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface MyBookRepository extends JpaRepository<MyBookList,Integer> {
}
