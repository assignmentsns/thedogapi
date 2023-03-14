package com.dogapi.service;

import com.dogapi.model.Dog;
import com.dogapi.repository.DogRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DogService {

    private DogRepository dogRepository;

    public DogService(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }

    public Dog findById(int id) {
        return dogRepository.findById(id);
    }

    public List<Dog> findByIds(String id) {
        List<Integer> list = Arrays.stream(id.split(","))
                .map(x -> Integer.valueOf(x))
                .collect(Collectors.toList());
        return dogRepository.findByIds(list);
    }
}
