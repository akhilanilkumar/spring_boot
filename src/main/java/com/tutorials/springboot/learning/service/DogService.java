package com.tutorials.springboot.learning.service;

import com.tutorials.springboot.learning.dto.DogDTO;

import java.util.List;

public interface DogService {

    /**
     * Add dog's details
     *
     * @param dog DTO
     */
    void saveDogDetails(DogDTO dog);

    /**
     * Find dog details by ID
     *
     * @param id
     * @return
     */
    DogDTO findDogDetail(int id);

    /**
     * Get all records
     *
     * @return
     */
    List<DogDTO> getDogsDetail();

    /**
     * Save list of records
     *
     * @param dogs
     */
    void saveAllDogs(List<DogDTO> dogs);

    /**
     * Delete a record
     *
     * @param id
     */
    void delete(Integer id);

    /**
     * Update a record
     *
     * @param id
     * @param dog
     */
    void update(Integer id, DogDTO dog);
}
