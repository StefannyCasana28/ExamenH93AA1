package com.example.examenweb1.interfa;

import com.example.examenweb1.entity.MatriculaEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatriculaInterface extends CrudRepository<MatriculaEntity, Integer> {
}
