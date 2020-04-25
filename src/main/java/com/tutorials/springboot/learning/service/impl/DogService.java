package com.tutorials.springboot.learning.service.impl;

import com.tutorials.springboot.learning.dto.DogDTO;

import java.util.List;

public interface DogService {
    void saveDogDetails(DogDTO dog);

    DogDTO findDogDetail(int id);

    List<DogDTO> getDogsDetail();

    void saveAllDogs(List<DogDTO> dogs);
}
