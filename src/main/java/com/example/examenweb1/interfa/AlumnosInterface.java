package com.example.examenweb1.interfa;

import com.example.examenweb1.entity.AlumnosEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnosInterface extends CrudRepository<AlumnosEntity,Integer> {
}
