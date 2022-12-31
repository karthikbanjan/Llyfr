package com.banjan.llyfr.repository;

import com.banjan.llyfr.model.EBook;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EBookRepository extends CrudRepository<EBook, UUID> {

    Page<EBook> findAll(Pageable pageable);
}