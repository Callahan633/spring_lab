package com.morozov.spring.repositories;

import com.morozov.spring.model.Education;
import org.springframework.data.repository.CrudRepository;

public interface EducationRepository extends CrudRepository<Education, Integer> {
}
