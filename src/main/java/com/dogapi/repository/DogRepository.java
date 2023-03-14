package com.dogapi.repository;

import com.dogapi.model.Dog;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;

@Repository
public class DogRepository {
    private Map<Integer, Dog> dogMap = new HashMap<>();

    DogRepository() {
        dogMap.put(1, new Dog(1, "A", 2d, "Cool", 10d, 10));
        dogMap.put(2, new Dog(2, "B", 3d, "Fierce", 11d, 9));
        dogMap.put(3, new Dog(3, "C", 4d, "Bark", 12d, 8));
        dogMap.put(4, new Dog(4, "D", 5d, "Angry", 13d, 7));
        dogMap.put(5, new Dog(5, "E", 6d, "Cool", 14d, 9));
    }

    public Dog findById(int id) {
        return dogMap.get(id);
    }

    public List<Dog> findByIds(List<Integer> list) {
        List<Dog> dogList = new ArrayList<>();

        list.forEach(x -> dogList.add(dogMap.get(x)));
        return dogList.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }
}
