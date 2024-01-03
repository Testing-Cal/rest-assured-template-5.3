package com.example.demo.service;

import com.example.demo.entity.DetailsEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DetailsService {
    void createDetails();
    List<DetailsEntity> getDetails();
}
