package com.application.rest.service;

import com.application.rest.entities.Maker;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public interface IMakerService {

    List<Maker> findAll();
    Optional<Maker> findById(Long id);
    void save(Maker maker);
    void deleteById(Long id);
}
