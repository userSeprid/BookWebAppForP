package com.seprid.books.repository;

import com.seprid.books.entity.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transactions, Integer> {

    List<Transactions> findAll();
}
