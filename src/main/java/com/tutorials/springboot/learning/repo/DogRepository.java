package com.tutorials.springboot.learning.repo;

import com.tutorials.springboot.learning.entity.Dog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DogRepository extends JpaRepository<Dog, Integer> {
}
