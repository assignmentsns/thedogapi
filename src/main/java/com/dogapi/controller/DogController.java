package com.dogapi.controller;

import com.dogapi.model.Dog;
import com.dogapi.service.DogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController ("api/v1")
public class DogController {

    private DogService dogService;

    public DogController(DogService dogService) {
        this.dogService = dogService;
    }
    @GetMapping("breed/{breed_id}")
    public Dog getBreedForId(@PathVariable("breed_id") String id) {
        return dogService.findById(Integer.valueOf(id));
    }

    @GetMapping("breeds")
    public List<Dog> getDogBreeds(@RequestParam(name = "ids") String ids) {
        return dogService.findByIds(ids);
    }
}
