package com.tutorials.springboot.learning.presentation;

import com.tutorials.springboot.learning.dto.DogDTO;
import com.tutorials.springboot.learning.service.impl.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DogController {

    @Autowired
    DogService dogService;

    @PostMapping("/saveDetails")
    public void saveDogDetails(@RequestBody DogDTO dog) {
        dogService.saveDogDetails(dog);
    }

    @PostMapping("/bulkSave")
    public void bulkSave(@RequestBody List<DogDTO> dogs) {
        dogService.saveAllDogs(dogs);
    }

    @GetMapping("/getDetails")
    public List<DogDTO> getDetails() {
        return dogService.getDogsDetail();
    }

    @GetMapping(value = "/getDetails/{id}")
    public DogDTO getDetailsById(@PathVariable("id") int id) {
        return dogService.findDogDetail(id);
    }

}
