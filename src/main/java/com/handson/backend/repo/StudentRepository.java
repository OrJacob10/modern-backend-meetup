package com.handson.backend.repo;

import com.handson.backend.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
    List<Student> findAllBySatScoreGreaterThan(Integer satScore);
}
