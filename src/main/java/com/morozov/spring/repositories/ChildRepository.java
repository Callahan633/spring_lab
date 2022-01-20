package com.morozov.spring.repositories;

import com.morozov.spring.model.Child;
import org.springframework.data.repository.CrudRepository;

public interface ChildRepository extends CrudRepository<Child, Integer> {
}
