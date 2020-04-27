package com.tutorials.springboot.learning.service.impl;

import com.tutorials.springboot.learning.dto.DogDTO;
import com.tutorials.springboot.learning.entity.Dog;
import com.tutorials.springboot.learning.repository.DogRepository;
import com.tutorials.springboot.learning.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class DogServiceImpl implements DogService {
    @Autowired
    DogRepository dogRepo;

    @Override
    public void saveDogDetails(DogDTO dog) {
        dogRepo.save(convertDTO(Collections.singletonList(dog)).get(0));
    }

    @Override
    public DogDTO findDogDetail(int id) {
        Optional<Dog> byId = dogRepo.findById(id);
        return byId.map(dog -> convertEntity(Collections.singletonList(dog)).get(0)).orElse(null);
    }

    @Override
    public List<DogDTO> getDogsDetail() {
        return convertEntity(dogRepo.findAll());
    }

    @Override
    public void saveAllDogs(List<DogDTO> dogs) {
        dogRepo.saveAll(convertDTO(dogs));
    }

    private List<DogDTO> convertEntity(List<Dog> dogs) {
        return dogs.stream().map(dog -> new DogDTO(dog.getId(), dog.getBreed(), dog.getAge(), dog.getColor())).collect(Collectors.toList());
    }

    private List<Dog> convertDTO(List<DogDTO> dogDTOS) {
        return dogDTOS.stream().map(dogDTO -> new Dog(dogDTO.getBreed(), dogDTO.getAge(), dogDTO.getColor())).collect(Collectors.toList());
    }

}
