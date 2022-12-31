package com.banjan.llyfr.service;

import com.banjan.llyfr.model.EBook;
import com.banjan.llyfr.repository.EBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class EBookService {

    private final EBookRepository eBookRepository;

    public EBookService(@Autowired EBookRepository eBookRepository) {
        this.eBookRepository = eBookRepository;
    }

    public void save(EBook eBook) {
        eBookRepository.save(eBook);
    }

    public Optional<EBook> findById(UUID uuid) {
        return eBookRepository.findById(uuid);
    }

    public Page<EBook> findAll(Integer pageNumber, Integer pageSize) {
        Pageable pageable = PageRequest.of(pageNumber, pageSize);
        return eBookRepository.findAll(pageable);
    }
}
