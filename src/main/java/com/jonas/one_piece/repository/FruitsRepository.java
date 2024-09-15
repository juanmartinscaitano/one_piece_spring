package com.jonas.one_piece.repository;

import com.jonas.one_piece.entity.Fruits;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FruitsRepository extends JpaRepository<Fruits, Integer> {
}
