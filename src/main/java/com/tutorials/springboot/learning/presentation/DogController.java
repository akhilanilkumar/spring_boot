package com.tutorials.springboot.learning.presentation;

import com.tutorials.springboot.learning.dto.DogDTO;
import com.tutorials.springboot.learning.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/dogs")
public class DogController {

    @Autowired
    DogService dogService;

    @GetMapping
    public List<DogDTO> list() {
        return dogService.getDogsDetail();
    }

    @PostMapping
    public void create(@RequestBody DogDTO dogDTO) {
        dogService.saveDogDetails(dogDTO);
    }

    @GetMapping("{id}")
    public DogDTO get(@PathVariable("id") int id) {
        return dogService.findDogDetail(id);
    }


    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public void update(@PathVariable Integer id, @RequestBody DogDTO dogDTO) {
        dogService.update(id, dogDTO);
    }

    @DeleteMapping(value = "{id}")
    public void delete(@PathVariable Integer id) {
        dogService.delete(id);
    }

    @PostMapping("/bulkSave")
    public void create(@RequestBody List<DogDTO> dogs) {
        dogService.saveAllDogs(dogs);
    }

}
