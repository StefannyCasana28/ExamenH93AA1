package com.example.examenweb1.interfa;

import com.example.examenweb1.entity.AlumnosEntity;
import com.example.examenweb1.entity.CursosEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursosInterface extends CrudRepository<CursosEntity,Integer> {
}
