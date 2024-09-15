package com.jonas.one_piece.services.imp;

import com.jonas.one_piece.entity.Fruits;
import com.jonas.one_piece.models.DTO.FruitsRequestDTO;
import com.jonas.one_piece.models.DTO.FruitsResponseDTO;
import com.jonas.one_piece.repository.FruitsRepository;
import org.apache.coyote.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FruitsServiceImp {

    @Autowired
    private FruitsRepository fruitsRepository;

    public Fruits createFruit(FruitsRequestDTO request) {
        Fruits fruits = new Fruits(request);
        return this.fruitsRepository.save(fruits);
    }

    public List<Fruits> listFruits(){
        return this.fruitsRepository.findAll();
    }

}
